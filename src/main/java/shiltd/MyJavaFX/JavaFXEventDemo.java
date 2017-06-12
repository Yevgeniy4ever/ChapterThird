package shiltd.MyJavaFX;

    import javafx.application.*;
    import javafx.event.Event;
    import javafx.scene.*;
    import javafx.scene.control.Button;
    import javafx.scene.control.Label;
    import javafx.stage.*;
    import javafx.scene.layout.*;
    import javafx.scene.control.*;
    import javafx.event.*;
    import javafx.geometry.*;

import java.awt.*;

/**
 * Created by Yevgeniy on 10.06.2017.
 */
public class JavaFXEventDemo extends Application {
    Label response;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage){
        myStage.setTitle("Use JavaFX Buttons and Events.");
        FlowPane mainNode = new FlowPane(10, 10);
        mainNode.setAlignment(Pos.CENTER);

        Scene mainScene = new Scene(mainNode, 300, 100);
        myStage.setScene(mainScene);

        response = new Label("Push a button");

        Button buttonUp = new Button("UP");
        Button buttonDown = new Button("Down");

        buttonUp.setOnAction((ae) -> response.setText("You pressed up"));

        buttonDown.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                response.setText("You pressed down");
            }
        });

        mainNode.getChildren().setAll(buttonDown, buttonUp, response);

        myStage.show();
    }


}