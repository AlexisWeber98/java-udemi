import java.util.Locale;

public class MetodosDeCadenas {
    public static void main(String[] args) {
        // Metodos de cadenas

        String cadena1 = "Hola Madrid!";

        System.out.println("largo de cadena1: " + cadena1.length());

        // Reemplazar caracteres

        String cadena2 = cadena1.replace("o", "a");
        System.out.println("cadena2: " + cadena2);

        // Convertir a myusculas

        String cadena3 = cadena1.toUpperCase();
        System.out.println("cadena3: " + cadena3);

        // Convertir a minusculas

        System.out.println("cadena1 a minusculas: " + cadena1.toLowerCase());

        // eliminar espacios innecesarios

        String cadena4 = "   Hola    ";
        System.out.println("cadena4 con espacios: " + cadena4);
        System.out.println("cadena4 sin espacios:ManejoSubCade " + cadena4.trim());
    }
}
