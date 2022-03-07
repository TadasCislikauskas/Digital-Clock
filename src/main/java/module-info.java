module com.clock.digitalclock {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.clock.digitalclock to javafx.fxml;
    exports com.clock.digitalclock;
}