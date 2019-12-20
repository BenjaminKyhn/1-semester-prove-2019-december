package Quiz;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class quizGUIController extends Application implements Initializable {
    DBController dbController = new DBController();

    @FXML
    private Label sporgsmaalId;

    @FXML
    private Label svar1;

    @FXML
    private Label svar2;

    @FXML
    private Label svar3;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/Quiz/quizGUI.fxml"));
        primaryStage.setTitle("Bennyquizzen");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Sporgsmaal sporgsmaal1 = dbController.getSporgsmaal();
        sporgsmaalId.setText(sporgsmaal1.getSporgsmaal());

        ArrayList<Svar> svarMuligheder = dbController.getSvarMuligheder();
        svar1.setText(svarMuligheder.get(0).toString());
        svar2.setText(svarMuligheder.get(1).toString());
        svar3.setText(svarMuligheder.get(2).toString());
    }
}
