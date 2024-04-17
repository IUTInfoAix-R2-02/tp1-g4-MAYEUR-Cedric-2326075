package fr.amu.iut.exercice6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.BufferedReader;

public class IHMPendu extends Application {

    private int nbVie = 7;

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox();

        //création éléments
        Label pendu = new Label();
        Label nbDeVie = new Label();
        Text motCacher = new Text();
        Button btnRejouer = new Button("Rejouer");
        //clavier
        TextField claviertmp = new TextField();
        GridPane clavier = new GridPane();
        //lettre clavier
        Button a = new Button("a");
        Button b = new Button("b");
        Button c = new Button("c");
        Button d = new Button("d");
        Button e = new Button("e");
        Button f = new Button("f");
        Button g = new Button("g");
        Button h = new Button("h");
        Button i = new Button("i");
        Button j = new Button("j");
        Button k = new Button("k");
        Button l = new Button("l");
        Button m = new Button("m");
        Button n = new Button("n");
        Button o = new Button("o");
        Button p = new Button("p");
        Button q = new Button("q");
        Button r = new Button("r");
        Button s = new Button("s");
        Button t = new Button("t");
        Button u = new Button("u");
        Button v = new Button("v");
        Button w = new Button("w");
        Button x = new Button("x");
        Button y = new Button("y");
        Button z = new Button("z");

        clavier.setAlignment(Pos.CENTER);
        clavier.add(a, 2, 0);
        clavier.add(e, 3, 0);
        clavier.add(i, 4, 0);
        clavier.add(o, 5, 0);
        clavier.add(u, 6, 0);
        clavier.add(y, 7, 0);

        clavier.add(b, 0, 1);
        clavier.add(c, 1, 1);
        clavier.add(d, 2, 1);
        clavier.add(f, 3, 1);
        clavier.add(g, 4, 1);
        clavier.add(h, 5, 1);
        clavier.add(j, 6, 1);
        clavier.add(k, 7, 1);
        clavier.add(l, 8, 1);
        clavier.add(m, 9, 1);

        clavier.add(n, 0, 2);
        clavier.add(p, 1, 2);
        clavier.add(q, 2, 2);
        clavier.add(r, 3, 2);
        clavier.add(s, 4, 2);
        clavier.add(t, 5, 2);
        clavier.add(v, 6, 2);
        clavier.add(w, 7, 2);
        clavier.add(x, 8, 2);
        clavier.add(z, 9, 2);
        a.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        b.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        c.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        d.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        e.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        f.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        g.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        h.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        i.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        j.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        k.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        l.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        m.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        n.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        o.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        p.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        q.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        r.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        s.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        t.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        u.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        v.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        w.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        x.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        y.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");
        z.setStyle("-fx-background-color: #e6dec8, #d9faf6; -fx-text-fill: #62c7b4;-fx-font-size: 16px;");




        //Button.setStroke(Color.BLACK);



        root.getChildren().addAll(pendu,nbDeVie, motCacher, clavier, btnRejouer);

        //impport img pendu
        ImageView pendu0 = new ImageView("exercice6/pendu0.png");
        ImageView pendu1 = new ImageView("exercice6/pendu1.png");
        ImageView pendu2 = new ImageView("exercice6/pendu2.png");
        ImageView pendu3 = new ImageView("exercice6/pendu3.png");
        ImageView pendu4 = new ImageView("exercice6/pendu4.png");
        ImageView pendu5 = new ImageView("exercice6/pendu5.png");
        ImageView pendu6 = new ImageView("exercice6/pendu6.png");
        ImageView pendu7 = new ImageView("exercice6/pendu7.png");
        ImageView penduWin = new ImageView("exercice6/penduWin.png");

        //config pendu
        pendu.setGraphic(pendu7);

        //config nbDeVie
        nbDeVie.setText("Nombre de vies : " + nbVie);

        //config motCacher
        motCacher.setText("** non implémenter **");

        //config clavier
        clavier.resize(10,10);




        //forme
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #d8fbf6;");
        VBox.setMargin(btnRejouer, new Insets(20,0,0,0));     //ordre margin : haut,droite,bas,gauche
        VBox.setMargin(motCacher, new Insets(20,0,20,0));     //ordre margin : haut,droite,bas,gauche

        //affichage
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Jeu du pendu");
        primaryStage.setWidth(500);
        primaryStage.setHeight(550);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
