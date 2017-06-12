package shiltd.MyJavaFX;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.FlowPane;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

/**
 * Created by Developer on 6/12/2017.
 */
public class EffectsAndTransformsDemo extends Application {

    double angle = 0.0;
    double scaleFactor = 0.4;
    double blurVal = 1.0;

    Reflection reflection = new Reflection();
    BoxBlur blur = new BoxBlur(1.0, 1.0, 1);
    Rotate rotate = new Rotate();
    Scale scale = new Scale(scaleFactor, scaleFactor);

    Button btnRotate;
    Button btnBlur;
    Button btnScale;

    Label info;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage mainStage){

        mainStage.setTitle("Demostration of Effects and Transforms");
        FlowPane mainNode = new FlowPane(20, 20);

        mainNode.setAlignment(Pos.CENTER);

        Scene mainScene = new Scene(mainNode, 300, 120);
        mainStage.setScene(mainScene);

        btnRotate = new Button("Rotate");
        btnBlur = new Button("Blur");
        btnScale = new Button("Scale");

        btnRotate.getTransforms().add(rotate);

        btnScale.getTransforms().add(scale);

        info = new Label("Reflection Adds Visual Sparkle");

        reflection.setTopOpacity(0.7);
        reflection.setBottomOpacity(0.3);
        info.setEffect(reflection);



        btnRotate.setOnAction((ae)-> {
            angle += 15;
            rotate.setAngle(angle);
            rotate.setPivotX(btnRotate.getWidth()/2);
            rotate.setPivotY(btnRotate.getWidth()/2);
        });
        btnScale.setOnAction((ae)->{
            scaleFactor += 0.1;
            if(scaleFactor > 2.0) scaleFactor = 0.4;

            scale.setX(scaleFactor);
            scale.setY(scaleFactor);
        });

        btnBlur.setOnAction((ae)->{
            if(blurVal == 10.0){
                blurVal = 1.0;
                btnBlur.setEffect(null);
                btnBlur.setText("Blur off");
            } else {
                blurVal ++;
                btnBlur.setEffect(blur);
                btnBlur.setText("Blur on");
            }

            blur.setWidth(blurVal);
            blur.setHeight(blurVal);

        });

        mainNode.getChildren().addAll(btnRotate, btnBlur, btnScale, info);

        mainStage.show();
    }
}
