package ejercicio5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Ej5LecturaDatosTeclados {
    public static void main(String[] args) {
        try {
          //Definimos la clase BufferedReader   
          BufferedReader cadena = new BufferedReader(new InputStreamReader(System.in));
          
          //Ingreso de texto por la consola
          System.out.print("Ingrese la cadena de texto o una frase ");

          //Se lee la cadena ingresada por consola   
          String texto = cadena.readLine();
          
          //Cantidad de caracteres cadena y mitad cadena.
          int largoTexto = texto.length();
          int mitadTexto = (texto.length())/2;  

          System.out.println("La cadena original tiene: "+ largoTexto + " caracteres");
          System.out.println("La mitad de la cadena tiene: "+ mitadTexto + " caracteres");

          //Mostrar mitad texto
          String nuevoTexto = texto.substring(0,mitadTexto);
          System.out.println("La nueva cadena de texto es: "+nuevoTexto);

        } catch (IOException e) {
            System.out.println("Ocurrio un error ingreso texto " + e.getMessage());
        }


    }    




}


