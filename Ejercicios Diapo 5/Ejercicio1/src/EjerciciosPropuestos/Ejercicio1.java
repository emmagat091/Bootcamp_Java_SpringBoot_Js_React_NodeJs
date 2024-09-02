package EjerciciosPropuestos;

import java.util.Random;  
  
public class Ejercicio1 {

    /** se busca desarrolla un programa que diseñe una matriz de 35 filas, y 11 columnas , y se realicen diferentes operaciones. 
     * @author : Emmanuel Gatica.
     * @return : Debe retornar la matriz con los valores aleatorios entre un rango de 1 a 500.
     */    

    public static void main(String[] args) {
        int filas = 35;
        int columnas = 11;

        //1) Creamos la matriz de 35 filas X 11 columnas.
        int [][] matriz = new int [filas][columnas];

        //2)Creamos el vector de tamaño 100
        int [] vector = new int[100];
        Random aleatorio = new Random();
         
        for (int i =0; i< vector.length; i++){
          int numeroAleatorio = aleatorio.nextInt(500) + 1; // Genera números entre 1 y 500.
          vector[i] = numeroAleatorio;

        }

        //3)Multiplicamos el vector por 3 y almacenamos.
        int contadorVector = 0;
        for(int i = 0; i< filas && contadorVector < vector.length; i++){
             for(int j = 0 ; j < columnas && contadorVector < vector.length; j++){
                
                matriz[i][j] = vector[contadorVector] * 3; // Multiplicacion del vector.
                contadorVector++;                
           }           
        }

        //4)Datos del vector forma inversa, y sumar posiciones pares e impares , dentro de la matriz original.
        
        int [] vectorInverso = new int[50]; // creamos el vector inverso. El tamaño es 50 porque almacena par e impar de valores.
        int contadorInversoVector =0;

        for(int i= 99 ; i> 0; i -=2){
            vectorInverso[contadorInversoVector++] = vector[i] + vector[i - 1];   //vector[i-1] --> Par Anterior , vector[i] --> Impar.
        }

        //Nos situamos desde la posicion 100.
        contadorVector = 0;
        for(int i = 0; i < filas && contadorVector< vectorInverso.length;i++){
            for(int j = 0 ; j < columnas && contadorVector < vectorInverso.length ; j++){
                if (i * columnas + j >= 100 && contadorVector < vectorInverso.length) {
                matriz[i][ j] =  vectorInverso[contadorVector++];                
                }
            }
        }    
        //5) En los ultimos 150 lugares, vamos a agregar los 150 primeros pero en forma inversa. Vamos a crear un vector temporal.
        int [] vectorTemporal = new int[150];
        contadorVector = 0;

        for(int i = 0; i<filas && contadorVector < 150; i++){
            for(int j = 0; j< columnas && contadorVector < 150; j++){
                vectorTemporal[contadorVector++] = matriz[i][j];
            }
        }

        //Realizamos la inversa del vector. y guardamos los valores en los ultimos 150 lugares de la matriz.
        contadorVector = 149;

        for(int i= filas-1 ; i >= 0  && contadorVector >= 0; i--){
            for(int j = columnas-1 ; j >= 0 && contadorVector >= 0; j--){
                matriz[i][j] = vectorTemporal[contadorVector--];
            }

        }
        
        // 6) imprimimos por pantalla la martiz
        for(int i=0 ; i < filas; i++){
            for(int j=0 ; j< columnas ; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}