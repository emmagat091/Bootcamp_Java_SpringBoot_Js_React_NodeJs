package EjerciciosPropuestos;


import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
     Scanner scanner = new Scanner(System.in);
     System.err.print("Ingrese una cadena de caracteres, que representen números Romanos: ");
     
     String numeroRomano = scanner.nextLine().toUpperCase();


     try {        
        //1)Método para validar el numero romano.
        validaRomano(numeroRomano);

        //2)Método para convertir número romano a arabigo
        int numeroArabigo = convierteRomanoAArabigo(numeroRomano);
        
        //3)Mostrar por consula el resultado.
        System.out.println("El número Romano ingresado es: " + numeroRomano);
        System.out.println("El número arabigo correspondiente es: " + numeroArabigo);


     } catch (IllegalArgumentException e) {
        System.out.println("Error en la entrada y validacion de números Romanos" + e.getMessage());
     }
     scanner.close();
    }

     //Método para validar ingresos números Romanos.
     private static void validaRomano(String entradaRomano){

        //Valida cadena vacia de caracteres.
        if(entradaRomano.isEmpty()){
            throw new IllegalArgumentException("La cadena de entrada es vacia.");
        }
     
        //Valida si los caracteres son validos o no.
        if(!entradaRomano.matches("[IVXLCDM]+")){
            throw new IllegalArgumentException("Los valores ingresados no corresponden a numeros romanos.");
        }

        //Valida de repeticiones no permitidas.
        if (entradaRomano.contains("IIII") || entradaRomano.contains("VV") || entradaRomano.contains("XXXX") ||
            entradaRomano.contains("LL") || entradaRomano.contains("CCCC") || entradaRomano.contains("DD") ||
            entradaRomano.contains("MMMM")) {
            throw new IllegalArgumentException("El numero romano tiene repeticion de convinaciones invalidas.");
        }

        //Valida convinaciones correctas.
        if (entradaRomano.contains("IL") || entradaRomano.contains("IC") || entradaRomano.contains("ID") ||
            entradaRomano.contains("IM") || entradaRomano.contains("VX") || entradaRomano.contains("VL") ||
            entradaRomano.contains("VC") || entradaRomano.contains("VD") || entradaRomano.contains("VM") ||
            entradaRomano.contains("XD") || entradaRomano.contains("XM") || entradaRomano.contains("LC") ||
            entradaRomano.contains("LD") || entradaRomano.contains("LM") || entradaRomano.contains("DM")) {
            throw new IllegalArgumentException("El número romano contiene combinaciones inválidas.");
        }
    }

    private static int convierteRomanoAArabigo(String entradaRomano) {
        int[] numArabigo = {1000, 500, 100, 50, 10, 5, 1};
        char[] caracterRomano = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};

        int total = 0;
        int prevValue = 0;

        for (int i = 0; i < entradaRomano.length(); i++) {
            char currentSymbol = entradaRomano.charAt(i);
            int currentValue = 0;

            for (int j = 0; j < caracterRomano.length; j++) {
                if (currentSymbol == caracterRomano[j]) {
                    currentValue = numArabigo[j];
                    break;
                }
            }

            if (currentValue > prevValue) {
                total += currentValue - 2 * prevValue;
            } else {
                total += currentValue;
            }

            prevValue = currentValue;
        }

        return total;
    }


}
