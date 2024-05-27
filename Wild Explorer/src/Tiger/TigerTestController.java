package Tiger;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;



public class TigerTestController {
    public AnchorPane tigerSecbg;

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
