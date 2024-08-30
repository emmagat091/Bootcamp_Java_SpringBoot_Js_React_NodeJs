package ejercicio6;

import java.io.Console;

public class Ej6ConvertirAMayus {
   public static void main(String[] args) {
    
    try {
        Console entrada = System.console();

        //se verifica si la consola esta disponible o no
        if(entrada != null){
            //Se lee la entrada por consola.
        String consola = entrada.readLine();
        String mayusConsola = consola.toUpperCase();
        
        //Se muestra por pantalla lo ingresado , pero en mayusculas.
        System.out.println("La cadena de la consola en mayuscula es: " + mayusConsola); 
        }else {
            System.out.println("La consola no esta disponible , disculpas por ello. ");
        }    
         
    } catch (Exception e) {
        System.out.println("Hay un error en el ingreso por consola " + e.getMessage());
    }  
   }
}
