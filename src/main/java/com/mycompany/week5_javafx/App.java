package com.mycompany.week5_javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        Rectangle r = new Rectangle();
        r.setX(500);
        r.setY(350);
        r.setFill(Color.AQUA);
        r.setWidth(100);
        r.setHeight(100);
        
        Circle circle = new Circle(100, 300, 50, Color.RED);
        
        Rectangle r2 = new Rectangle();
        r2.setX(0);
        r2.setY(0);
        r2.setFill(Color.LIGHTGREEN);
        r2.setWidth(75);
        r2.setHeight(25);
        
        Button btn = new Button();
        btn.setText("Click Me");
        btn.setLayoutX(200);
        btn.setLayoutY(200);
        Label label = new Label("Hello, Luke");
        
        Line ln = new Line(0,0, 300, 400);
        Group qp = new Group(r2, label, btn, ln, r, circle);
        
        Scene scene = new Scene(qp, 640, 480);
        stage.setScene(scene);
        stage.setTitle("My First GUI");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}