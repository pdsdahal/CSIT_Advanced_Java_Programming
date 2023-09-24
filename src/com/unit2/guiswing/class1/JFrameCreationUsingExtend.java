package com.unit2.guiswing.class1;

import javax.swing.JFrame;

public class JFrameCreationUsingExtend extends JFrame {
	
	public JFrameCreationUsingExtend() {
		setTitle("JFrame Creation Using Extend");
		setBounds(20, 50, 500, 600);
		setLayout(null);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JFrameCreationUsingExtend();
	}
}
