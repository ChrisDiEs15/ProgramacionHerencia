/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionherencia;

/**
 *
 * @author Chris
 */
public class Escritorio extends Mueble {
    private int numeroCajones;
    private float ancho;
    private float largo;
    private String material;
    public Escritorio(int numeroCajones, int ancho, int largo, String material, String numSerie, String modelo, float precioCosto, float precioVenta, int existencias){
    super ( numSerie, modelo, precioCosto, precioVenta, existencias);
    this.ancho=ancho;
    this.largo=largo;
    this.material=material;
    this.numeroCajones=numeroCajones;
    
    }
    /*getters*/

    public int getNumeroCajones() {
        return numeroCajones;
    }

    public float getAncho() {
        return ancho;
    }

    public float getLargo() {
        return largo;
    }

    public String getMaterial() {
        return material;
    }
    /*setters*/

    public void setNumeroCajones(int numeroCajones) {
        this.numeroCajones = numeroCajones;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
}
