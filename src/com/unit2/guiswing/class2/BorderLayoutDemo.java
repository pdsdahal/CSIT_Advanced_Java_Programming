package com.unit2.guiswing.class2;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo  extends JFrame{

	public BorderLayoutDemo() {
		setTitle("Border Layout...");
		setBounds(10, 10, 500, 600);
		
		BorderLayout borderLayout = new BorderLayout(10,10);
		setLayout(borderLayout);
		
		JButton btnEast = new JButton("East");
		JButton btnWest = new JButton("West");
		JButton btnNorth = new JButton("North");
		JButton btnSouth = new JButton("South");
		JButton btnCenter = new JButton("Center");
		
		add(btnNorth, BorderLayout.NORTH);
		add(btnWest, BorderLayout.WEST);
		add(btnSouth, BorderLayout.SOUTH);
		add(btnCenter, BorderLayout.CENTER);
		add(btnEast, BorderLayout.EAST);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new BorderLayoutDemo();
	}
	

}
