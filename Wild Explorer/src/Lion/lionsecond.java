package Lion;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class lionsecond {

    public AnchorPane lionSecbg;

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
