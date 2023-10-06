package com.unit3.eventhandling.class1;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ItemEventDemo extends JFrame implements ItemListener {

	JComboBox<String> cmBoxDepartents;

	public ItemEventDemo() {
		setBounds(10, 10, 300, 600);
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT, 20, 20);
		setLayout(layout);

		String[] departments = { "BCA", "CSIT", "IT", "BE" };
		cmBoxDepartents = new JComboBox<>(departments);
		cmBoxDepartents.addItemListener(this);

		add(cmBoxDepartents);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new ItemEventDemo();
	}

	public void itemStateChanged(ItemEvent e) {

		if (e.getStateChange() > 0) {
			
			int index = cmBoxDepartents.getSelectedIndex();
			String selectedValue = cmBoxDepartents.getSelectedItem().toString();
			System.out.println("Seleted Item is : " + selectedValue);
		}
	}
}
