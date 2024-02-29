module com.example.tsacomputerapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tsacomputerapp to javafx.fxml;
    exports com.example.tsacomputerapp;
}