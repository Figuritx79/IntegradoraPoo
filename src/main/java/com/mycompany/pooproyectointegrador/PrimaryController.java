package com.mycompany.pooproyectointegrador;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField mail__text;

    @FXML
    private TextField password__text;

    @FXML
    private Label alert;

    @FXML
    private Button primaryButton;

    private static int intentos = 0;

    @FXML
    private void switchToSecondary() throws IOException {

        String mail = mail__text.getText();
        String password = password__text.getText();

        if (mail.isEmpty()  && password.isEmpty()) {
            alert.setText("Ingresa los datos solicitados");
        }

        if (mail.equals("Enrique") && password.equals("123")){
            App.setRoot("secondary");
        }

        if (!mail.equals("Enrique") && !password.equals("123")){
            //  App.setRoot("secondary");
            alert.setText("Datos erroneos");
        }
        intentos = intentos + 1;
        if (3 == intentos){
            alert.setText("Lo siento superaste el numero de intentos");
            mail__text.setEditable(false);
            password__text.setEditable(false);
        }

    }
}
