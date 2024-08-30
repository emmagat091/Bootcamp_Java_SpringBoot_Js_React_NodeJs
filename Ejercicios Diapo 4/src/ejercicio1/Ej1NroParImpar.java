package ejercicio1;

import java.util.Scanner;

public class Ej1NroParImpar {
  public static void main(String[] args) {
    
    // Se crea la instancia de Scanner para que leea el valor que se ingresa. 
    Scanner entrada = new Scanner(System.in);

    System.out.print("Ingrese un número mayor a 0: ");
    
    int numero = entrada.nextInt();

    // Se evalua si el número es par o impar.
    if (numero % 2 == 0) {
        System.out.println("El número "+ numero + " ,es número Par.");
    }else{
        System.out.println("El número "+ numero + " ,es número Impar.");
     }
     entrada.close();

    }


}
