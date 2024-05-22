module tp.intro.javafx {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    exports com.example.partiel;
    exports fr.amu.iut.exercice1;
    exports fr.amu.iut.exercice2;
    exports fr.amu.iut.exercice3;
    exports fr.amu.iut.exercice4;
    exports fr.amu.iut.exercice5;
    exports com.example.partie3;
    opens com.example.partie3 to javafx.fxml;
    opens exercice8 to javafx.fxml;
    exports fr.amu.iut.exercice6;
    exports fr.amu.iut.exercice7;
    exports fr.amu.iut.exercice8;
    exports fr.amu.iut.exercice9;
    opens exercice9 to javafx.fxml;

}
