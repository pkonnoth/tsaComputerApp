module com.example.tsacomputerapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.tsacomputerapp to javafx.fxml;
    exports com.example.tsacomputerapp;
}