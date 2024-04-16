package fr.amu.iut.exercice2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Random;

public class TicTacToe extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane root = new GridPane();

        // Ajout du conteneur à la scene
        Scene scene = new Scene(root);



        root.setAlignment(Pos.CENTER);
        //alignement
        Label l1 = new Label();
        Label l2 = new Label();
        Label l3 = new Label();
        Label l4 = new Label();
        Label l5 = new Label();
        Label l6 = new Label();
        Label l7 = new Label();
        Label l8 = new Label();
        Label l9 = new Label();

        //random
        Random random = new Random();
        int nombre = random.nextInt(3);

        //set graphique
        ImageView croix = new ImageView("exercice2/Croix.png");
        ImageView rond = new ImageView("exercice2/Rond.png");
        ImageView vide = new ImageView("exercice2/Vide.png");
        l1.setGraphic(croix);
        l2.setGraphic(vide);
        l3.setGraphic(vide);
        l4.setGraphic(vide);
        l5.setGraphic(rond);
        l6.setGraphic(vide);
        l7.setGraphic(vide);
        l8.setGraphic(vide);
        l9.setGraphic(rond);

        root.add(l1, 0, 0);
        root.add(l2, 1, 0);
        root.add(l3, 2, 0);
        root.add(l4, 1, 1);
        root.add(l5, 0, 1);
        root.add(l6, 2, 1);
        root.add(l7, 0, 2);
        root.add(l8, 1, 2);
        root.add(l9, 2, 2);



        primaryStage.initStyle(StageStyle.UTILITY);

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 300 );
        primaryStage.setHeight( 300 );
        primaryStage.setTitle("Tic Tac Toe");

        // Affichage de la fenêtre
        primaryStage.show();
    }
}