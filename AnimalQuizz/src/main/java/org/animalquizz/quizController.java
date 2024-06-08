package org.animalquizz;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class quizController {
    @FXML
    public GridPane myGrid;
    public Button startBtn;
    public ImageView deer;
    private ArrayList<String> arrImg = new ArrayList<>(Arrays.asList(
            "bear", "bear",
            "deer", "deer",
            "eagle", "eagle",
            "elephant", "elephant",
            "lion", "lion",
            "monkey", "monkey",
            "peocock", "peocock",
            "tiger", "tiger"
    ));
    private int indexNum;
    private String name;
    private Random rand = new Random();

    public void startGame(MouseEvent mouseEvent) {
        addImagesToGrid();

    }
    //Adding images to Game
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

        String path = "/org/animalquizz/images/" + chooseRandoImg() + ".jpg";
        System.out.println(chooseRandoImg());
        Image image = new Image(getClass().getResource(path).toExternalForm());
        imageView.setImage(image);
    }
    //Choose random images for our main grid
    private String chooseRandoImg(){
        indexNum = 0;
        name = "";
        if (arrImg.isEmpty()) {
            // Handle the case when the ArrayList is empty
            return null;
        }
        indexNum = rand.nextInt(arrImg.size());
        name = arrImg.get(indexNum);
        arrImg.remove(indexNum);
        return name;
    }

}