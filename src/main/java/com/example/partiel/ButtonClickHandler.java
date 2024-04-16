package com.example.partiel;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ButtonClickHandler implements EventHandler<Event> {

    private Label text;
    private TextField nameField;

    public ButtonClickHandler(Label helloLabel, TextField nameField) {
        this.text = helloLabel;
        this.nameField = nameField;
    }

    @Override
    public void handle(Event event) {
        // Utiliser le Label récupéré
        text.setText( "Bonjour à toi, "+nameField.getText() );
    }
}