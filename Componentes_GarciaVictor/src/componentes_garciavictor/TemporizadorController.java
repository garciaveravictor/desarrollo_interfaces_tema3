/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes_garciavictor;

import java.io.IOException;
import javafx.animation.AnimationTimer;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

/**
 * FXML Controller class
 *
 * @author Victor Garcia Vera 2DAM
 */
public class TemporizadorController extends Label{

    /**
     * Initializes the controller class.
     */
    private int tiempo = 10;
    @FXML
    private AnimationTimer timer;
    
    public TemporizadorController(){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TemporizadorView.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        
        this.setText(Integer.toString(tiempo));
         
        timer.start();
        timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                this.setText(Integer.toString(tiempo));
                tiempo++;
            }
 
        };
        
        
    }    
    
}
