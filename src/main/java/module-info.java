module org.example.sos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.almasb.fxgl.all;

    opens org.example.sos to javafx.fxml;
    exports org.example.sos;
}