module org.animalquizz {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.animalquizz to javafx.fxml;
    exports org.animalquizz;
}