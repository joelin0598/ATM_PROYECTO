/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm_proyecto;

/**
 *
 * @author joelm
 */
public class ATM_PROYECTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Para poder crear el objeto, se debe nombrar
        //"new" permite crear el objeto
        Cuenta cuentaObj = new Cuenta("Jonathan");
        //en OBB existen tres momentos
        //#1 'new Cuenta();' - Cuando se ejecuta crea un nuevo objeto de tipo cuenta, tomo la clase cuenta y en base a ello se creo un objeto
        //#2 'Cuenta cuenta Obj' - java elije una casilla de memoria "Cuenta" se elije como el tipo de dato, pero en realidad es una clase y se le asinga el nombre de "cuentaObj"
        //#3 '=' - Almacena el objeto/referencia al lugar donde se encuentra el objeto.
        //Paréntesis después de Cuenta(); quiere representar a un constructor para que Java lo intreprete y cree el objeto en base al método
        //Sirven para poderle dar entradas al constructor.
        
        //Da error porque protegimos nuestros datos en la clase de Cuenta
        //Se soluciona con los métodos getters y setters
        cuentaObj.setNumeroDeCuenta(99987);
        /*cuentaObj.getNumeroDeCuenta();
        TecladoNumerico tecladoNumerico = new TecladoNumerico();
        ATM atmObj = new ATM(tecladoNumerico);
        */
        
        /*
        Retiro retiroObj = new Retiro();
        retiroObj.ejecutar(0);
        
        Deposito depositoObj = new Deposito();
        depositoObj.ejecutar(0);
        */
        /*Transaccion transaccionObj = new Transaccion();
        transaccionObj.ejecutar(0);
        */
        
        /*Repaso de la ejecución de los métodos
        Retiro retiroObj = new Retiro();
        retiroObj.ejecutar(0);
        
        Deposito depositoObj = new Deposito();
        depositoObj.ejecutar(0);
        */
        
        /*El polimorfismo permite asignar a variables de un tipo padre a objetos de cualquier tipo de hijos
        Transaccion transaccionObj1 = new Deposito();
        transaccionObj1.ejecutar(0);
        Transaccion transaccionObj2 = new Retiro();
        transaccionObj2.ejecutar(0);
        */
        
        /*
        int[] arr1 = new int[2];
        
        Transaccion [] arr2 = new Transaccion[2];
        arr2[0] = new Retiro();
        arr2[1] = new Deposito ();
        
        arr2[0].ejecutar(0);
        arr2[1].ejecutar(0);
        */
        
        /*
        Pantalla pantallaObj = new Pantalla();
        pantallaObj.mostrarMensaje("Hola Mundo");
        */
        
        ATM atmObj = new ATM();
        
    }
    
}
