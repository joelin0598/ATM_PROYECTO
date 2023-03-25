/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm_proyecto;

/**
 *
 * @author joelm
 */
public class ATM {
    
    //A continuación vamos representar las relaciones, composición, asociación y agregación
    
    //PARA COMPOSICION
    //la Clase ATM, el todo, se encarga de instanciar los objetos.
    /*
    RanuraParaDepositos ranuraParaDepositosObj = new RanuraParaDepositos();
    TecladoNumerico tecladoNumericoObj = new TecladoNumerico();
    Pantalla pantallaObj = new Pantalla();
    Dispensador dispensadorObj = new Dispensador();
    */
    
    //Tambien se puede reprentar con un constructor
    //mas que todo es una manera de estructurarlo "semántica" en el código
    
    private RanuraParaDepositos ranuraParaDepositosObj;
    private TecladoNumerico tecladoNumericoObj;
    private Pantalla pantallaObj;
    private Dispensador dispensadorObj;
    
    /*Para hacer mas esepecifico este constructor para las variables se usa this.*/
    public ATM() {
        this.ranuraParaDepositosObj = new RanuraParaDepositos();
        this.tecladoNumericoObj = new TecladoNumerico();
        this.pantallaObj = new Pantalla();
        this.dispensadorObj = new Dispensador();
        
        this.solicitarDatos();
    }
    
    private void solicitarDatos() {
        pantallaObj.mostrarMensaje("Bienvenido!\n");
        pantallaObj.mostrarMensaje("Ingrese su número de cuenta: ");
        int numeroCuenta = tecladoNumericoObj.capturarDatos();
    }
    
    
    /*
    ATM (){
    ranuraParaDepositosObj = new RanuraParaDepositos();
    tecladoNumericoObj = new TecladoNumerico();
    pantallaObj = new Pantalla();
    dispensadorObj = new Dispensador();
    }
    */
    
    /*PARA AGREGACION
    ATM (TecladoNumerico tecladoNumericoObj){
    ranuraParaDepositosObj = new RanuraParaDepositos();
    tecladoNumericoObj = tecladoNumericoObj;
    pantallaObj = new Pantalla();
    dispensadorObj = new Dispensador();
    }
    */
    
    /*
    Public void polimorfismo(Transaccion trans){
        trans.ejecutar(0);
    }
    */
}
