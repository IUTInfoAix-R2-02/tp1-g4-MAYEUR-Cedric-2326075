package com.example.partiel;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BonjourFenetre extends Application {

    // Label affichant le message de bienvenue
    private Label text;

    // Champ de saisi du nom de l'utilisateur
    private TextField nameField;

    // Bouton déclenchant la mise à jour du texte
    private Button button;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox b1 = new VBox();
        b1.setAlignment(Pos.CENTER);

        this.text = new Label("Bonjour à tous !");
        b1.getChildren().add(text);

        // Ajout d'un champ de saisi de texte de taille 180 pixels
        this.nameField = new TextField("Veuillez saisir un nom");
        nameField.setMaxWidth(180.0d);
        nameField.setFont( Font.font("Courier", FontWeight.NORMAL, 12) );
        //nameField.setOnAction( actionEvent -> handleButonClick(actionEvent) );
        b1.getChildren().add( nameField );

        // Ajout d'un bouton avec du texte
        //ImageView btnImg = new ImageView("TP2/img.png");
        this.button = new Button();
        b1.getChildren().addAll(button);
        Image image = new Image(("TP2/img.png").toString());

        // Création d'un composant avec l'image peinte à l'intérieur
        ImageView iv = new ImageView();
        iv.setImage(image);

        // Intégration de l'image dans le bouton
        button.setGraphic( iv );

        // Changement du texte après un clic sur le bouton
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, new ButtonClickHandler(text, nameField) );




        // Création de la scene
        Scene scene = new Scene(b1);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello application");
        primaryStage.setWidth(400);
        primaryStage.setHeight(400);
        primaryStage.show();
    }


}