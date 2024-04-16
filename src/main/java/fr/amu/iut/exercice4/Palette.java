package fr.amu.iut.exercice4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Palette extends Application {

    private int nbVert = 1;
    private int nbRouge = 1;
    private int nbBleu = 1;

    private Button btnVert;
    private Button btnRouge;
    private Button btnBleu;

    private BorderPane root;
    private Label texte;
    private Pane panneau;
    private HBox btn;

    @Override
    public void start(Stage primaryStage) throws Exception {
        //création root
        this.root = new BorderPane();

        //création btn en bas
        this.btnVert = new Button("Vert");
        this.btnRouge = new Button("Rouge");
        this.btnBleu = new Button("Bleu");

        this.btn = new HBox();
        btn.getChildren().addAll(btnVert, btnRouge, btnBleu);
        btn.setAlignment(Pos.CENTER);
        HBox.setMargin( btnRouge, new Insets(10) );
        root.setBottom(btn);

        //création text haut
        this.texte = new Label();
        texte.setFont( Font.font("Arial", FontWeight.NORMAL, 20) );
        HBox top = new HBox(texte);
        top.setAlignment(Pos.CENTER);

        root.setTop(top);

        //création centre
        this.panneau = new Pane();
        panneau.setStyle("-fx-background-color: black;");
        root.setCenter(panneau);

        //event couleur centre
        btnVert.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            panneau.setStyle("-fx-background-color: green;");
            texte.setText("Vert choisi " + nbVert + " fois");
            nbVert = nbVert + 1 ;
        });
        btnRouge.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            panneau.setStyle("-fx-background-color: red;");
            texte.setText("Rouge choisi " + nbRouge + " fois");
            nbRouge = nbRouge + 1 ;
        });
        btnBleu.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            panneau.setStyle("-fx-background-color: blue;");
            texte.setText("Bleu choisi " + nbBleu + " fois");
            nbBleu = nbBleu + 1 ;
        });

        //utiliser en haut var
        //helloLabel.setText( "Bonjour à toi, "+nameField.getText() );

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);
        primaryStage.show();
    }
}

