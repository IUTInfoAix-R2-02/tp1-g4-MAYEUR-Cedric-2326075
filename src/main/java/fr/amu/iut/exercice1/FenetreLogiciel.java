package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Création du conteneur principal
        BorderPane gridpane = new BorderPane();

        // Création du conteneur correspondant à la ligne de contrôle haut dessus du tableau
        VBox topControls = new VBox();
        topControls.setAlignment( Pos.TOP_LEFT );

        MenuItem item1 = new MenuItem("New");
        MenuItem item2 = new MenuItem("Open");
        MenuItem item3 = new MenuItem("Save");
        MenuItem item4 = new MenuItem("Close");
        MenuItem item5 = new MenuItem("Cut");
        MenuItem item6 = new MenuItem("Copy");
        MenuItem item7 = new MenuItem("Paste");
        SeparatorMenuItem separator = new SeparatorMenuItem();

        Menu menuFile = new Menu("File");
        menuFile.getItems().addAll(item1, separator, item2, separator, item3, separator, item4);
        Menu menuEdit = new Menu("Edit");
        menuFile.getItems().addAll(item5, separator, item6, separator, item7);
        Menu menuHelp = new Menu("Help");
        MenuBar menuBar = new MenuBar(menuFile, menuEdit, menuHelp);

        topControls.getChildren().addAll( menuBar );

        //bouton gauche
        HBox btn = new HBox();
        btn.setAlignment( Pos.CENTER_LEFT );
        Text btnText = new Text();
        btnText.setText("Boutons :");
        Button btn1 = new Button("Bouton 1");
        Button btn2 = new Button("Bouton 2");
        Button btn3 = new Button("Bouton 3");

        btn.getChildren().addAll(btnText, btn1, btn2, btn3);

        // Création du centre
        Text name = new Text("Name");
        TextField nameText = new TextField();
        Text email = new Text("Email");
        TextField emailText = new TextField();
        Text password = new Text("Password");
        TextField passwordText = new TextField();

        //cree bouton
        Button btnSubmit = new Button("Submit");
        Button btnCancel = new Button("Cancel");

        GridPane centre = new GridPane();

        centre.setAlignment(Pos.CENTER);

        //alignement
        centre.add(name, 0, 0);
        centre.add(nameText, 1, 0);
        centre.add(email, 0, 1);
        centre.add(emailText, 1, 1);
        centre.add(password, 0, 2);
        centre.add(passwordText, 1, 2);
        centre.add(btnSubmit, 0, 3);
        centre.add(btnCancel, 1, 3);


        // Création de la ligne de séparation
        Separator sep = new Separator();

        // Création du bandeau en bas de la fenêtre
        Text basdepage = new Text();
        basdepage.setText("Ceci est un label de bas de page");
        basdepage.textAlignmentProperty();


        // Ajout des contrôleurs au conteneur principal
        gridpane.getChildren().addAll(
                topControls,
                sep,
                centre,
                sep,
                basdepage
        );

        //marge
        //VBox.setMargin( topControls, new Insets(10.0d) );
        //VBox.setMargin( tblCustomers, new Insets(0.0d, 10.0d, 10.0d, 10.0d) );
        //VBox.setMargin( bottomControls, new Insets(10.0d) );

        // Ajout du conteneur à la scene
        Scene scene = new Scene(gridpane);

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("VBox and HBox App");

        // Affichage de la fenêtre
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}

