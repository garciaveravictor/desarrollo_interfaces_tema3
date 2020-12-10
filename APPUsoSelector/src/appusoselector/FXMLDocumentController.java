/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusoselector;

import componentes_garciavictor.SelectorDeslizamientoController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author Victor Garcia Vera 2DAM
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private SelectorDeslizamientoController selectorDeslizamientoSuperior;
    @FXML
    private SelectorDeslizamientoController selectorDeslizamientoInferior;
    @FXML
    private Label labelSelector;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        labelSelector.setTextFill(Color.GREEN);
        
        selectorDeslizamientoSuperior.setOnAction((ActionEvent event) -> {
            labelSelector.setText("Pulsado selector de arriba");
            
        });
        selectorDeslizamientoInferior.setOnAction((ActionEvent event) -> {
            labelSelector.setText("Pulsado selector de abajo");
            
        });

    }

}
