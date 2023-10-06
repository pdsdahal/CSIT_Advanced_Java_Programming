package com.unit3.eventhandling.class1;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KeyEventDemo extends JFrame implements KeyListener{

	JTextField txtFirst, txtSecond;
	JTextField txtResult;

	public KeyEventDemo() {
		setBounds(10, 10, 300, 600);
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT, 20, 20);
		setLayout(layout);

		txtFirst = new JTextField(20);
		txtSecond = new JTextField(20);

		txtResult = new JTextField("Result : ");
		txtResult.addKeyListener(this);
		
		add(txtFirst);
		add(txtSecond);
		add(txtResult);

		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new KeyEventDemo();
	}

	public void keyTyped(KeyEvent e) {
		Container container =  getContentPane();
		container.setBackground(Color.green);
	}

	public void keyPressed(KeyEvent e) {
		double num1 = Double.parseDouble(txtFirst.getText());
		double num2 = Double.parseDouble(txtSecond.getText());
		double result = 0.0;
		result = num1 + num2;
		txtResult.setText(""+result);
	}

	public void keyReleased(KeyEvent e) {
		double num1 = Double.parseDouble(txtFirst.getText());
		double num2 = Double.parseDouble(txtSecond.getText());
		double result = 0.0;
		result = num1 - num2;
		txtResult.setText(""+result);
	}

}
