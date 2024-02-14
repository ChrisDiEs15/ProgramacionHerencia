/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionherencia;

/**
 *
 * @author Chris
 */
public class Silla extends Mueble {
    
    /*attribs*/
    private String material;
    private int numPatas;
            
            public Silla(String material, int numPatas, String numSerie, String modelo, float precioCosto, float precioVenta, int existencias ){
                super(numSerie, modelo, precioCosto, precioVenta, existencias);
                this.material=material;
                this.numPatas=numPatas;
            
            }
            
     /*setters*/
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
    
   /*getters*/
    public String getMaterial() {
        return material;
    }

    public int getNumPatas() {
        return numPatas;
    }

    @Override
    public String toString(){
    /*getting Info*/
    String materialIn=getMaterial();
    int numPatasIn=getNumPatas();
    /*get info from Mueble*/
    String superInfo=super.toString();
    /*add info silla*/
    String sillaInfo="El material es "+materialIn+"y el numero de patas es"+numPatasIn;
    /*concat info from super and silla*/
    return sillaInfo.concat(superInfo);
    
    }
   
    
}
