package com.unit2.guiswing.class1;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class JFrameCreationUsingObject{
	
	public static void main(String[] args) {
	
		JFrame frame = new JFrame();
		frame.setTitle("JFrame Creation Using Object");
		frame.setBounds(20, 50, 500, 600);
		frame.setLayout(null);
		
		Container container = frame.getContentPane();
		container.setBackground(Color.GREEN);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
