import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Homecontroller {
    public AnchorPane context;
    public void ElephantOnAction(ActionEvent actionEvent)throws IOException {
        setUi("Elephant");
    }
    private void setUi(String location)throws IOException{
        Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("./"+location+".fxml"))));
        stage.centerOnScreen();
    }

    
}
