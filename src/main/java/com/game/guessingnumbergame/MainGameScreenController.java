package com.game.guessingnumbergame;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Random;

public class MainGameScreenController {
    int random;
    int attempt = 2;
    @FXML
    private TextField UserName;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private Label label4;
    @FXML
    private Label attempts_left;

    @FXML
    private Circle circle_1;

    @FXML
    private Circle circle_2;

    @FXML
    private Circle circle_3;

    @FXML
    private Circle circle_4;

    @FXML
    private Label hiddenLabel;

    @FXML
    void GenerateButton(ActionEvent event) {
        random = (int) (Math.random() * 4 + 1);
        System.out.println(random);
        hiddenLabel.setText("Your Number is Generated. Guess the Number and select the proper Circle.");
    }

    @FXML
    void setSubmitButton(ActionEvent event) {
        String name = UserName.getText();
    }

    void CallVerdict(boolean win, int lastClickedCircle)
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("verdictscreen-view.fxml"));
            Parent root = fxmlLoader.load();
            VerdictScreenController controller = fxmlLoader.getController();
            controller.setVerdict(win, UserName.getText(), lastClickedCircle);
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void CircleClick(MouseEvent event) {
        Circle clickedCircle = (Circle) event.getSource();
        if (attempt > 0 && attempt <= 2)
        {
            attempt--;
            attempts_left.setText(attempt + "");
            if (clickedCircle == circle_1) {
                if (random == 1) {
                    System.out.println("You Won");
                    CallVerdict(true, 1);
                } else if (random != 2 && attempt == 0) {
                    System.out.println("You Lost");
                    CallVerdict(false, 1);
                } else {
                    System.out.println("You Lost");
                }
            } else if (clickedCircle == circle_2) {
                if (random == 2) {
                    System.out.println("You Won");
                    CallVerdict(true, 2);
                } else if (random != 2 && attempt == 0) {
                    System.out.println("You Lost");
                    CallVerdict(false, 2);
                } else {
                    System.out.println("You Lost");
                }

            } else if (clickedCircle == circle_3) {
                if (random == 3) {
                    System.out.println("You Won");
                    CallVerdict(true, 3);
                } else if (random != 3 && attempt == 0){
                    System.out.println("You Lost");
                    CallVerdict(false, 3);
                } else {
                    System.out.println("You Lost");
                }
            } else if (clickedCircle == circle_4) {
                if (random == 4) {
                    System.out.println("You Won");
                    CallVerdict(true, 4);
                } else if (random != 4 && attempt == 0) {
                    System.out.println("You Lost");
                    CallVerdict(false, 4);
                } else {
                    System.out.println("You Lost");
                }
        }
        }
        else if (attempt <= 0)
        {
            attempt--;
            attempts_left.setText(attempt + "");
            CallVerdict(false, 0);
        }
    }

    @FXML
    void LabelClick(MouseEvent event) {
        Label clickedLabel = (Label) event.getSource();
        if (attempt > 0 && attempt <= 2) {
            attempt--;
            attempts_left.setText(attempt + "");
            if (clickedLabel == label1) {
                if (random == 1) {
                    System.out.println("You Won");
                    CallVerdict(true, 1);
                } else if (random != 2 && attempt == 0) {
                    System.out.println("You Lost");
                    CallVerdict(false, 1);
                } else {
                    System.out.println("You Lost");
                }
            } else if (clickedLabel == label2) {
                if (random == 2) {
                    System.out.println("You Won");
                    CallVerdict(true, 2);
                } else if (random != 2 && attempt == 0) {
                    System.out.println("You Lost");
                    CallVerdict(false, 2);
                } else {
                    System.out.println("You Lost");
                }

            } else if (clickedLabel == label3) {
                if (random == 3) {
                    System.out.println("You Won");
                    CallVerdict(true, 3);
                } else if (random != 3 && attempt == 0){
                    System.out.println("You Lost");
                    CallVerdict(false, 3);
                } else {
                    System.out.println("You Lost");
                }
            } else if (clickedLabel == label4) {
                if (random == 4) {
                    System.out.println("You Won");
                    CallVerdict(true, 4);
                } else if (random != 4 && attempt == 0) {
                    System.out.println("You Lost");
                    CallVerdict(false, 4);
                } else {
                    System.out.println("You Lost");
                }
            }
        } else if (attempt <= 0) {
            attempt--;
            attempts_left.setText(attempt + "");
            CallVerdict(false, 0);
        }
    }
}
