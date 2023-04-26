package cz.kaduch.fxlearning;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root= FXMLLoader.load(getClass().getResource("hello-view.fxml"));
primaryStage.setTitle("Hello Wrold");
primaryStage.setScene(new Scene(root,800,500));
primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}