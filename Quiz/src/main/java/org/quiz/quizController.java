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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class quizController {
    public Button startBtn;
    public GridPane myGrid;
    public ImageView lastSelectedImage;
    private static String previousUrl;
    private static String presentUrl;
    private static ImageView previousImageView;

    private static boolean findingmatch = false;

    @FXML


    public void startGame(MouseEvent mouseEvent) {
        addImagesToGrid();
    }


    private void addImagesToGrid() {
        // Getting the ImageView objects
        Random rand = new Random();
        int indexNum;
        String name;
        ArrayList<String> arrImg = new ArrayList<>(Arrays.asList(
                "bear.jpg", "bear.jpg",
                "deer.jpg", "deer.jpg",
                "eagle.jpg", "eagle.jpg",
                "elephant.jpg", "elephant.jpg",
                "lion.jpg", "lion.jpg",
                "monkey.jpg", "monkey.jpg",
                "peocock.jpg", "peocock.jpg",
                "tiger.jpg", "tiger.jpg"
        ));
        ObservableList<Node> children = myGrid.getChildren();
        for (Node child : children) {
            if (child instanceof ImageView) {
                ImageView imageView = (ImageView) child;
                //setting random image for image view.
                if (!arrImg.isEmpty()) {
                    indexNum = rand.nextInt(arrImg.size());
                    name = arrImg.get(indexNum);
                    arrImg.remove(indexNum);
                    setFromUrl(imageView, name);
                }

            }
        }
    }

    private void setFromUrl(ImageView imageView, String name) {


        String path = "/org/quiz/images/" + name;
        // System.out.println(chooseRandoImg());
        Image image = new Image(getClass().getResource(path).toExternalForm());
        imageView.setImage(image);
    }

    //logical part
    

    public void quitGame(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void runGame(MouseEvent mouseEvent) {
        ImageView presentimageView = (ImageView) mouseEvent.getSource();
        Image presentImg = presentimageView.getImage();
        presentUrl = presentImg.getUrl();
        if (findingmatch == false) {
            previousUrl = presentUrl;
            previousImageView = presentimageView;
            presentimageView.setImage(null);
            findingmatch = true;

        } else if (Objects.equals(presentUrl, previousUrl)) {
            presentimageView.setImage(null);
            findingmatch = false;
        } else {
            previousImageView.setImage(new Image(previousUrl));
            findingmatch = false;
        }

    }
        

}