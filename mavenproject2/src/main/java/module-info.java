module com.hiu2711.mavenproject2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.hiu2711.mavenproject2 to javafx.fxml;
    exports com.hiu2711.mavenproject2;
}
