/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionherencia;

/**
 *
 * @author Chris
 */
public class Mueble {
    
    private String numSerie, modelo;
    private float precioCosto, precioVenta;
    private int existencias;
    
    public Mueble(String numSerie, String modelo, float precioCosto, float precioVenta, int existencias){
        this.numSerie=numSerie;
        this.modelo=modelo;
        this.precioCosto=precioCosto;
        this.precioVenta=precioVenta;
        this.existencias=existencias;
    
    }
    
    /*Setters*/

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecioCosto(float precioCosto) {
        this.precioCosto = precioCosto;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
    
    /*getters*/

    public String getNumSerie() {
        return numSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPrecioCosto() {
        return precioCosto;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public int getExistencias() {
        return existencias;
    }
    
    @Override
    public String toString(){
        /*refactor use getters*/
    String numSerieIn=getNumSerie();
    String modeloIn=getModelo();
    float precioCostoIn=getPrecioCosto();
    float precioVentaIn=getPrecioVenta();
    int existenciasIn=getExistencias();
    
    return "Modelo="+modeloIn+"Numero de serie"+numSerieIn+"Precio del Costo"+precioCostoIn+"Precio de venta"+precioVentaIn+"En existencia="+existenciasIn;
            
    }
    
    
}
