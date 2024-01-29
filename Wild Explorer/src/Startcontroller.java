import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Startcontroller {
    public AnchorPane context;


    public void ClickMeOnAction(ActionEvent actionEvent) throws IOException {
        setUi("Login");
    }
    private void setUi(String location)throws IOException{
        Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("./"+location+".fxml"))));
        stage.centerOnScreen();
    }
}
