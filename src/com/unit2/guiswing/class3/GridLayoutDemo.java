package com.unit2.guiswing.class3;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GridLayoutDemo extends JFrame {

	public GridLayoutDemo() {
		setTitle("Grid Layout Demo");
		setBounds(10, 10, 300, 300);
		
		GridLayout layout = new GridLayout(5, 1);
		setLayout(layout);
		
		JLabel lblFirstName = new JLabel("First Name : ");
		JTextField txtFirstName  = new JTextField(20);
		
		JLabel lblPassword = new JLabel("Password : ");
		JPasswordField txtPassword  = new JPasswordField(20);
		
		JButton btnSubmit = new JButton("Submit : ");
		
		add(lblFirstName);
		add(txtFirstName);
		
		add(lblPassword);
		add(txtPassword);
		
		add(btnSubmit);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new GridLayoutDemo();
	}
}
