/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionherencia;

import java.util.List;

/**
 *
 * @author Chris
 */
public class Comedor extends Mueble{
    
    
   private Mesa mesa;
   /*Lits of type sillaComedor*/
   private List<SillaComedor> sillas;
    
    public Comedor(Mesa mesa, List<SillaComedor> sillas, String numSerie, String modelo, float precioCosto, float precioVenta, int existencias){
        super( numSerie,  modelo,  precioCosto, precioVenta,  existencias);
    this.mesa=mesa;
    this.sillas=sillas;
    }
    /*getters*/

    public Mesa getMesa() {
        return mesa;
    }

    public List<SillaComedor> getSillas() {
        return sillas;
    }
    /*setters*/

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public void setSillas(List<SillaComedor> sillas) {
        this.sillas = sillas;
    }
    
}
