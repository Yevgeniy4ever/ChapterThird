package shiltd.MyJavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.PrintWriter;

/**
 * Created by Yevgeniy on 09.06.2017.
 */
public class JavaFXSkel extends Application {


    public static void main(String[] args) {
        PrintWriter writer = new PrintWriter(System.out, true);
        writer.println("Starting application JavaFX ... ");
        launch(args);
    }

    @Override
    public void init(){
        System.out.println("It is inside method init");
    }

    @Override
    public void stop(){
        System.out.println("It is inside method stop");
    }


    @Override
    public void start(Stage myStage) throws Exception {
        System.out.println("It is inside method start");

        myStage.setTitle("Carcass for application JavaFX");

        FlowPane rootNode = new FlowPane();

        Scene myScene = new Scene(rootNode, 300, 200);
        myStage.setScene(myScene);
        myStage.show();
    }
}
