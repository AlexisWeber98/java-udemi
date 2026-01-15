public class ComparacionCadenas {
    public static void main(String[] args) {
        // comparacion de cadenas

        var cadena1 = "Java";
        var cadena2 = "Java";

        var cadena3 = new String("Java");

        // == compara la referencia en memoria

        System.out.println("Cadena1 y cadena2 son iguales en memoria? : " + (cadena1 == cadena2)); // true
        
        System.out.println("Cadena1 y cadena3 son iguales en memoria? : " + (cadena1 == cadena3)); // false

        // Equals compara el contenido de las cadenas
        System.out.println("Cadena1 y cadena2 son iguales en contenido? : " + (cadena1.equals(cadena2))); // true
        System.out.println("Cadena1 y cadena3 son iguales en contenido? : " + (cadena1.equals(cadena3))); // true

   }
}