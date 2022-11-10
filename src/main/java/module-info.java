module com.example.individualprojectrepo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.individualprojectrepo to javafx.fxml;
    exports com.example.individualprojectrepo;
}