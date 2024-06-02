module org.newquizz {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.newquizz to javafx.fxml;
    exports org.newquizz;
}