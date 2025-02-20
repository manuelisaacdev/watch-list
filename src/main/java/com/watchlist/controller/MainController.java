package com.watchlist.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.net.URL;
import java.util.ResourceBundle;

@Slf4j
@RequiredArgsConstructor
public class MainController implements Initializable {
    private final Stage primaryStage;
    private Double xOffset = 0.0, yOffset = 0.0;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        log.info("Initializing MainController");

    }

    @FXML
    private void handleTopbarMousePressed(MouseEvent event) {
        xOffset = event.getSceneX();
        yOffset = event.getSceneY();
    }

    @FXML
    private void handleTopbarMouseDragged(MouseEvent event) {
        primaryStage.setX(event.getScreenX() - xOffset);
        primaryStage.setY(event.getScreenY() - yOffset);
    }

    //****************************************************************************************
    // Top bar actions
    //****************************************************************************************
    @FXML
    void handleExit() {
        Platform.exit();
    }

    @FXML
    void handleMinimize() {
        primaryStage.setIconified(true);
    }
}
