/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm_proyecto;

/**
 *
 * @author joelm
 */

//public: significa que estamos dandle el acceso al proyecto sobre este nuevo archivo
//class:
//Cuenta: importante el nombre de la clase debe ser el mismo del nombre del archivo
//{}: dentro de los corchetes debe de estar todo el código que le corresponda a la clase.
public class Cuenta {
//Las características dentro de las Clases se convierten en java en variables
// acceso private, definido en apuntes de clase 2023 02 25, se le llama encapsulameiento
private float saldo;
private float saldoFlotante;
private int numeroDeCuenta;
private int nip;

//consturctor, no tiene un tipo de dato para el retorno
//las instrucciones al invocar el constructor Cuenta va a ser un mensaje "Hola Mundo"
//dentro de paréntesis se colocan los parámetros o el tipo de dato que queremos poder ingresar.
//get permite obtener o retornar el valor de la varible por ejemplo: getNumeroDeCuetna (parámetro){tipo de dato y valor:"return numeroDeCuenta"};
//set permite asignar el valor a nuestras variables que estén declaradas en la clase dentro de un método ejemplo:
//
    
Cuenta(String nombre){
    System.out.println("Hola " + nombre);
        }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldoFlotante() {
        return saldoFlotante;
    }

    public void setSaldoFlotante(float saldoFlotante) {
        this.saldoFlotante = saldoFlotante;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        if(numeroDeCuenta > 9999 && numeroDeCuenta < 100000)
        this.numeroDeCuenta = numeroDeCuenta;
        else {System.out.println("El numero de cuenta no es válido"); 
        }
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

//click derecho, insert Code, Getter an Setter, seleccionar todas las variables, generate

//fuera de las llaves; tipo de dato y nombre de método (parametros o entradas; se define tipo de dato y el nombre de la entrada)
//en int obtenerSaldo(int numeroDeCuenta){} nos muestra un error porque esta creado para retornar un dato por lo que podemos solucionarlo por el momento
//retornando con {return 0;}
int obtenerSaldo(int numeroDeCuenta){return 0;}
void acreditar(int monto){}
void debitar(int monto){}
    
}
