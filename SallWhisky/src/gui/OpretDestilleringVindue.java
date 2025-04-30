package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class OpretDestilleringVindue extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Opret Destillering");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    public void initContent (GridPane pane){

    }
}
