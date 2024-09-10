package Home;

import About.AboutController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;

public class Homecontroller {

    @FXML
    private AnchorPane context;
    @FXML
    private MediaView mediaView;
    @FXML
    private MediaView mediaView1;
    private MediaPlayer mediaPlayer1;
    private MediaPlayer mediaPlayer2;

    public void initialize() {
        try {

            URL videoUrl = getClass().getResource("/Assests/Sri Lanka Wildlife #shorts.mp4");
            URL videoUrl1 = getClass().getResource("/Assests/Sri Lanka's Wildlife has Leopards, Elephants and Crocodiles (Safari).mp4");

            if (videoUrl == null || videoUrl1 == null) {
                System.out.println("Video file not found.");
                return;
            }


            Media media1 = new Media(videoUrl.toExternalForm());
            Media media2 = new Media(videoUrl1.toExternalForm());


            mediaPlayer1 = new MediaPlayer(media1);
            mediaPlayer2 = new MediaPlayer(media2);


            mediaView.setMediaPlayer(mediaPlayer1);
            mediaView1.setMediaPlayer(mediaPlayer2);


            if (mediaView == null) {
                System.out.println("MediaView is null");
            } else {
                System.out.println("MediaView is added to the scene graph");
            }
            if (mediaView1 == null) {
                System.out.println("MediaView1 is null");
            } else {
                System.out.println("MediaView1 is added to the scene graph");
            }

            // Check MediaPlayers status
            mediaPlayer1.setOnReady(() -> System.out.println("MediaPlayer1 is ready"));
            mediaPlayer1.setOnError(() -> System.out.println("MediaPlayer1 error: " + mediaPlayer1.getError().getMessage()));
            mediaPlayer2.setOnReady(() -> System.out.println("MediaPlayer2 is ready"));
            mediaPlayer2.setOnError(() -> System.out.println("MediaPlayer2 error: " + mediaPlayer2.getError().getMessage()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handlePlay(ActionEvent actionEvent) {
        if (mediaPlayer1 != null) {
            mediaPlayer1.play();
        }

    }

    @FXML
    private void handlePause(ActionEvent actionEvent) {
        if (mediaPlayer1 != null) {
            mediaPlayer1.pause();
        }

    }

    @FXML
    private void Homeonaction(ActionEvent actionEvent) throws IOException {
        setUi("Home/Home");
    }

    private void setUi(String location) throws IOException {
        Stage stage = (Stage) context.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../"+location + ".fxml"));
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.centerOnScreen();
    }


    @FXML
    private void LogoutOnAction(ActionEvent actionEvent) throws IOException {
        handlePause(actionEvent);
        setUi("Login/Login");
    }

    @FXML
    private void AnimalsOnAction(ActionEvent actionEvent) throws IOException {
        handlePause(actionEvent);
        setUi("Animal/Animal");
    }

    @FXML
    private void QuizOnAction(ActionEvent actionEvent) throws IOException {
        handlePause(actionEvent);
        setUi("Quiz/Quiz");
    }

    @FXML
    private void AboutOnAction(ActionEvent actionEvent) throws IOException {
        handlePause(actionEvent);
        AboutController.display();
    }

    @FXML
    private void ForestonAction(ActionEvent actionEvent) throws IOException {
        handlePause(actionEvent);
        setUi("Forest/Forest");
    }

    public void handlePlay1(ActionEvent actionEvent) {
        if (mediaPlayer2 != null) {
            mediaPlayer2.play();
        }
    }

    public void handlePause1(ActionEvent actionEvent) {
        if (mediaPlayer2 != null) {
            mediaPlayer2.pause();
        }
    }
}
