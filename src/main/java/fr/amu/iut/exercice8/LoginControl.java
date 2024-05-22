package fr.amu.iut.exercice8;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class LoginControl extends GridPane {

    @FXML
    private PasswordField pwd;

    @FXML
    private TextField idField;

    @FXML
    private Button okButton;

    @FXML
    private Button cancelButton;

    @FXML
    private void okClicked() {
        System.out.println(idField.getText());
        System.out.println(pwd.getText());
    }

    @FXML
    private void cancelClicked() {
        idField.setText("");
        pwd.setText("");
    }
}