package com.mycompany.week6_gui_demo2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class App extends Application {
    Label label;
    TextField tf1;
    TextField tf2;

    @Override
    public void start(Stage stage) {
        label = new Label("Sum will appear here");
        label.setLayoutX(300);
        label.setLayoutY(200);
        
        /*Button btn1 = new Button("Click me");
        btn1.setLayoutX(50);
        btn1.setLayoutY(50);
        btn1.setOnAction(v -> {
            label.setText("I clicked the btn" + ((Button)v.getSource()).getText());
        });*/
        
        Button btn2 = new Button("Click me");
        btn2.setLayoutX(300);
        btn2.setLayoutY(100);
        btn2.setOnAction( this::processBtn2 );
        
        tf1 = new TextField(" ");
        tf1.setLayoutX(100);
        tf1.setLayoutY(100);
        
        tf2 = new TextField(" ");
        tf2.setLayoutX(100);
        tf2.setLayoutY(200);
        
        Group gp = new Group(label, btn2, tf1, tf2);
        var scene = new Scene(gp, 640, 480);
        stage.setScene(scene);
        stage.setTitle("GUI Demo 2");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    
    private void processBtn2(ActionEvent arg0){
        String cntnt1 = tf1.getText().trim();
        int num1 = Integer.parseInt(cntnt1);
        //tf1.setText("" + num1 * 1000);
        
        String cntnt2 = tf2.getText().trim();
        int num2 = Integer.parseInt(cntnt2);
        
        int newNum = num1+num2;
        String numString = Integer.toString(newNum);
        label.setText(numString);
        
        label.setTextFill(Color.RED);
    }

}