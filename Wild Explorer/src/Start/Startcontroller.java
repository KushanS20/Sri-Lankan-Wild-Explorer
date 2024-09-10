package Start;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Startcontroller {
    public AnchorPane context;

    public void ClickMeOnAction(ActionEvent actionEvent) {
        loadUI("Login");
    }

    private void loadUI(String fxmlName) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../login/" + fxmlName + ".fxml"));
            Stage stage = (Stage) context.getScene().getWindow();
            stage.setScene(new Scene(loader.load()));
            stage.centerOnScreen();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
