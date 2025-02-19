package com.watchlist.controller;

import javafx.fxml.Initializable;
import lombok.extern.slf4j.Slf4j;

import java.net.URL;
import java.util.ResourceBundle;

@Slf4j
public class MainController implements Initializable {
    public static final String VIEW = "/fxml/Main.fxml";

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        log.info("Initializing MainController");
    }

}
