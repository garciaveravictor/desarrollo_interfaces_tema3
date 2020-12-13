/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Victor Garcia Vera 2DAM
 */
public class VisorAnimalesController implements Initializable {

    @FXML
    private ListView<Animales> listViewIzq;
    @FXML
    private ImageView imageViewCen;
    private ObservableList<Animales> animales;
    private Animales animal;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        animales = FXCollections.observableArrayList();
        
        Animales perro = new Animales("Perro","IMG/perro1.jpg","IMG/perro2.jpg");
        Animales gato = new Animales("Gato","IMG/gato1.jpg","IMG/gato2.jpg");
        Animales conejo = new Animales("Conejo","IMG/conejo1.jpg","IMG/conejo2.jpg");
        
        animales.add(perro);
        animales.add(gato);
        animales.add(conejo);
        
        listViewIzq.setItems(animales);
        listViewIzq.getSelectionModel().select(gato);
        imageViewCen.setImage(new Image(gato.getImagenGrande()));
        
        listViewIzq.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Animales>(){
            @Override
            public void changed(ObservableValue<? extends Animales> observable, Animales oldValue, Animales newValue) {
                animal = newValue;
                imageViewCen.setImage(new Image(animal.getImagenGrande()));
            }
        });
    }    
    
}
