package com.watchlist;

import com.watchlist.controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.ResourceBundle;

public class WatchListApplication extends Application {
    public static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle("bundles.bundle");

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(WatchListApplication.class.getResource("/fxml/Main.fxml"), RESOURCE_BUNDLE, new JavaFXBuilderFactory(), object -> new MainController(stage));
        Pane root = fxmlLoader.load();
        Scene scene = new Scene(root, root.getPrefWidth(), root.getPrefHeight(), Color.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setTitle("WatchList");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}