package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();
        pane.setTop(getHBox());
        pane.setLeft(getVBox());
        // testing font
        Font fontTst = new Font("SansSerif", 19);
        Font fontTst2 = Font.font("SansSerif", FontWeight.NORMAL, FontPosture.REGULAR, 19);

        // testing color
//        Color colorTst = new Color(1, 1, 1, 5.5);
//        Color colorTst2 = Color.color(55, 123, 22);


        primaryStage.setScene(new Scene(pane, 300, 275));
        primaryStage.show();
    }

    private HBox getHBox() {
        HBox hbox = new HBox(15);
        hbox.setPadding(new Insets(11, 11, 11, 11));
        hbox.setStyle("-fx-background-color: gold");
        hbox.getChildren().addAll(new Button("Computer Sceince"), new Button("Chemistry"));
        return hbox;
    }

    private VBox getVBox() {
        VBox vbox = new VBox(15);
        vbox.setPadding(new Insets(11, 11, 11, 11));
        vbox.getChildren().add(new Label("Courses"));
        Label[] courses = {new Label("CSCI 141"), new Label("CSCI 151"), new Label("CSCI 127"), new Label("CSCI 131"), new Label("CSCI 128")};

        for (Label course : courses) {
            VBox.setMargin(course, new Insets(0, 0, 0, 15));
            vbox.getChildren().add(course);
        }
        return vbox;
    }
}
