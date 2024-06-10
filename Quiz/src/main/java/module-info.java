module org.quiz {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.quiz to javafx.fxml;
    exports org.quiz;
}