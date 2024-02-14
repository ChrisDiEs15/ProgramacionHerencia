/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionherencia;

/**
 *
 * @author Chris
 */
public class Mesa extends Mueble {
    
    private float largo;
    private float ancho;
    private float alto;
    private Object materialSoporte;
    
    public Mesa(float largo, float ancho, float alto, Object materialSoporte, String numSerie, String modelo, float precioCosto, float precioVenta, int existencias){
        super(numSerie, modelo, precioCosto,  precioVenta,  existencias);
        this.largo=largo;
        this.ancho=ancho;
        this.alto=alto;
        this.materialSoporte=materialSoporte;
    }
    
    /*setters*/

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public void setMaterialSoporte(Object materialSoporte) {
        this.materialSoporte = materialSoporte;
    }
    
    /*getters*/

    public float getLargo() {
        return largo;
    }

    public float getAncho() {
        return ancho;
    }

    public float getAlto() {
        return alto;
    }

    public Object getMaterialSoporte() {
        return materialSoporte;
    }
    
    @Override
    public String toString(){
    /*getting Info*/
    float largoIn=getLargo();
    float anchoIn=getAncho();
    float altoIn=getAlto();
    /*Object requires other methods to access and tostring the variables stored in object*/
    /*return getClass().getName() + "@" + Integer.toHexString(hashCode());??*/
    
    /*get info from Mueble*/
    String superInfo=super.toString();
    /*add info silla*/
    String mesaInfo="El largo de la mesa es "+largoIn+"El ancho de la mesa es"+anchoIn+"El alto de la mesa es"+altoIn;
    /*concat info from super and silla*/
    return mesaInfo.concat(superInfo);
    
    }
}
