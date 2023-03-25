module com.game.guessingnumbergame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.game.guessingnumbergame to javafx.fxml;
    exports com.game.guessingnumbergame;
}