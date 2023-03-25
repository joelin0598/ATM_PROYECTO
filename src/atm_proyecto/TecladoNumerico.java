/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm_proyecto;

import java.util.Scanner;

/**
 *
 * @author joelm
 */
public class TecladoNumerico {
    
    private Scanner scan;
    
    //Características
    
    //Comportamiento
    
    public TecladoNumerico() {
        scan = new Scanner(System.in);
    }
    
    public int capturarDatos(){
    return scan.nextInt();
    }
    
}
