package com.unit6.GUIJavaFx.class1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneLayout extends Application {

	public void start(Stage primaryStage) throws Exception {
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(new Label("Top"));
		borderPane.setBottom(new Label("Bottom"));
		borderPane.setCenter(new Label("Center"));
		borderPane.setLeft(new Label("Left"));
		borderPane.setRight(new Label("Right"));

		Scene scene = new Scene(borderPane, 500, 600);

		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("This is Demo.");
	}

	public static void main(String[] args) {
		launch(args);
	}
}
