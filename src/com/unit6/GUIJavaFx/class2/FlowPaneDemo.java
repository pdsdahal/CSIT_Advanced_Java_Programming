package com.unit6.GUIJavaFx.class2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Flow Pane");
		
		FlowPane flowPane = new FlowPane(10,10);
		Button btn1  = new Button("Submit");
		Button btn2 = new Button("Cancel");
		flowPane.getChildren().addAll(btn1, btn2);
		
		Scene scene = new Scene(flowPane, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
