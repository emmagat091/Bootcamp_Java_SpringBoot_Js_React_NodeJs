package ejercicio3;

public class Ej3CadenaCaracteres {
    public static void main(String[] args) {
        String cadena = "El veloz murcielago volaba muy alto durante el día y la noche";

        //Buscamos saber que posicion tiene en la cadena.
        int posicion = cadena.indexOf("g");

        if(posicion != -1) {
            System.out.println("la letra 'g' se encuentra en la posición "+posicion);
        }else {
            System.out.println("la letra 'g' no se encuentra en la cadena ingresada");
        }        
    }

}
