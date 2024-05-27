package Animal;

import About.AboutController;
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
        setUi("Tiger/Tiger");
    }
    public void DeerOnAction(ActionEvent actionEvent)throws IOException {
        setUi("deer/deer1");
    }

    public void BearOnAction(ActionEvent actionEvent) throws IOException {
        setUi("bear/bear1");
    }

    public void PorcupineOnAction(ActionEvent actionEvent) throws IOException {

        setUi("porcupine/porcupine1");
    }

    public void StagOnAction(ActionEvent actionEvent) throws IOException {
        setUi("Lion/lion");
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

    @FXML
    private void AboutOnAction() throws IOException {
        AboutController.display();
    }

    public void QuizOnAction(ActionEvent actionEvent)throws IOException {
        setUi("Quiz/Quiz");
    }

    public void AnimalsOnAction(ActionEvent actionEvent)throws IOException {
        setUi("Animal/Animal");
    }

    public void ForestOnAction(ActionEvent actionEvent)throws IOException {
        setUi("Forest/Forest");
    }
}
