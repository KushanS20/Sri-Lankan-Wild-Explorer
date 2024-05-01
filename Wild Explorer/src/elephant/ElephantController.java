package elephant;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.AudioClip;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import javax.print.attribute.standard.Media;
import java.io.File;
import java.io.IOException;

public class ElephantController {
    public AnchorPane context;
    private void setUi(String location)throws IOException {
        Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../"+location+".fxml"))));
        stage.centerOnScreen();


    }

    public void AnimalOnAction(ActionEvent actionEvent)throws IOException {
    setUi("Animal/Animal");

    }



    public void elephanttwoonaction(ActionEvent actionEvent) throws IOException {
        setUi("elephant/Elehphanttwo");
    }

    @FXML
    private Button playButton;
    @FXML
    private void playonAction(ActionEvent event) {
        AudioClip buzzer = new AudioClip(getClass().getResource("/Assests/28_26.wav").toExternalForm());
        buzzer.play();
    }
}
