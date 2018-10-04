package flappyBirdGame;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Renderowanie extends JPanel{
	private static final long serialVersionUTD = 1L;
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			MainFile.flappyBir.repaint(g);
		}
}
