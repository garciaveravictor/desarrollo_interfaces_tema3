/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 *
 * @author Victor Garcia Vera 2DAM
 */
public class CeldaImagenTexto extends ListCell<Animales>{
    private VBox vb;
    private ImageView icono;
    private Label nombre;
    
    public CeldaImagenTexto(){
        icono = new ImageView();
        vb = new VBox();
        nombre = new Label();
        
        icono.setFitHeight(100);
        icono.setFitWidth(100);
        
        vb.getChildren().addAll(icono,nombre);
        vb.setAlignment(Pos.CENTER);
    }
    
    @Override
    protected void updateItem(Animales animal, boolean vacia) {
        super.updateItem(animal, vacia);
        if(animal!=null){
            nombre.setText(animal.getNombre());
            icono.setImage(new Image(animal.getImagenMiniatura()));
            setGraphic(vb);
        }
    }
}
