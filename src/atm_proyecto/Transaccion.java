/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm_proyecto;

/**
 *
 * @author joelm
 */

public class Transaccion {
    
    //Esta es la clase papá que heredará sus atributos y comportamientos a las clases depósito y retiro.
    
    //atributo privado
    private int monto;
    
    //método público
    public void ejecutar(int monto){
        System.out.println("Transaccion.ejecutar");
    }
    
    
    
    
}