package com.unit6.GUIJavaFx.class2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("VBox");
		
		VBox vBox = new VBox(20);
		Button btn1  = new Button("Submit");
		Button btn2 = new Button("Cancel");
		vBox.getChildren().addAll(btn1, btn2);
		
		Scene scene = new Scene(vBox, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
