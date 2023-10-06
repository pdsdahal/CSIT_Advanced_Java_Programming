package com.unit2.guiswing.class4;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletDemo extends Applet  implements ActionListener {

	Button btn;
	public void init() {
		btn = new Button("Change background");
		btn.addActionListener(this);
		add(btn);
	}
	
	public void paint(Graphics g) {
		g.drawString("Texas International College", 10, 10);
	}

	public void actionPerformed(ActionEvent e) {
		setBackground(Color.RED);
	}
}
