package elephant;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.FXML;

import java.io.IOException;

public class ElephantQuiz {
    public AnchorPane context;
@FXML
//    private Button f1button;
//
//    public Homecontroller a2button;
////    public ElephantQuiz(Homecontroller a2button) {
////        this.a2button = a2button;
////    }

    public void AnimalOnaction(ActionEvent actionEvent) throws IOException {
        setUi("Animal/Animal");

    }

    private void setUi(String location) throws IOException {

        Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../" + location + ".fxml"))));
        stage.centerOnScreen();
    }
//    private void setUi2(String location) throws IOException {
//        Stage stage = (Stage) context.getScene().getWindow();
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("./" + location + ".fxml"));
//        Parent root = loader.load();
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//
//        ElephantQuiz controller = loader.getController();
//        controller.init();
//    }

    public void previousOnAction(ActionEvent actionEvent) throws IOException {

        setUi("elephant/Elephant");

    }

//    public void func(){
//        Homecontroller homecontroller = new Homecontroller();
//        homecontroller.set();
//
//    }
//    public void init() {
//        f1button.setOnAction(event -> onGradeCompleted(1));
//
//    }
//
//    private void onGradeCompleted(int grade) {
//        if (grade < 5) {
//            unlockNextGrade(grade);
//        }
//    }
//
//    private void unlockNextGrade(int grade) {
//        switch (grade) {
//            case 1:
//                a2button.set();
//                break;
//
//
//        }
//    }
}
