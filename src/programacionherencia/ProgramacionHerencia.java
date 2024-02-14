/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacionherencia;
import java.util.List;

/**
 *
 * @author Chris
 */
public class ProgramacionHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Programa de herencia");
        System.out.println("A continuacion se crean los objetos de cada uno de los archivos y se verifican con el uso de sus funciones");
        /*requires init*/
        Mueble mueblePrueba = new Mueble("","",0,0,0);
        Silla sillaPrueba = new Silla("", 0,"","",0,0,0 );
        SillaComedor sillaComedorPrueba = new SillaComedor("",false,"",0,"","",0,0,0);
        /*for use the comedor init mesa and list of silla*/
        Mesa mesa = null;
        List<SillaComedor> sillas = null;
        Comedor comedorPrueba = new Comedor(mesa, sillas,"","",0,0,0 );
        Estufa estufaPrueba=new Estufa(0,0,0,"","",0,0,0);
        Escritorio escritorioPrueba=new Escritorio(0,0,0,"","","",0,0,0);
        /*test*/
        mueblePrueba.setExistencias(10);
        System.out.println("Mueble prueba existencias"+mueblePrueba.getExistencias());
        
        sillaPrueba.setMaterial("Madera");
        System.out.println("Silla prueba material"+sillaPrueba.getMaterial());
        
        sillaComedorPrueba.setVentaSeparada(true);
        System.out.println("Silla comedor Prueba venta"+sillaComedorPrueba.isVentaSeparada());
        
        comedorPrueba.setExistencias(10);
        System.out.println("comnedor prueba existencias"+comedorPrueba.getExistencias());
        
        estufaPrueba.setAlto(100);
        System.out.println("estufa Prueba alto"+estufaPrueba.getAlto());
        
        escritorioPrueba.setAncho(100);
        System.out.println("escritorio prueba ancho"+escritorioPrueba.getAncho());
       
        
    }
    
}
