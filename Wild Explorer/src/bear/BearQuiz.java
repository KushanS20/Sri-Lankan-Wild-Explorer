package bear;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class BearQuiz {
    public void previousOnAction(ActionEvent actionEvent) throws IOException {
        setUi("bear/Bear");
    }

    public void Animalonaction(ActionEvent actionEvent) throws IOException {
        setUi("Animal/Animal");
    }
    public AnchorPane context;
    private void setUi(String location)throws IOException {
        Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../"+location+".fxml"))));
        stage.centerOnScreen();


    }
}
