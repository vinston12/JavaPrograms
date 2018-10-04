package flappyBirdGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.text.StyledEditorKit.BoldAction;

public class MainFile extends JFrame implements ActionListener, MouseListener, KeyListener{
	
	public final int WIDTH = 800, HEIGHT = 800;
	public Rectangle bird;
	public int ticks, yMotion;
	public boolean gameOver, started;
	public int scoreIncrement = 0;
	public int score = 0;
	public ArrayList<Rectangle> column;
	public static MainFile flappyBir;
	public Random rand;
	
	
	
	
	
	public Renderowanie renderowanie;
	public MainFile() {
		JFrame frame = new JFrame();
		Timer timer = new Timer(20, this);
		
		renderowanie = new Renderowanie();
		rand = new Random();
		
		frame.add(renderowanie);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.addMouseListener(this);
		frame.addKeyListener(this);
		frame.setTitle("Flappy Bird");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setResizable(false);								//tworzenie okienka
		
		bird = new Rectangle(WIDTH / 2 -5, HEIGHT/ 2 - 5, 25 , 25); 	//nadanie obiektowi bird kszta?tu
		column = new ArrayList<Rectangle>(); 			//stworzenie kolumn za pomoc? implementacji tablicowej
		
		
			addColumn(true);	
			addColumn(true);
			addColumn(true);
			addColumn(true);				//dodawnie kolumn 
		
		
		timer.start();
		
	}
	public void addColumn(boolean start) {
		
		int space = 250;
		int width = 100;
		int height = 50 + rand.nextInt(300);
		if (start) {
			column.add(new Rectangle(WIDTH + width + column.size() *300, HEIGHT - height - 120, width, height));
			column.add(new Rectangle(WIDTH + width + (column.size() -1)*300, 0 , width, HEIGHT - height - space));
		}else
		{
		column.add(new Rectangle(column.get(column.size() -1).x + 600, HEIGHT - height - 120, width, height));
		column.add(new Rectangle(column.get(column.size() -1).x, 0 , width, HEIGHT - height - space));
		}
	}										//metoda w kt?rej umieszczone s? wymiary kolumn
	
	public void jump()
	{
		if (gameOver)
		{
			
			bird = new Rectangle(WIDTH / 2 -5, HEIGHT/ 2 - 5, 25 , 25);
			column.clear();
			yMotion = 1;
			score = 0;
			
				addColumn(true);	
				addColumn(true);
				addColumn(true);
				addColumn(true);
				
			gameOver = false;
		}
		if (!started)
		{
			started = true;
		}
		else if (!gameOver) 
		{
			if (yMotion > 0)
			{
				yMotion = 0;
			}
			yMotion -= 10;
		}
	}						//metoda odpowiadaj?ca za jeden skok obiektu bird
	
	public void repaint(Graphics g) {
		// background color
		g.setColor(Color.cyan);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		// bird
		g.setColor(Color.pink);
		g.setPaintMode();
		g.fillRect(bird.x, bird.y, bird.width, bird.height);
		
		//background elements
		g.setColor(Color.orange);
		g.fillRect(0, HEIGHT-120, WIDTH, 120);
		
		
		g.setColor(Color.green);
		g.fillRect(0, HEIGHT -120, WIDTH, 10);
		
	
		
		
		for (Rectangle columns : column) 
		{
			paintColumn(g, columns);
			
		}
		g.setColor(Color.white);
		g.setFont(new Font("SansSerif", 1, 100));
		if (!started)
		{
			g.drawString("Click to start!", 75, HEIGHT / 2 - 10);
		}
		if (gameOver)
		{
			g.drawString("Game Over!", 75, HEIGHT /2 -10);

		}
		if (!gameOver && started) {
			g.drawString(String.valueOf(score), WIDTH /2 -25, 100);
		}
		
		
		
	

	}
	public void paintColumn(Graphics g,Rectangle column) {
		g.setColor(Color.green.darker());
		g.fillRect(column.x, column.y, column.width, column.height);
	}
		
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		int speed = 10;
		
		ticks++;	
		if (started)
		{
		
		for (int i = 0; i<column.size();i++) 
		{
			Rectangle columns = column.get(i);

			columns.x -= speed;
		}
		
		
		if (ticks % 2 == 0 && yMotion < 15)
		{
			yMotion+=2;
		}
		for (int i = 0; i<column.size();i++) 
		{
			Rectangle columns = column.get(i);
			if (columns.x + columns.width < 0) 
			{
				column.remove(columns);
				
				if (columns.y == 0) 
				{
					addColumn(false);
				}
			}
			
		}
		
		
	
		
		bird.y+= yMotion;
		
		for ( Rectangle columns : column) 
			
		{
			
			if (columns.y == 0 && bird.x + bird.width  / 2 > columns.x + columns.width / 2 -5 && bird.x + bird.width / 2 < columns.x + columns.width / 2+ 5)
			{
				score++;
			}
			if (columns.intersects(bird))
			{
				gameOver = true;
				
				if (bird.x <= columns.x) 
				{
					bird.x = columns.x - bird.width;
					
				}
				else
				{
					if (columns.y != 0) 
					{
						bird.y = columns.y -bird.height;
					}
					else if (bird.y < columns.height)
					{
						bird.y = columns.height;
					}
				}
			}
		}
		if (bird.y > HEIGHT -120 || bird.y < 0) 
		{
			
			gameOver = true;
			
		}	
		}
		
		if (bird.y + yMotion >= HEIGHT -120)
		{
			bird.y = HEIGHT - 120 - bird.height;
		}
		
		
		
		renderowanie.repaint();
		
	}
	
		
public static void main (String[] args) {
	flappyBir = new MainFile();
}
@Override
public void mouseClicked(MouseEvent e) {
	jump();
}
@Override
public void mouseEntered(MouseEvent e) {}
@Override
public void mouseExited(MouseEvent e) {}
@Override
public void mousePressed(MouseEvent e) {}
@Override
public void mouseReleased(MouseEvent e) {}
@Override
public void keyPressed(KeyEvent q) {
	if (q.getKeyCode() == KeyEvent.VK_SPACE) {
		jump();
	}
	
}
@Override
public void keyReleased(KeyEvent q) {
}
	

@Override
public void keyTyped(KeyEvent q) {
	
	
}
}

