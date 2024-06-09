package org.quiz;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class quizController {
    public Button startBtn;
    public GridPane myGrid;
    @FXML
    


    public void startGame(MouseEvent mouseEvent) {
         addImagesToGrid();
    }
    private void addImagesToGrid() {
        // Getting the ImageView objects
        ObservableList<Node> children = myGrid.getChildren();
        for (Node child : children) {
            if (child instanceof ImageView) {
                ImageView imageView = (ImageView) child;
                setFromUrl(imageView);
            }
        }
    }

    private void setFromUrl(ImageView imageView) {
        // Assuming the images are in the resources/org/animalquizz/images directory

        String path = "/org/quiz/images/" + "bear.jpg";
       // System.out.println(chooseRandoImg());
        Image image = new Image(getClass().getResource(path).toExternalForm());
        imageView.setImage(image);
    }

    public void quitGame(MouseEvent mouseEvent) {
        System.exit(0);
    }
}