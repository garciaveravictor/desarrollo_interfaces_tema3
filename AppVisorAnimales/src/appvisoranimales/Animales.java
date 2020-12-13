/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

/**
 *
 * @author Victor Garcia Vera 2DAM
 */
public class Animales {
    private String nombre;
    private String imagenMiniatura;
    private String imagenGrande;
    
    public Animales(String nombre, String imagenMiniatura, String imagenGrande){
        this.imagenGrande = imagenGrande;
        this.imagenMiniatura = imagenMiniatura;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getImagenMiniatura() {
        return imagenMiniatura;
    }

    public String getImagenGrande() {
        return imagenGrande;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImagenMiniatura(String imagenMiniatura) {
        this.imagenMiniatura = imagenMiniatura;
    }

    public void setImagenGrande(String imagenGrande) {
        this.imagenGrande = imagenGrande;
    }

    @Override
    public String toString() {
        return nombre;
    }
      
}
