package Tiger;

import javafx.application.Application;
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



public class TigerTestController {
    public AnchorPane tigerSecbg;
    @FXML
    private ImageView imgView;
    @FXML
    private Button prevBtn, nextbtn;

    private Image[] images;
    private int currentIndex = 0;

    public void initialize() {
        // Load images
        images = new Image[] {
                new Image("./Assests/Default_generate_leopard_image_1.jpg"),
                new Image("./Assests/Default_sri_lankan_wild_Leopards_background_images_for_wild_li_1.jpg"),
                new Image("./Assests/Leonardo_Diffusion_XL_sri_lankan_leopard_1.jpg"),
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
        Stage stage = (Stage) tigerSecbg.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../"+location+".fxml"))));
        stage.centerOnScreen();
    }

//    private void setUi(String location){
//        Stage stage = (Stage) tigerSecbg.getScene().getWindow();
//        Scene scene1 = null;
//        try {
//            scene1 = new Scene(FXMLLoader.load(getClass().getResource("./TigerTest.fxml")));
//        } catch (IOException e) {
//            e.printStackTrace();
//
//        }
//        scene1.getStylesheets().add(getClass().getResource("../style.css").toExternalForm());
//        stage.setScene(scene1);
//        stage.centerOnScreen();
//    }
//
//    public static void main(String[] args){
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage stage) throws Exception {
//
//        setUi("TigerTest");
//
//    }

    public void previousOnAction(ActionEvent actionEvent) throws IOException{
        setUi("Tiger/Tiger");
    }

    public void Animalonaction(ActionEvent actionEvent)throws IOException {
        setUi("Animal/Animal");
    }
}
