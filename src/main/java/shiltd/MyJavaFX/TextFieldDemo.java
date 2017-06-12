package shiltd.MyJavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Created by Yevgeniy on 12.06.2017.
 */
public class TextFieldDemo extends Application {
    String text;
    Label showMe;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage mainStage){
        mainStage.setTitle("TextField demonstration");
        FlowPane mainNode = new FlowPane(15, 15);
        mainNode.setAlignment(Pos.CENTER);
        Scene mainScene = new Scene(mainNode, 200, 180);
        mainStage.setScene(mainScene);

        TextField textField = new TextField("First Field");
        textField.setPrefColumnCount(12);
        textField.setPromptText("Input your text");
        Separator sepor = new Separator();
        sepor.setPrefWidth(180);

        button = new Button("Get Name");

        showMe = new Label("");

        textField.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                text = textField.getText();
                showMe.setText(text);
            }
        });

        button.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                showMe.setText(textField.getText());
            }
        });

        mainNode.getChildren().addAll(textField, button, sepor, showMe);

        mainStage.show();
    }
}
