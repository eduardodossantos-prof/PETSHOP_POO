module com.petshop {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.petshop to javafx.fxml;
    exports com.petshop;
}