package com.unit2.guiswing.class3;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FlowLayoutDemo extends JFrame {

	public FlowLayoutDemo() {
		setTitle("Flow Layout Demo");
		setBounds(10, 10, 300, 600);
		
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT, 10, 10);
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
		new FlowLayoutDemo();
	}
}
