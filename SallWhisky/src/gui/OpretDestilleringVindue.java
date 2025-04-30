package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.KornSort;

import java.awt.*;

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

    // Labels:
    Label lblMaltBatch, lblStart, lblSlut, lblKornsort, lblAlkoholProcent, lblLiter, lblKommentar;

    // TextField:
    TextField txfMaltBatch, txfAlkoholProcent, txfLiter;

    // TextArea:
    TextArea txaKommentar;

    // Datepicker:
    DatePicker startDatoen = new DatePicker();
    DatePicker slutDatoen = new DatePicker();

    // Button:
    Button btnOpret, btnTilbage;

    // Listview:
    ListView<KornSort> lvKornSort = new ListView<>();

    public void initContent (GridPane pane){

    }
}
