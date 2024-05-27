package Lion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

import java.io.IOException;

public class LionController {
    public AnchorPane context;

    private void setUi(String location)throws IOException {
        Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../"+location+".fxml"))));
        stage.centerOnScreen();
    }

    public void lionsecondOnAction(ActionEvent actionEvent) throws IOException{
        setUi("Lion/lionSecond");
    }

    public void AnimalOnAction(ActionEvent actionEvent) throws IOException {
        setUi("Animal/Animal");
    }
    @FXML
    private Button playButton;
    @FXML
    private void playonAction(ActionEvent event) {
        AudioClip buzzer = new AudioClip(getClass().getResource("/Assests/lion.mp3").toExternalForm());
        buzzer.play();
    }
}
