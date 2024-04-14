module com.example.garagemoto {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires javafx.base;
    requires mysql.connector.j;

    opens com.example.garagemoto.View to javafx.base;
    opens com.example.garagemoto.Controller to javafx.fxml;
    exports com.example.garagemoto;
}

