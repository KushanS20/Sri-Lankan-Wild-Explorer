package Signup;

import javafx.scene.control.Alert;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Signupcontroller {

    public AnchorPane context;
    @FXML
    private TextField fname;
    @FXML
    private TextField lname;
    @FXML
    private TextField emailfd;
    @FXML
    private TextField age;
    @FXML
    private PasswordField pwd;
    @FXML
    private PasswordField confirmpwd;

    private DatabaseConnection instance;
    private Connection connection;



    public void ClickMeOnAction(ActionEvent actionEvent) throws IOException {
        String firstName = fname.getText();
        String lastName = lname.getText();
        String email = emailfd.getText();
        String ageText = age.getText();
        String password = pwd.getText();
        String confirmPassword = confirmpwd.getText();

        instance = DatabaseConnection.getInstance();
        connection = instance.getConnection();
        if (password == null || password.trim().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Error", "Password cannot be empty");
            return;
        }
        if (!password.equals(confirmPassword)) {
            showAlert(Alert.AlertType.ERROR, "Error", "Passwords do not match");
            return;
        }

        try {
            int age = Integer.parseInt(ageText);
            String query = "INSERT INTO users (first_name, last_name, email, age, password) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setString(3, email);
            statement.setInt(4, age);
            statement.setString(5, password);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                showAlert(Alert.AlertType.INFORMATION, "Success", "Signup successful!");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Error", "Error: " + ex.getMessage());
        }
        setUi("Home/Home");
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
