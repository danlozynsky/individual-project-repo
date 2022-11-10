package com.example.individualprojectrepo;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


import java.io.IOException;

public class LifeSimulatorApplication extends Application {

    private Pane root = new Pane();

    private Creature test_creature = new Creature(1280, 700, 10, 10,"test", Color.BLUE);

    private Parent createContent() {
        root.setPrefSize(1280, 720);

        root.getChildren().add(test_creature);

        return root;
    }

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Life Simulator");
        Scene scene = new Scene(createContent());
        stage.setScene(scene);
        stage.show();
    }

    private static class Creature extends Rectangle {

        boolean dead = false;
        final String type;

        Creature(int x, int y, int w, int h, String type, Color color) {
            super(w, h, color);

            this.type = type;
            setTranslateX(x);
            setTranslateY(y);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}