package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
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
        Rectangle r1 = new Rectangle(10, 10, 10, 10);
        Ellipse e1 = new Ellipse(100, 100, 100, 100);
        Arc a1 = new Arc(150, 100,50, 50, 80, 30);
        Line l1 = new Line(10, 10, 10, 10);

        StackPane stkPane = new StackPane();
        FlowPane flwPane = new FlowPane();
        TextField tfTxt = new TextField();

        ListView<String> lstView = new ListView<>();
        ObservableList<String> obslListView = lstView.getItems();

        ComboBox<String> cbxMembers = new ComboBox<>();
        ObservableList<String> obslMembers = cbxMembers.getItems();
        obslMembers.addAll("Member 1", "Member 2");

        Text txt = new Text(20, 20, "Test This ");
        Color c1 = Color.GOLD;
        Color c2 = new Color(1, .8, .2, .5);
        txt.setFill(Color.GREEN);
        txt.setUnderline(true);
        Font fontTst = new Font("SansSerif", 19);
        Font fontTst2 = Font.font("SansSerif", FontWeight.NORMAL, FontPosture.REGULAR, 19);
        txt.setFont(fontTst);
        pane.setRight(txt);

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
