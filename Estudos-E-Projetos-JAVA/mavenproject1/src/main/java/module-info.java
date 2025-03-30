module com.vxvitevilcorp.mavenproject1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.vxvitevilcorp.mavenproject1 to javafx.fxml;
    exports com.vxvitevilcorp.mavenproject1;
}
