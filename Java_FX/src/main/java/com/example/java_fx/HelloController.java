package com.example.java_fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    public Button txtLicznik;
    int clickCounter = 0;
    
    @FXML
    private Label welcomeText;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }



    public void TextField(ActionEvent actionEvent) {
        System.out.println("Klikniecie nr " + ++clickCounter);
        

    }
}