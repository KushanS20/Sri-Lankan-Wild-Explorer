package bear;

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

public class bearsecond {
    public AnchorPane bearSecbg;
    @FXML
    private ImageView imgView;
    @FXML
    private Button prevBtn, nextbtn;

    private Image[] images;
    private int currentIndex = 0;

    public void initialize() {
        // Load images
        images = new Image[] {
                new Image("./Assests/Default_sri_lankan_wild_group_of_bears_background_images_for_w_0.jpg"),
                new Image("./Assests/Default_sri_lankan_wild_group_of_bears_background_images_for_w_1.jpg"),
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
        Stage stage = (Stage) bearSecbg.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../"+location+".fxml"))));
        stage.centerOnScreen();


    }
    public void previousOnAction(ActionEvent actionEvent)throws IOException {
        setUi("bear/bear1");
    }

    public void Animalonaction(ActionEvent actionEvent)throws IOException {
        setUi("Animal/Animal");
    }
}
