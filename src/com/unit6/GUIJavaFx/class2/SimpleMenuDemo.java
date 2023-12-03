package com.unit6.GUIJavaFx.class2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleMenuDemo extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Simple Menu");

		// Create a MenuBar
		MenuBar menuBar = new MenuBar();

		// Create a Menu
		Menu fileMenu = new Menu("File");
		MenuItem newItem = new MenuItem("New");
		MenuItem openItem = new MenuItem("Open");
		MenuItem saveItem = new MenuItem("Save");
		MenuItem exitItem = new MenuItem("Exit");
		fileMenu.getItems().addAll(newItem, openItem, saveItem, exitItem);
		menuBar.getMenus().add(fileMenu);

		VBox layout = new VBox();
		layout.getChildren().addAll(menuBar);

		Scene scene = new Scene(layout, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
