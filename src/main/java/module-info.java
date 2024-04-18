module com.mycompany.pooproyectointegrador {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.pooproyectointegrador to javafx.fxml;
    exports com.mycompany.pooproyectointegrador;
}
