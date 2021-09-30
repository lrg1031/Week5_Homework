package com.mycompany.week5_javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        Button btn = new Button();
        btn.setText("Click Me");
        btn.setLayoutX(200);
        btn.setLayoutY(200);
        Label label = new Label("Hello, Luke");
        Line ln = new Line(0,0, 300, 400);
        Group qp = new Group(label, btn, ln);
        
        Scene scene = new Scene(qp, 640, 480);
        stage.setScene(scene);
        stage.setTitle("My First GUI");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}