package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.Objects;

public class MainController {

    String value = "";
    int item;
    boolean isOperand;
    boolean isResult;
    @FXML
    private TextField textField;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;

    @FXML
    public void btn1Click(ActionEvent actionEvent) {
        if (!isResult) {
            value += button1.getText();
            textField.setText(value);
        }
    }

    @FXML
    public void btn2Click(ActionEvent actionEvent) {
        if (!isResult) {
            value += button2.getText();
            textField.setText(value);
        }
    }

    @FXML
    public void btn3Click(ActionEvent actionEvent) {
        if (!isResult) {
            value += button3.getText();
            textField.setText(value);
        }
    }

    @FXML
    public void btnAddClick(ActionEvent actionEvent) {
        if (!Objects.equals(value, "")) {
            item = Integer.parseInt(value);
            value = "";
            isOperand = true;
            isResult = false;
            textField.setText(value);
        }
    }

    @FXML
    public void btnResultClick(ActionEvent actionEvent) {
        if (isOperand) {
            isOperand = false;
            isResult = true;
            value = String.valueOf(item + Integer.parseInt(value));
            textField.setText(value);
        }
    }

    @FXML
    public void btnResetClick(ActionEvent actionEvent) {
        isOperand = false;
        isResult = false;
        value = "";
        textField.setText(value);
    }
}