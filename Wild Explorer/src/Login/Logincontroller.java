package Login;

import Home.Homecontroller;
import Signup.DatabaseConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.sql.PreparedStatement;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import java.sql.ResultSet;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;

public class Logincontroller {
    public AnchorPane context;
    @FXML
    private TextField emailfd;
    @FXML
    private PasswordField pwd;
    private DatabaseConnection instance;
    private Connection connection;
    public void ClickMeOnAction(ActionEvent actionEvent) throws IOException {
        String email = emailfd.getText();
        String password = pwd.getText();
        instance = DatabaseConnection.getInstance();
        connection = instance.getConnection();

        try {
            String query = "SELECT * FROM users WHERE email = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, email);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                setUi("Home/Home");
            } else {
                showAlert(Alert.AlertType.ERROR, "Error", "Invalid email or password");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Error", "Error: " + ex.getMessage());
        }
    }
    public void SignupOnAction(ActionEvent actionEvent) throws IOException {
        setUi("Signup/Signup");
    }
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    private void setUi(String location)throws IOException{
        Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../"+location+".fxml"))));
        stage.centerOnScreen();
    }

}
