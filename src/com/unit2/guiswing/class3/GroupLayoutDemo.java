package com.unit2.guiswing.class3;

import java.awt.Container;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.Group;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GroupLayoutDemo extends JFrame{

	JLabel lblUserName, lblAddress;
	JTextField txtUserName, txtAddress;
	JButton btnSubmit;
	
	GroupLayoutDemo(){
		
		setBounds(10, 10, 500, 600);
		Container container = getContentPane();
		GroupLayout gl = new GroupLayout(container);
		container.setLayout(gl);
		
		lblUserName = new JLabel("UserName : ");
		txtUserName = new JTextField(20);
		
		lblAddress = new JLabel("Address : ");
		txtAddress = new JTextField(20);
		
		btnSubmit = new JButton("Submit");
		
		//HorizontalGroup
		Group hg = gl.createSequentialGroup();
		hg.addGroup(gl.createParallelGroup(
				Alignment.TRAILING)
				.addComponent(lblUserName)
				.addComponent(lblAddress));
		
		hg.addGroup(gl.createParallelGroup()
				.addComponent(txtUserName)
				.addComponent(txtAddress)
				.addComponent(btnSubmit));
		
		//VerticalGroup
		Group hv = gl.createSequentialGroup();
		hv.addGroup(gl.createParallelGroup(
				Alignment.BASELINE)
				.addComponent(lblUserName)
				.addComponent(txtUserName));
		
		hv.addGroup(gl.createParallelGroup(
				Alignment.BASELINE)
				.addComponent(lblAddress)
				.addComponent(txtAddress));
		
		hv.addGroup(gl.createParallelGroup(
				Alignment.BASELINE)
				.addComponent(btnSubmit));		
		
		gl.setHorizontalGroup(hg);
		gl.setVerticalGroup(hv);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new GroupLayoutDemo();
	}
	
	
}
