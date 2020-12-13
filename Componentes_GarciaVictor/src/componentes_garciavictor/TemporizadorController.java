/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes_garciavictor;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Victor Garcia Vera 2DAM
 */
public class TemporizadorController extends Label {

    /**
     * Initializes the controller class.
     */
    private int tiempo = 10;
    @FXML
    private Timeline timeline;
    private int aux;

    public TemporizadorController(int tiempo) {
        this.tiempo = tiempo;
    }

    public TemporizadorController() {
        this.tiempo = 10;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public void initTemporizador() {
        aux = tiempo;
        timeline = new Timeline();
        setText("Quedan: " + aux + " segundos");
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1), new EventHandler() {
            @Override
            public void handle(Event event) {
                aux--;
                setText("Quedan: " + aux + " segundos");
                if (aux == 0) {
                    timeline.stop();
                }
            }
        }));
        timeline.play();
    }

    public int getAux() {
        return aux;
    }

}
