package Animal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Animalcontroller {
    public AnchorPane context;
    @FXML
    private Button a2button;
    public void ElephantOnAction(ActionEvent actionEvent)throws IOException {
        setUi("elephant/Elephant");
    }
    public void LeopardOnAction(ActionEvent actionEvent)throws IOException {
        setUi("leopard/Leopard");
    }
    public void DeerOnAction(ActionEvent actionEvent)throws IOException {
        setUi("deer/Deer");
    }

    public void BearOnAction(ActionEvent actionEvent) throws IOException {
        setUi("bear/Bear");
    }

    public void PorcupineOnAction(ActionEvent actionEvent) throws IOException {

        setUi("porcupine/Porcupine");
    }

    public void StagOnAction(ActionEvent actionEvent) throws IOException {
        setUi("stag/Stag");
    }

    private void setUi(String location)throws IOException{
        Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../"+location+".fxml"))));
   stage.centerOnScreen();



    }
    public void set() {
                a2button.setCancelButton(false);
        }


    public void Homeonaction(ActionEvent actionEvent) throws IOException {
    setUi("Home/Home");
    }

    public void LogoutOnAction(ActionEvent actionEvent) throws IOException {
        setUi("Login/Login");
    }
}
