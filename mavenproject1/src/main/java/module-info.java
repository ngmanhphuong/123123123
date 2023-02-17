module com.nmpca1.mavenproject1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nmpca1.mavenproject1 to javafx.fxml;
    exports com.nmpca1.mavenproject1;
}
