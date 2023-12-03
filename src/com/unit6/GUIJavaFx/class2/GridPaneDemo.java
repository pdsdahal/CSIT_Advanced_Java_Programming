package com.unit6.GUIJavaFx.class2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("GridPane");
		
		GridPane gridPane = new GridPane(10, 10);
		Button btn1  = new Button("Submit");
		gridPane.add(btn1, 0, 0);
		
		Button btn2 = new Button("Cancel");
		gridPane.add(btn2, 1, 0);

		
		Scene scene = new Scene(gridPane, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
