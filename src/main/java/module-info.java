module me.xamrah.coursepps {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires lombok;

    opens me.xamrah.coursepps to javafx.fxml;
    exports me.xamrah.coursepps;
}