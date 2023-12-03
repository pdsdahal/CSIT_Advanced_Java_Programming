package com.unit6.GUIJavaFx.class2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("HBox");
		
		HBox hBox = new HBox(20);
		Button btn1  = new Button("Submit");
		Button btn2 = new Button("Cancel");
		hBox.getChildren().addAll(btn1, btn2);
		
		Scene scene = new Scene(hBox, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
