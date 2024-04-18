package com.mycompany.pooproyectointegrador;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;


public class SecondaryController {

    @FXML
    private Button andir__button;
    @FXML
    private Button mostrar__btn;
    @FXML
    private Button eliminar__btn;
    @FXML
    private  Button actualizar__btn;

    @FXML
    private TextField idGuardar;

    @FXML
    private  TextField nombreGuardar;

    @FXML TextField precioGuardar;

    @FXML
    private Pane paneAnadir;
    @FXML
    private Pane mostrarPane;

    @FXML
    private Button guardarBtn;




    @FXML
    private void cambiarAnadir(){
   }
    @FXML
    private void mostrar(){
        try {
            App.setRoot("mostrar");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    private void eliminar(){

    }

    @FXML
    private void actualizar(){

    }


    @FXML
    private void guardar(){
        int id = Integer.valueOf(idGuardar.getText());
        String nombre = nombreGuardar.getText();
        double precio = Double.valueOf(precioGuardar.getText());


        Producto newProducto = new Producto(id,nombre,precio);
        App.array.add(newProducto);
    }
}