package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class FenetreLogiciel extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Création du conteneur principal
        BorderPane root = new BorderPane();

        // Création de la ligne de séparation
        Separator sep = new Separator(Orientation.VERTICAL);
        Separator sep2 = new Separator(Orientation.HORIZONTAL);

        //création bouton left
        Text btnText = new Text();
        btnText.setText("Boutons :");
        Button btn1 = new Button("Bouton 1");
        Button btn2 = new Button("Bouton 2");
        Button btn3 = new Button("Bouton 3");

        VBox mLeft = new VBox();
        mLeft.getChildren().addAll(btnText, btn1,btn2,btn3);
        mLeft.setAlignment(Pos.CENTER);
        HBox Hsep = new HBox();
        Hsep.getChildren().addAll(mLeft, sep);
        root.setLeft(Hsep);


        //création bottom
        Text basdepage = new Text();
        basdepage.setText("Ceci est un label de bas de page");
        VBox bottom = new VBox();
        bottom.setAlignment(Pos.CENTER);
        bottom.getChildren().addAll(sep2, basdepage);
        root.setBottom(bottom);

        //création centre
        Text name = new Text("Name");
        TextField nameText = new TextField();
        Text email = new Text("Email");
        TextField emailText = new TextField();
        Text password = new Text("Password");
        TextField passwordText = new TextField();

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
        root.setCenter(centre);

        //création menu top
        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("File");
        Menu menuEdit = new Menu("Edit");
        Menu menuHelp = new Menu("Help");
        MenuItem item1 = new MenuItem("New");
        MenuItem item2 = new MenuItem("Open");
        MenuItem item3 = new MenuItem("Save");
        MenuItem item4 = new MenuItem("Close");
        MenuItem item5 = new MenuItem("Cut");
        MenuItem item6 = new MenuItem("Copy");
        MenuItem item7 = new MenuItem("Paste");
        menuFile.getItems().addAll(item1, item2, item3, item4);
        menuEdit.getItems().addAll(item5, item6, item7);

        menuBar.getMenus().addAll(menuFile, menuEdit, menuHelp);
        root.setTop(menuBar);

        VBox.setMargin( btn2, new Insets(5) );
        VBox.setMargin( btnText, new Insets(5) );
        VBox.setMargin( basdepage, new Insets(10) );
        GridPane.setMargin( btnCancel, new Insets(10) );
        GridPane.setMargin( email, new Insets(10) );

        // Ajout du conteneur à la scene
        Scene scene = new Scene(root);

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("Premier exemple manipulant les conteneurs");

        // Affichage de la fenêtre
        primaryStage.show();
    }


}