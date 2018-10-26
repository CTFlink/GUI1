package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Button btZ = new Button("Attack Zombie");
        Button btP = new Button ("Attack Plant");
        Scene scene = new Scene (btZ, 200, 250);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
        Stage stage = new Stage();
        Scene scene2 = new Scene (btP, 200, 250);
        stage.setScene (scene2);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
