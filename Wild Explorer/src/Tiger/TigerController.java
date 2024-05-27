package Tiger;

import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class TigerController {

    public AnchorPane context;
    public Pane firstCard;

//    private void setUi(String location)throws IOException {
//        Stage stage = (Stage) context.getScene().getWindow();
//        Scene scene1 = new Scene(FXMLLoader.load(getClass().getResource("./"+location+".fxml")));
//        scene1.getStylesheets().add(getClass().getResource("../Assests/style.css").toExternalForm());
//        stage.setScene(scene1);
//        stage.centerOnScreen();
//    }

    private void setUi(String location)throws IOException {
        Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../"+location+".fxml"))));
        stage.centerOnScreen();
    }

//    public void changeTheid(){
//        firstCard.setId("secondCard");
//
//    }


//    public void flipTheCard(MouseEvent mouseEvent) {
//        RotateTransition rotateTransition = new RotateTransition(Duration.millis(500), firstCard);
//        rotateTransition.setAxis(Rotate.Y_AXIS);
//        rotateTransition.setByAngle(180);
//        rotateTransition.play();
//    }

    public void TigersecondOnAction(ActionEvent actionEvent)throws IOException  {
        setUi("Tiger/TigerSecond");
    }

    public void AnimalOnAction(ActionEvent actionEvent)throws IOException {
        setUi("Animal/Animal");
    }
}
