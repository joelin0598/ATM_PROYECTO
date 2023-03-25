/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm_proyecto;

/**
 *
 * @author joelm
 */

//extends Transaccion realiza la acción de heredar de la clase padre.
public class Retiro extends Transaccion {
        
    //Se había dejado todo comentado, pero por la sobreescritur de métodos en la herencia se dejó el código ya que no es
    //los mismo ejecutar de deposito a ejecutar de retiro
    
    //Características
    private int monto;
    
    //Comportamiento
    public void ejecutar (int monto) {
        System.out.println("Retiro.ejecutar()");
    }
    
    

}
