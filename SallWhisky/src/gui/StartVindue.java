package gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class StartVindue extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Main Window");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    HBox titleBox = new HBox();
    HBox buttonBox = new HBox();

    Label titleLabel = new Label("Sall Whisky Distillery");

    //Opret knapper
    Button btnOpretFad, btnOpretDestillering;

    Font font = Font.font("Times New Roman", FontWeight.BLACK, FontPosture.REGULAR, 80);

    public void initContent (GridPane pane){
        pane.setPadding(new Insets(25));
        pane.setVgap(20);
        pane.setHgap(20);
        pane.setGridLinesVisible(false);
        pane.setStyle("-fx-background-color: white");

        titleLabel.setFont(font);

        titleBox.setPrefWidth(600);
        titleBox.setPrefHeight(150);
        titleBox.setAlignment(Pos.CENTER);
        titleBox.getChildren().addAll(titleLabel);

        //Opret knapper
        btnOpretFad = new Button("Opret Fad");
        btnOpretDestillering = new Button("Opret Destillering");
//        btnOpretDeltager = new Button("Opret Deltager");
//        btnOversigt = new Button("Oversigt");

        //Knappe style
        btnOpretFad.setStyle("-fx-background-radius: 15");
        btnOpretDestillering.setStyle("-fx-background-radius: 15");
//        btnOpretDeltager.setStyle("-fx-background-radius: 15");
//        btnOversigt.setStyle("-fx-background-radius: 15");

        //Knappe action
        btnOpretFad.setOnAction(event -> this.switchToOpretKonferenceVindue(event));
        btnOpretDestillering.setOnAction(event -> this.switchToOpretTilmelding(event));
//        btnOpretDeltager.setOnAction(event -> this.switchToOpretDeltager(event));
//        btnOversigt.setOnAction(event -> this.switchToOversigt(event));

        //Something else
        buttonBox.setPrefWidth(300);
        buttonBox.setPrefHeight(70);
        buttonBox.setSpacing(25);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.getChildren().addAll(btnOpretFad, btnOpretDestillering);

        pane.add(titleBox, 0, 0, 2, 2);
        pane.add(buttonBox, 0, 2, 2, 1);
    }

    public void switchToOpretKonferenceVindue (ActionEvent event){
        OpretFadVindue opretKonferenceVindue = new OpretFadVindue();
        Stage stage = new Stage();

        try {
            opretKonferenceVindue.start(stage);
        } catch (Exception e) {
            System.out.println("Vindue fungere ikke");
        }
    }

    public void switchToOpretTilmelding (ActionEvent event){
        OpretDestilleringVindue tilmeldingsVindue = new OpretDestilleringVindue();
        Stage stage = new Stage();

        try {
            tilmeldingsVindue.start(stage);
        } catch (Exception e) {
            throw new RuntimeException("Vindue fungere ikke");
        }
    }

}
