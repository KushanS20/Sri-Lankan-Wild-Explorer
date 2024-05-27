package About;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class AboutController {
    public static void display() throws IOException {
        Stage additionalStage = new Stage();
        Parent additionalRoot = FXMLLoader.load(AboutController.class.getResource("about.fxml"));
        additionalStage.setTitle("Wild Explorer");
        additionalStage.setScene(new Scene(additionalRoot, 450, 150));
        additionalStage.initModality(Modality.APPLICATION_MODAL);
        additionalStage.showAndWait();
    }
}
