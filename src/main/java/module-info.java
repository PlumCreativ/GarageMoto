module com.example.garagemoto {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.garagemoto to javafx.fxml;
    exports com.example.garagemoto;
    exports com.example.garagemoto.Controller;
    opens com.example.garagemoto.Controller to javafx.fxml;
}
