package deer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class deersecond {
    public AnchorPane deerSecbg;

    private void setUi(String location)throws IOException {
        Stage stage = (Stage) deerSecbg.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../"+location+".fxml"))));
        stage.centerOnScreen();
    }

    public void previousOnAction(ActionEvent actionEvent) throws  IOException {
        setUi("deer/deer1");
    }

    public void Animalonaction(ActionEvent actionEvent) throws IOException {
        setUi("Animal/Animal");
    }
}
