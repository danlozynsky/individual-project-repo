package com.example.individualprojectrepo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LifeSimulatorController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}