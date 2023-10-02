package com.unit2.guiswing.class2;

import java.awt.Color;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class SwingMenuAndOhterComponents extends JFrame {
	
	public SwingMenuAndOhterComponents() {
		
		setTitle("Swing Components...");
		setBounds(10, 10, 500, 600);
		setLayout(null);
		
		//menu
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 10, 500, 40);
		
		JMenu fileMenu = new JMenu("File ");
		
		JMenu fileNewMenu = new JMenu("New ");
		JMenuItem fileNewMenuJavaProj = new JMenuItem("New Project");
		JMenuItem fileNewMenuProj = new JMenuItem("Project");
		fileNewMenu.add(fileNewMenuJavaProj);
		fileNewMenu.add(fileNewMenuProj);
		
		
		JMenuItem fileOpenMenu = new JMenuItem("Open... ");
		JMenuItem fileExitMenu = new JMenuItem("Exit ");
		fileMenu.add(fileNewMenu);
		fileMenu.add(fileOpenMenu);
		fileMenu.add(fileExitMenu);
		
		JMenu editMenu = new JMenu("Edit ");
		JMenu sourceMenu = new JMenu("Source ");
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(sourceMenu);
		add(menuBar);
		
		
		//tree
		
		DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Departments");
		
		DefaultMutableTreeNode child1Root = new DefaultMutableTreeNode("BCA");
		DefaultMutableTreeNode child1RootChild1 = new DefaultMutableTreeNode("BCA-I");
		DefaultMutableTreeNode child1RootChild2 = new DefaultMutableTreeNode("BCA-II");
		child1Root.add(child1RootChild1);
		child1Root.add(child1RootChild2);
		
		
		DefaultMutableTreeNode child2Root = new DefaultMutableTreeNode("CSIT");
		DefaultMutableTreeNode child3Root = new DefaultMutableTreeNode("BE");
		
		rootNode.add(child1Root);
		rootNode.add(child2Root);
		rootNode.add(child3Root);
		
		JTree departmentsTree = new JTree(rootNode);
		departmentsTree.setBounds(10, 50, 200, 590);
		
		add(departmentsTree);
		
		/*
		//fileChooser
		JFileChooser fileChooser = new JFileChooser();
		int flag = 0;
		if((flag = fileChooser.showOpenDialog(this)) != 0) {
			//event handling 
		}
		*/

		Color color = JColorChooser.showDialog(this, "Choose Color", Color.GRAY);
		getContentPane().setBackground(color);
		
	
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new SwingMenuAndOhterComponents();
	}
}
