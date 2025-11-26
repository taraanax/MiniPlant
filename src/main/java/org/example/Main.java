package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Plant plant;

    private Label statsLabel;

    @Override
    public void start(Stage stage) {
        plant = new Plant();

        statsLabel = new Label(updateStatsText());

        Button waterButton = new Button("Water");
        waterButton.setOnAction(e -> {
            plant.waterPlant();
            statsLabel.setText(updateStatsText());
        });

        Button sunButton = new Button("Sun");
        sunButton.setOnAction(e -> {
            plant.giveSun();
            statsLabel.setText(updateStatsText());
        });

        HBox buttonBox = new HBox(10, waterButton, sunButton);

        BorderPane root = new BorderPane();
        root.setCenter(statsLabel);
        root.setBottom(buttonBox);

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("Mini Plant 🌱");
        stage.setScene(scene);
        stage.show();
    }

    private String updateStatsText() {
        return "Health: " + plant.getHealth() +
                "\nWater: " + plant.getWater() +
                "\nSun: " + plant.getSun() +
                "\nHappiness: " + plant.getHappiness();
    }

    public static void main(String[] args) {
        launch();
    }
}

