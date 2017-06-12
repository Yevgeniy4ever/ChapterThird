package shiltd.MyJavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Created by Yevgeniy on 10.06.2017.
 */
public class JavaFXLabelDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage){
//        Stage first = new Stage();
        myStage.setTitle("Use a JavaFXLabel.");
        FlowPane rootNode = new FlowPane();

        Scene myScene = new Scene(rootNode, 300, 200);
        myStage.setScene(myScene);

        Label myLabel = new Label("JavaFX is powerful GUI");

        rootNode.getChildren().add(myLabel);

        myStage.show();
    }
}
