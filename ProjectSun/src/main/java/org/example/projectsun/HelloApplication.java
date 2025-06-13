package org.example.projectsun;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);
        Image icon = new Image("sun.png");
        stage.getIcons().add(icon);
        stage.setTitle("Project Sun");
        stage.setScene(scene);
        stage.setWidth(500);
        stage.setHeight(500);
        //stage.setX(50);
        //stage.setY(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("You need to press s");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("s"));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}