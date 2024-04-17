package fr.amu.iut.exercice5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JeuMain extends Application {

    private Scene scene;
    private BorderPane root;

    @Override
    public void start(Stage primaryStage) {

        this.root = new BorderPane();

        //Acteurs du jeu
        Obstacle obstacle = new Obstacle();
        Personnage pacman = new Pacman();
        Personnage fantome = new Fantome();
        // on positionne le fantôme 20 positions vers la droite
        fantome.setLayoutX(640-20);
        fantome.setLayoutY(480-20);
        obstacle.setX(200);
        obstacle.setY(140);
        obstacle.setWidth(60);
        obstacle.setHeight(300);
        obstacle.setFill(Color.DARKRED);
        obstacle.setStroke(Color.BLACK);
        //panneau du jeu
        Pane jeu = new Pane();
        jeu.setPrefSize(640, 480);
        jeu.getChildren().add(obstacle);
        jeu.getChildren().add(pacman);
        jeu.getChildren().add(fantome);
        root.setCenter(jeu);
        //on construit une scene 640 * 480 pixels
        scene = new Scene(root);

        //Gestion du déplacement du personnage
        deplacer(pacman, fantome, obstacle);

        primaryStage.setTitle("... Pac Man ...");

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Permet de gérer les événements de type clavier, pression des touches
     * pour le j1(up,down, right, left), pour le j2( z,q,s,d)
     *
     * @param j1
     * @param j2
     */



    private void deplacer(Personnage j1, Personnage j2, Obstacle o) {
        scene.setOnKeyPressed((KeyEvent event) -> {
            double j1X = j1.getLayoutX();
            double j1Y = j1.getLayoutY();
            double j2X = j2.getLayoutX();
            double j2Y = j2.getLayoutY();
            switch (event.getCode()) {
                case LEFT:
                    j1.deplacerAGauche();
                    break;
                case RIGHT:
                    j1.deplacerADroite(scene.getWidth());
                    break;
                case DOWN:
                    j1.deplacerEnBas(scene.getHeight());
                    break;
                case UP:
                    j1.deplacerEnHaut();
                    break;
                case Q:
                    j2.deplacerAGauche();
                    break;
                case D:
                    j2.deplacerADroite(scene.getWidth());
                    break;
                case S:
                    j2.deplacerEnBas(scene.getHeight());
                    break;
                case Z:
                    j2.deplacerEnHaut();
                    break;

            }



            if (j1.estEnCollision(j2) ) {
                System.out.println("Collision | Fin de partie");
                System.exit(1);
            }
            if (j1.estEnCollision2(o)) {
                System.out.println("pacman tape le mur....");
                j1.relocate(j1X,j1Y);
            }
            if (j2.estEnCollision2(o)) {
                System.out.println("la fantome tape le mur....");
                j2.relocate(j2X,j2Y);
            }

        });
    }


}
