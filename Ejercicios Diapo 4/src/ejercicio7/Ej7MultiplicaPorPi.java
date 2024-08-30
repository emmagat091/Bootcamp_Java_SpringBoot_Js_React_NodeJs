package ejercicio7;

import java.util.Scanner;


public class Ej7MultiplicaPorPi {
    public static void main(String[] args) {
        Scanner ingresoNum = new Scanner(System.in);

        //Se pide ingreso de un numero.
        System.out.print("Por favor ingrese un numero para multiplicar por PI: ");

        double numero = ingresoNum.nextDouble();
        
        //Producto del numero.
        double producto = numero*Math.PI;

        double numeroRedon = Math.round(producto * 100.0) /100.0; // se lo usa para que se redonde en 2 decimales el resultado.
        
        System.out.println("El valor del producto por PI, sin redondear es igual a: " + producto);
        System.out.println("El valor del producto por PI, con redondeo es igual a: " + numeroRedon);
     
        ingresoNum.close(); //cerramos la clase Scanner.
    }
}
