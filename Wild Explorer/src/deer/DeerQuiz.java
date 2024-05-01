package deer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DeerQuiz {
    public AnchorPane context;
    public void previousOnAction(ActionEvent actionEvent)throws IOException {
        setUi("dear/Deer");
    }

    public void AnimalOnaction(ActionEvent actionEvent) throws IOException{
        setUi("Animal/Animal");
    }

    private void setUi(String location)throws IOException {
        Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../"+location+".fxml"))));
        stage.centerOnScreen();


    }
}
