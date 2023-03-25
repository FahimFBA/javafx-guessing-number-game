package com.game.guessingnumbergame;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class VerdictScreenController {

    @FXML
    private Circle LoosingCircle;

    @FXML
    private Label LossingLabel;

    @FXML
    private Label UserName;

    @FXML
    private Label Verdict;


    @FXML
    private Circle WinningCircle;

    @FXML
    private Label WinningLabel;

    boolean win;


    public void setVerdict(boolean win, String text) {
        this.win = win;
        if (win) {
            UserName.setText(text);
            Verdict.setText("You Won!");
            WinningCircle.setVisible(true);
            WinningLabel.setVisible(true);
            LoosingCircle.setVisible(false);
            LossingLabel.setVisible(false);
        } else {
            UserName.setText(text);
            Verdict.setText("You Lost!");
            WinningCircle.setVisible(false);
            WinningLabel.setVisible(false);
            LoosingCircle.setVisible(true);
            LossingLabel.setVisible(true);
        }
    }

}
