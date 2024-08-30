package ejercicio2;

import java.util.Random;

public class Ej2NumMayorMenor {
    public static void main(String[] args) {
        Random random = new Random();

        int aleatorio1 = random.nextInt(100);
        int aleatorio2 = random.nextInt(100);

        //Que valores se generan
        System.out.println("El primer número aleatorio es: "+ aleatorio1);
        System.out.println("El segundo número aleatorio es: "+ aleatorio2);


        //Se comparan los valores 
        if(aleatorio1 > aleatorio2) {
            System.out.println();
            System.out.println("El primer numero ingresado, es mayor al segundo.");
            return;
        } else {
            System.out.println();
            System.out.println("El segundo numero ingresado, es mayor al primero.");
        }

    }

}
