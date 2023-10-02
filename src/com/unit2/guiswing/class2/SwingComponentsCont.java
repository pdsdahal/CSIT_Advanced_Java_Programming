package com.unit2.guiswing.class2;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SwingComponentsCont extends JFrame {
	
	public SwingComponentsCont() {
		
		setTitle("Swing Components...");
		setBounds(10, 10, 500, 600);
		setLayout(null);
		
		//JLabel
		JLabel lblDeaprtment = new JLabel("Department : ");
		lblDeaprtment.setBounds(10, 10, 100, 40);
		
		//JComboBox
		String[] departments = {"CSIT","BCA","BE","BTech"};
		JComboBox<String> cmDepartment = new JComboBox<>(departments);
		cmDepartment.setBounds(120, 10, 150, 40);
		
		//JTable
		Object[][] rowData = {{1,"Ram Pandey", "BCA"},{2,"Shyam Shres","CSIT"}};
		Object[] columnNames = {"Id","Name","Department"};
		
		JTable studentTbl = new JTable(rowData, columnNames);
		JScrollPane scrollPane = new JScrollPane(studentTbl);
		scrollPane.setBounds(10, 60, 400, 200);
		
		JLabel lblStudents = new JLabel("Student List : ");
		lblStudents.setBounds(10, 270, 100, 40);
		
		//JList
		String[] stduentNames = {"Ram","Shayam","Hari"};
		JList<String> lstStudents = new JList<>(stduentNames);
		lstStudents.setBounds(120, 270 ,150, 100);
		
		//ConfirmDialog
		//JOptionPane.showConfirmDialog(this, "This is confirm dialog");
		
		//MessageDialog
		JOptionPane.showMessageDialog(this, "This is message Dialog");
		
		add(lblDeaprtment);
		add(cmDepartment);
		add(scrollPane);
		add(lblStudents);
		add(lstStudents);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new SwingComponentsCont();
	}
}
