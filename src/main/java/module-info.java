module cz.kaduch.fxlearning {
    requires javafx.controls;
    requires javafx.fxml;


    opens cz.kaduch.fxlearning to javafx.fxml;
    exports cz.kaduch.fxlearning;
}