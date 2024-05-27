package bear;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class bearsecond {
    public AnchorPane bearSecbg;
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
