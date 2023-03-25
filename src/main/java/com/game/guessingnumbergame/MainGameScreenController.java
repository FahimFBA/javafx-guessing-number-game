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
        // random number generator for between 1 to 4
        random = (int) (Math.random() * 4 + 1);
        System.out.println(random);
        hiddenLabel.setText("Your Number is Generated. Guess the Number and select the proper Circle.");
        // check the circle clicked match with the random value or not
//        if (random == 1) {
//            circle_1.setVisible(true);
//            circle_2.setVisible(false);
//            circle_3.setVisible(false);
//            circle_4.setVisible(false);
//        } else if (random == 2) {
//            circle_1.setVisible(false);
//            circle_2.setVisible(true);
//            circle_3.setVisible(false);
//            circle_4.setVisible(false);
//        } else if (random == 3) {
//            circle_1.setVisible(false);
//            circle_2.setVisible(false);
//            circle_3.setVisible(true);
//            circle_4.setVisible(false);
//        } else if (random == 4) {
//            circle_1.setVisible(false);
//            circle_2.setVisible(false);
//            circle_3.setVisible(false);
//            circle_4.setVisible(true);
//        }
        // get the circle number which the user clicked using eventlistener

        // check the circle clicked match with the random value or not
//        if (circle_clicked_no == random) {
//            System.out.println("You Won");
//        } else {
//            System.out.println("You Lost");
//        }
          //  temporaryMethod();
    }

//    void temporaryMethod()
//    {
//        // Create a new MouseEvent object
//        MouseEvent mouseEvent = new MouseEvent(MouseEvent.MOUSE_CLICKED, 0, 0, 0, 0, MouseButton.PRIMARY, 1, true, true, true, true, true, true, true, true, true, true, null);
//
//        // Call the handleCircleClick method with the MouseEvent object
//        handleCircleClick(mouseEvent);
//    }
    @FXML
    void setSubmitButton(ActionEvent event) {
        String name = UserName.getText();
    }

//    void handleCircleClick(MouseEvent event) {
//        Circle clickedCircle = (Circle) event.getSource();
//        if (clickedCircle == circle_1) {
//            if (random == 1) {
//                System.out.println("You Won");
//            } else {
//                System.out.println("You Lost");
//            }
//        } else if (clickedCircle == circle_2) {
//            if (random == 2) {
//                System.out.println("You Won");
//            } else {
//                System.out.println("You Lost");
//            }
//
//        } else if (clickedCircle == circle_3) {
//            // Do something for ClickedCircle3
//            if (random == 3) {
//                System.out.println("You Won");
//            } else {
//                System.out.println("You Lost");
//            }
//        } else if (clickedCircle == circle_4) {
//            // Do something for ClickedCircle4
//            if (random == 4) {
//                System.out.println("You Won");
//            } else {
//                System.out.println("You Lost");
//            }
//        }
//
//    }

//    void CallVerdict(boolean win)
//    {
//        // open verdictscreen-view.fxml
//        try {
//            Parent root = FXMLLoader.load(getClass().getResource("verdictscreen-view.fxml"));
//            Stage stage = new Stage();
//            stage.setScene(new Scene(root));
//            stage.show();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    void CallVerdict(boolean win)
//    {
//        // open verdictscreen-view.fxml
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("verdictscreen-view.fxml"));
//            Parent root = fxmlLoader.load();
//            VerdictScreenController controller = fxmlLoader.getController();
//            controller.setVerdict(win);
//            // send username to verdict screen
//            controller.setUserName(UserName.getText());
//            Stage stage = new Stage();
//            stage.setScene(new Scene(root));
//            stage.show();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    void CallVerdict(boolean win)
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("verdictscreen-view.fxml"));
            Parent root = fxmlLoader.load();
            VerdictScreenController controller = fxmlLoader.getController();
            controller.setVerdict(win, UserName.getText());
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
        attempt--;

        if (attempt > 0 && attempt <= 2)
        {
            attempts_left.setText(attempt + "");
            if (clickedCircle == circle_1) {
                if (random == 1) {
                    System.out.println("You Won");
                    CallVerdict(true);
                } else {
                    System.out.println("You Lost");
                }
            } else if (clickedCircle == circle_2) {
                if (random == 2) {
                    System.out.println("You Won");
                    CallVerdict(true);
                } else {
                    System.out.println("You Lost");
                }

            } else if (clickedCircle == circle_3) {
                // Do something for ClickedCircle3
                if (random == 3) {
                    System.out.println("You Won");
                    CallVerdict(true);
                } else {
                    System.out.println("You Lost");
                }
            } else if (clickedCircle == circle_4) {
                // Do something for ClickedCircle4
                if (random == 4) {
                    System.out.println("You Won");
                    CallVerdict(true);
                } else {
                    System.out.println("You Lost");}
        }

        }
        else if (attempt <= 0)
        {
            CallVerdict(false);
        }
    }

    @FXML
    void LabelClick(MouseEvent event) {
        Label clickedLabel = (Label) event.getSource();
        attempt--;
        if (attempt > 0 && attempt <= 2) {
            attempts_left.setText(attempt + "");
            if (clickedLabel == label1) {
                if (random == 1) {
                    System.out.println("You Won");
                    CallVerdict(true);
                } else {
                    System.out.println("You Lost");
                }
            } else if (clickedLabel == label2) {
                if (random == 2) {
                    System.out.println("You Won");
                    CallVerdict(true);
                } else {
                    System.out.println("You Lost");
                }

            } else if (clickedLabel == label3) {
                // Do something for ClickedCircle3
                if (random == 3) {
                    System.out.println("You Won");
                    CallVerdict(true);
                } else {
                    System.out.println("You Lost");
                }
            } else if (clickedLabel == label4) {
                // Do something for ClickedCircle4
                if (random == 4) {
                    System.out.println("You Won");
                    CallVerdict(true);
                } else {
                    System.out.println("You Lost");
                }
            }
        } else if (attempt < 0) {
            CallVerdict(false);
        }

    }
}
