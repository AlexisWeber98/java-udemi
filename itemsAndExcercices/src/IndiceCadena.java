public class IndiceCadena {
    public static void main(String[] args) {
        System.out.println(" ***** Índice de una Cadena ***** ");

        String cadena1 = "Hola Mundo";
        var primerCaracter = cadena1.charAt(0);
        System.out.println("primer Caracter = " + primerCaracter);

        var ultimoCaracter = cadena1.charAt(cadena1.length() - 1);
        System.out.println("ultimo Caracter = " + ultimoCaracter);

        char letraM = cadena1.charAt(5);
        System.out.println("letraM = " + letraM);
    }
}
