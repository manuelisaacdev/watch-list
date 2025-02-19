package com.watchlist;

import com.watchlist.controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class WatchListApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(WatchListApplication.class.getResource(MainController.VIEW));
        Pane root = fxmlLoader.load();
        Scene scene = new Scene(root, root.getPrefWidth(), root.getPrefHeight());
        stage.setTitle("WatchList");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}