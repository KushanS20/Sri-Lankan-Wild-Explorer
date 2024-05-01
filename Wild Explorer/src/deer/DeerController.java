package deer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DeerController {
    public AnchorPane context;
    public void AnimalOnAction(ActionEvent actionEvent) throws IOException {
        setUi("Animal/Animal");
    }

    public void DeerquizOnAction(ActionEvent actionEvent) throws IOException {
        setUi("deer/DeerQuiz");
    }

    private void setUi(String location)throws IOException {
        Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../"+location+".fxml"))));
        stage.centerOnScreen();


    }
}
