package Forest;

import About.AboutController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Forestcontroller {
    public AnchorPane context;

    public void Homeonaction(ActionEvent actionEvent) throws IOException{

        setUi("Home/Home");
    }

    private void setUi(String location)throws IOException {
        Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../"+location+".fxml"))));
        stage.centerOnScreen();
    }

    public void LogoutOnAction(ActionEvent actionEvent) throws IOException{
        setUi("Login/Login");
    }

    public void AnimalsOnAction(ActionEvent actionEvent)throws IOException {
        setUi("Animal/Animal");
    }

    public void QuizOnAction(ActionEvent actionEvent) throws IOException {
        setUi("Quiz/Quiz");
    }

    @FXML
    private void AboutOnAction() throws IOException {
        AboutController.display();
    }

    public void ForestOnAction(ActionEvent actionEvent) throws IOException {
        setUi("Forest/Forest");
    }

    public void Wilpattunaction(ActionEvent actionEvent) throws IOException {
        setUi("");
    }

    public void SinaharajaOnaction(ActionEvent actionEvent) throws IOException{
        setUi("Sinharaja/sinharaja");
    }

    public void Yalaonaction(ActionEvent actionEvent) throws IOException{
        setUi("");
    }
}
