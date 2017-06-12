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
 * Created by Yevgeniy on 10.06.2017.
 */
public class CheckboxDemo extends Application {
    CheckBox firstCB;
    CheckBox secondCB;
    CheckBox thirdCB;
    CheckBox fourthCB;

    Label response;
    Label selected;

    String computers;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("CheckBox demonstration");


        FlowPane mainNode = new FlowPane(Orientation.HORIZONTAL,10, 10);
        mainNode.setAlignment(Pos.CENTER);
        Scene mainScene = new Scene(mainNode, 230, 200);
        primaryStage.setScene(mainScene);

        firstCB = new CheckBox("Lap top");
        secondCB = new CheckBox("Tablet");
        thirdCB = new CheckBox("Computer");
        fourthCB = new CheckBox("Cell phone");

        response = new Label("response");
        selected = new Label("selected");

        firstCB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (firstCB.isSelected()) response.setText("Lap top was just selected");
                else response.setText("Lap top was just cleared");

                showAll();
            }
        });

        secondCB.setOnAction(new EventHandler<ActionEvent>(){
           public void handle(ActionEvent event){
               if (secondCB.isSelected()) response.setText("Tablet was just changed");
               else response.setText("Tablet was just cleared");

               showAll();
           }
        });

        thirdCB.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                if (thirdCB.isSelected()) response.setText("Computer was just selected");
                else response.setText("Computer was just cleared");

                showAll();
            }
        });


        fourthCB.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                if (thirdCB.isSelected()) response.setText("Cell phone was selected");
                else response.setText("Cell phone was just cleared");

                showAll();
            }
        });

/*        firstCB.setOnAction((ae) -> System.out.println("second"));
        secondCB.setOnAction((ae) -> System.out.println("second") );
        thirdCB.setOnAction((ae) -> System.out.println("third") );
        fourthCB.setOnAction((ae) -> System.out.println("fourth") );*/

        mainNode.getChildren().addAll(firstCB, secondCB, thirdCB, fourthCB, response, selected);

        primaryStage.show();

        showAll();
    }

    void showAll(){
        computers = "";
        if(firstCB.isSelected()) selected.setText(computers += "Lap top ");
        if(secondCB.isSelected()) selected.setText(computers += "Tablet ");
        if(thirdCB.isSelected()) selected.setText(computers += "Computer ");
        if(fourthCB.isSelected()) selected.setText(computers += "Cell phone ");
    }
}
