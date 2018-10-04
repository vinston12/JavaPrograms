package projektcikgierka;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JFrame;


public class everything extends JFrame {
	public static final int HEIGHT = 500, WEIGHT = 500;
	public Rectangle champion;
	public int score = 0;
	public Canvas canvas;
	public static everything championb;

	public everything(){
		
		JFrame frame = new JFrame();
		frame.setSize(HEIGHT,WEIGHT);
		frame.setTitle("jakas gierka");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		canvas.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		canvas.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.add(canvas);
		
		champion = new Rectangle(WIDTH / 2 -5, HEIGHT / 2 - 5, 30, 30);
		
		
		
	}
	
	public static void main(String[] args) {		
		championb = new everything();

	}
	

}
