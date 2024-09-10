package Lion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class lionsecond {

    public AnchorPane lionSecbg;
    @FXML
    private ImageView imgView;
    @FXML
    private Button prevBtn, nextbtn;

    private Image[] images;
    private int currentIndex = 0;

    public void initialize() {
        // Load images
        images = new Image[] {
                new Image("./Assests/animal-hero-lion.jpg"),
                new Image("./Assests/lionSecond-cover.jpeg"),
        };
        imgView.setImage(images[currentIndex]);
    }

    @FXML
    private void backonaction() {
        currentIndex = (currentIndex + 1) % images.length;
        imgView.setImage(images[currentIndex]);
    }

    @FXML
    private void nextonaction() {
        currentIndex = (currentIndex - 1 + images.length) % images.length;
        imgView.setImage(images[currentIndex]);
    }
    private void setUi(String location)throws IOException {
        Stage stage = (Stage) lionSecbg.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../"+location+".fxml"))));
        stage.centerOnScreen();
    }


    public void previousOnAction(ActionEvent actionEvent)throws IOException {
        setUi("Lion/lion");
    }

    public void Animalonaction(ActionEvent actionEvent)throws IOException {
        setUi("Animal/Animal");
    }
}
