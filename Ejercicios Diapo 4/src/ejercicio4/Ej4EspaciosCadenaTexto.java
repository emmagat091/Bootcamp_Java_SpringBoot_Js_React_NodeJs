package ejercicio4;

public class Ej4EspaciosCadenaTexto {
    public static void main(String[] args) {
        String texto = "La casa de la esquina es muy grande";

        //Quitamos espacios del texto.
        String textoSinEspacios = texto.replace(" ", "");

        //Contador de cadena.
        int conEspacios = texto.length();
        int sinEspacios = textoSinEspacios.length();
        
        //Cadena con y sin espacios.
        System.out.println("El tamaño de la cadena con espacios es de: "+ conEspacios);
        System.out.println("El tamaño de la cadena sin espacios es de: "+ sinEspacios);



    }

}
