package com.unit2.guiswing.class1;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JFrameComponents extends JFrame {
	
	public JFrameComponents() {
		
		setTitle("JFrame Creation Using Extend");
		setBounds(10, 10, 500, 600);
		setLayout(null);
		
		//JLabel
		JLabel lblFirstName = new JLabel("First Name : ");
		lblFirstName.setBounds(10, 15, 100, 50);
		
		//JTextField
		JTextField txtFirstName = new JTextField();
		txtFirstName.setBounds(115,15,200,50);
		
		//JLabel
		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setBounds(10, 70, 100, 50);
		
		//JPasswordFiled
		JPasswordField txtPassword  = new JPasswordField();
		txtPassword.setBounds(115, 70, 200, 50);
		
		//JLabel
		JLabel lblDesc = new JLabel("Description : ");
		lblDesc.setBounds(10, 125, 100, 50);
		
		//JTextArea
		JTextArea txtDescription = new JTextArea();
		txtDescription.setBounds(115, 125, 300, 150);
		
		//JLabel
		JLabel lblLanguages = new JLabel("Langu. : ");
		lblLanguages.setBounds(10, 280, 100, 50);
				
		//CheckBox
		
		JCheckBox checkNepali = new JCheckBox("Nepali");
		checkNepali.setBounds(115, 280, 70, 50);
		
		JCheckBox checkEnglish = new JCheckBox("English");
		checkEnglish.setBounds(190, 280, 70, 50);
		
		//JLabel
		JLabel lblGender = new JLabel("Gender : ");
		lblGender.setBounds(10, 330, 100, 50);
			
		//JRadioButton
		JRadioButton btnMale = new JRadioButton("Male");
		btnMale.setBounds(115, 330, 70, 50);
		
		JRadioButton btnFeMale = new JRadioButton("FeMale");
		btnFeMale.setBounds(190, 330, 70, 50);
		
		//ButtonGroup
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(btnFeMale);
		genderGroup.add(btnMale);
		
		//JButton
		JButton btnSubmit = new JButton("Register");
		btnSubmit.setBounds(80, 390, 200, 50);
		
		
		add(lblFirstName);
		add(txtFirstName);
		add(lblPassword);
		add(txtPassword);
		add(lblDesc);
		add(txtDescription);

		add(lblLanguages);
		add(checkNepali);
		add(checkEnglish);
		add(lblGender);
		add(btnMale);
		add(btnFeMale);
		add(btnSubmit);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JFrameComponents();
	}
}
