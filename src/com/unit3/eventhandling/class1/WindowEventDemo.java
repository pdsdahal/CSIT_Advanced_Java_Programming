package com.unit3.eventhandling.class1;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WindowEventDemo extends JFrame implements WindowListener {

	public WindowEventDemo() {
		setBounds(10, 10, 500, 600);
		setTitle("Window Event Handling");
		addWindowListener(this);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void windowOpened(WindowEvent e) {
		System.out.println("Window Opened");
	}

	public void windowClosing(WindowEvent e) {
		JOptionPane.showConfirmDialog(this, "Do you really want to exit?");
		System.exit(0);
	}

	public void windowClosed(WindowEvent e) {
		System.out.println("Window Closed");

	}

	public void windowIconified(WindowEvent e) {
		System.out.println("Window Iconified");

	}

	public void windowDeiconified(WindowEvent e) {
		System.out.println("Window Deiconified");
	}

	public void windowActivated(WindowEvent e) {
		System.out.println("Window Activated");
	}

	public void windowDeactivated(WindowEvent e) {
		System.out.println("Window Deactivated");
	}
	
	public static void main(String[] args) {
		new WindowEventDemo();
	}

}
