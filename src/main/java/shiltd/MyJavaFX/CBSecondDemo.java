package shiltd.MyJavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Created by Yevgeniy on 11.06.2017.
 */
public class CBSecondDemo extends Application {
    CheckBox firstCB;
    CheckBox secondCB;
    CheckBox thirdCB;
    CheckBox fourthCB;

    Label response;
    Label selected;

    String result;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage){
        myStage.setTitle("CheckBox demonstration");

        FlowPane mainNode = new FlowPane(Orientation.VERTICAL, 10, 10);
        mainNode.setAlignment(Pos.CENTER);
        Scene mainScene = new Scene(mainNode, 230, 200);
        myStage.setScene(mainScene);

        firstCB = new CheckBox("Laptop");
        secondCB = new CheckBox("SmartPhone");
        thirdCB = new CheckBox("Tablet");
        fourthCB = new CheckBox("Computer");

        firstCB.setAllowIndeterminate(true);

        firstCB.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                if(firstCB.isSelected())response.setText("Laptop was just changed");
                else
                    if(firstCB.isIndeterminate()) response.setText("Laptop is indeterminate");
                    else
                    response.setText("Laptop was just cleared");

                    showAll();
            }
        });

        secondCB.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                if (secondCB.isSelected()) response.setText(secondCB.getText() + " was just selected");
                else response.setText(secondCB.getText() + " was just cleared");

                showAll();
            }
        });

        thirdCB.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                if (thirdCB.isSelected()) response.setText(thirdCB.getText() + " was just selected");
                else response.setText(thirdCB.getText() + " was jus cleared");

                showAll();
            }
        });

        fourthCB.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                if(fourthCB.isSelected()) response.setText(fourthCB.getText() + " was just selected");
                else response.setText(fourthCB.getText() + " was just cleared");

                showAll();
            }
        });


        response = new Label("");
        selected = new Label("");

        mainNode.getChildren().addAll(firstCB, secondCB, thirdCB, fourthCB, response, selected);

        myStage.show();
    }


    public void showAll(){
        result = "";
        if (firstCB.isSelected()) result += firstCB.getText() + " ";
        if(secondCB.isSelected()) result += secondCB.getText() + " ";
        if(thirdCB.isSelected()) result += thirdCB.getText() + " ";
        if(fourthCB.isSelected()) result += fourthCB.getText() + " ";
        selected.setText("Computers selected: " + result);
    }
}
