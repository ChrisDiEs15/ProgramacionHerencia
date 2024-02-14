/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionherencia;

/**
 *
 * @author Chris
 */
public class SillaComedor extends Silla {
    
    private String modeloComedor;
    private boolean ventaSeparada;
    
    public SillaComedor(String modeloComedor, boolean ventaSeparada, String material, int numPatas, String numSerie, String modelo, float precioCosto, float precioVenta, int existencias){
    super(material, numPatas, numSerie, modelo, precioCosto, precioVenta, existencias);
    this.modeloComedor=modeloComedor;
    this.ventaSeparada=ventaSeparada;
    }
    
    /*Setters*/

    public void setModeloComedor(String modeloComedor) {
        this.modeloComedor = modeloComedor;
    }

    public void setVentaSeparada(boolean ventaSeparada) {
        this.ventaSeparada = ventaSeparada;
    }
    
    /*Getters*/

    public String getModeloComedor() {
        return modeloComedor;
    }

    public boolean isVentaSeparada() {
        return ventaSeparada;
    }
    
@Override
    public String toString(){
    /*getting Info from SillaComedor*/
    String modeloComedorIn=getModeloComedor();
    boolean ventaSeparadaIn=isVentaSeparada();
    /*get info from silla*/
    String superInfo=super.toString();
    /*add info silla*/
    String sillaComedorInfo="Es del modelo de comedor "+modeloComedorIn+" la venta es separada="+ventaSeparadaIn;
    /*concat info from super and silla*/
    return sillaComedorInfo.concat(superInfo);
    
    }
    
    
}
