module org.example.projectsun {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.projectsun to javafx.fxml;
    exports org.example.projectsun;
}