/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionherencia;

/**
 *
 * @author Chris
 */
public class Estufa extends Mueble{
    private Object numeroQuemadores;
    private float largo;
    private float ancho;
    private float alto;
    
    public Estufa(float largo, float ancho, float alto, String numSerie, String modelo, float precioCosto, float precioVenta, int existencias){
    super(numSerie, modelo, precioCosto, precioVenta, existencias);
    this.alto=alto;
    this.ancho=ancho;
    this.largo=largo;
    }
    /*getters*/

    public Object getNumeroQuemadores() {
        return numeroQuemadores;
    }

    public float getLargo() {
        return largo;
    }

    public float getAncho() {
        return ancho;
    }

    public float getAlto() {
        return alto;
    }
    /*setters*/

    public void setNumeroQuemadores(Object numeroQuemadores) {
        this.numeroQuemadores = numeroQuemadores;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }
    
    
}
