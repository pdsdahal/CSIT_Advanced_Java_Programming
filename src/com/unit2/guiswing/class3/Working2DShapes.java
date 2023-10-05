package com.unit2.guiswing.class3;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Working2DShapes extends JPanel {

	public void paint(Graphics g) {
		super.paint(g);
	
		Graphics2D g2 = (Graphics2D) g;
		
		//line
		g2.drawLine(10, 10, 10, 100);
		//circle
		g2.drawOval(100, 10, 40, 40);
		
		//triangle
		int[] x = {100,150,50};
		int[] y = {100,200,200};
		g2.drawPolygon(x, y, 3);
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(10, 10, 500, 600);
		frame.add(new Working2DShapes());
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
