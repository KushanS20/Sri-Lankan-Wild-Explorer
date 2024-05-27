package elephant;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class ElephantNext   {
//    private ArrayList<String> list = new ArrayList<String>();
//    public Button nextBtn;
//    public Button prevBtn;
//    public ImageView imgView;
    public AnchorPane bg2;
//    private int j = 0;

//    private void setUi(String location)throws IOException {
//        Stage stage = (Stage) bg2.getScene().getWindow();
//        Scene scene1 = new Scene(FXMLLoader.load(getClass().getResource("./"+location+".fxml")));
//        scene1.getStylesheets().add(getClass().getResource("./style.css").toExternalForm());
//        stage.setScene(scene1);
//        stage.centerOnScreen();
//    }
    private void setUi(String location)throws IOException {
        Stage stage = (Stage) bg2.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../"+location+".fxml"))));
        stage.centerOnScreen();
    }

    public void previousOnAction(ActionEvent actionEvent) throws  IOException{
        setUi("elephant/Elephant");
    }

    public void Animalonaction(ActionEvent actionEvent)throws IOException {
        setUi("Animal/Animal");
    }

//    public void slideNextImage(Image[] img){
//        if(j < list.size()-1){
//            j++;
//        }
//        if(j == list.size()-1){
//            j = 0;
//        }
//       imgView.setImage(img[j]);
//
//    }
//    public void slidePrevImage(Image[] img){
//        if(j > 0){
//            j--;
//        }
//        if(j == 0){
//            j = list.size()-1;
//        }
//        imgView.setImage(img[j]);
//    }
//    public void start(Stage stage) throws IOException {
//        setUi("elephantNext");
//        list.add("a.jpg");
//        list.add("b.jpg");
//        list.add("c.jpg");
//        list.add("d.jpg");
//        list.add("e.jpg");
//        Image images[] = new Image[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            images[i] = new Image(list.get(i));
//        }
//
//        nextBtn.setOnAction(e ->slideNextImage(images));
//        prevBtn.setOnAction(e ->slidePrevImage(images));
//
//    }
//    public static void main(String[] args){
//        launch(args);
//    }
//
//    public void slidePrevImage(ActionEvent actionEvent) {
//    }
}
