package shiltd.MyJavaFX;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.util.Observable;

/**
 * Created by Yevgeniy on 11.06.2017.
 */
public class ListViewDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    ListView<String> myListView;
    Label response;

    public void start(Stage myStage){
        myStage.setTitle("ListView demonstration");

        FlowPane myNode = new FlowPane(Orientation.VERTICAL, 10, 10);
        myNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(myNode, 200, 120);
        myStage.setScene(myScene);
        myListView = new ListView<>();

        response = new Label("Select computer type");

        ObservableList<String> computersTypes =
                FXCollections.observableArrayList("Smartphone",
                        "Tablet", "Notebook", "Desktop");

        //myListView = new ListView<>(computersTypes);
        myListView = new ListView<>(computersTypes);

        myListView.setPrefSize(100, 70);



        MultipleSelectionModel<String> currentSelectionModel = myListView.getSelectionModel();

        //currentSelectionModel.setSelectionMode(SelectionMode.MULTIPLE); //(for ex)

        ObservableList<String> choosenObj = currentSelectionModel.getSelectedItems();

        for(String x : choosenObj){
            System.out.println(x);
        }



        currentSelectionModel.selectedItemProperty().addListener(new ChangeListener<String>(){
            public void changed(ObservableValue<? extends String> changed,
                                String oldVal, String newVal){
                response.setText("Computer selected " + newVal);



            }


        });


        myNode.getChildren().addAll(myListView, response);
        myStage.show();
    }
}
