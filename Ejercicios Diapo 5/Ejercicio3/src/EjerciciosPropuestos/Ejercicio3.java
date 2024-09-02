package EjerciciosPropuestos;

import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Por favor ingrese un número arabigo entre 1 y 3999");

        try {
            int numeroArabigo = scanner.nextInt();

            //1)Validamos ingreso número Arabigo.
            validaArabigo(numeroArabigo);

            //2)Convertimos el arabigo a número Romano.
            String numRomano = convierteArabigoARomano(numeroArabigo);

            //3)Mostramos por pantalla la conversion del número 
            System.err.println("El numero Arabigo ingresado es: " +numeroArabigo);
            System.out.println("El número Romano en cuestion es: " + numRomano);

        } catch (Exception e) {
            System.err.println("Error ingreso numero arabigo"+e.getMessage());
        }
     scanner.close();   
    }  

    //Método Validacion numero arabigo.
    private static void validaArabigo(int numArabigo){
      if( numArabigo <=0 || numArabigo >= 4000){
           System.out.println("Se ingreso un número fuera del rango permitido.");
      }
    }

    //Metodo convertir arabigo a Romano.
    private static String convierteArabigoARomano(int num){
        int[] arabigo = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1} ;
        String [] letraNumRomano  = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romano = new StringBuilder();

        for (int i = 0; i < arabigo.length; i++) {
            while (num >= arabigo[i]) {
                romano.append(letraNumRomano[i]);
                num -= arabigo[i];
            }
        }

        return romano.toString();
    }
}






