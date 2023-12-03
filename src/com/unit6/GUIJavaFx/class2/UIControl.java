package com.unit6.GUIJavaFx.class2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UIControl extends Application {

	Label lblUserName, lblPassword, lblGender, lblLanguage;
	TextField txtUsername;
	PasswordField txtPassword;
	RadioButton rdMale, rdFemale;
	CheckBox chkNepali, chkEnglish;
	Button btnSubmit;
	
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("JavaFx UI Controls");
		
		VBox vBox = new VBox(10);
		lblUserName = new Label("UserName : ");
		txtUsername = new TextField();
		
		lblPassword = new Label("Password : ");
		txtPassword = new PasswordField();
		
		lblGender = new Label("Gender");
		HBox genderBox = new HBox(20);
		
		ToggleGroup grp = new ToggleGroup();
		
		rdMale = new RadioButton("Male");
		rdMale.setToggleGroup(grp);

		rdFemale = new RadioButton("Female");
		rdFemale.setToggleGroup(grp);

		genderBox.getChildren().addAll(rdMale, rdFemale);
		
		lblLanguage = new Label("Languages : ");
		HBox languageBox = new HBox(20);
		chkNepali = new CheckBox("Nepali");
		chkEnglish = new CheckBox("English");
		languageBox.getChildren().addAll(chkNepali, chkEnglish);
		
		btnSubmit = new Button("Submit");
		
		
		vBox.getChildren().addAll(lblUserName, txtUsername, lblPassword, txtPassword,lblGender, genderBox,lblLanguage, languageBox, btnSubmit);
		
		Scene scene = new Scene(vBox, 400, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}	
}
