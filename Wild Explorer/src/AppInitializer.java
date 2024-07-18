import Signup.DatabaseConnection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class AppInitializer extends Application {
    public static void main(String[] args) {
        DatabaseConnection instance = DatabaseConnection.getInstance();
        instance.getConnection();
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL resource = getClass().getResource("Start/Start.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.centerOnScreen();
        primaryStage.setTitle("Wild Explorer");

     }
}
