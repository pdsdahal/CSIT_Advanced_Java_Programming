package com.unit2.guiswing.class3;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GridBagLayoutDemo extends JFrame {

	public GridBagLayoutDemo() {
		setTitle("GridBag Layout Demo");
		setBounds(10, 10, 500, 300);
		
		GridBagLayout layout = new GridBagLayout();
		setLayout(layout);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		JLabel lblFirstName = new JLabel("First Name : ");
		add(lblFirstName, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		JTextField txtFirstName  = new JTextField(20);
		add(txtFirstName, gbc);

		JLabel lblPassword = new JLabel("Password : ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(lblPassword,gbc);
		
		JPasswordField txtPassword  = new JPasswordField(20);
		gbc.gridx = 1;
		gbc.gridy = 1;
		add(txtPassword, gbc);
		
		JButton btnSubmit = new JButton("Submit");
		gbc.gridx = 0;
		gbc.gridy = 2;
		add(btnSubmit, gbc);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new GridBagLayoutDemo();
	}
}
