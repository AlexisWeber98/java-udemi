public class InmutabilidadDeCadenas {
    public static void main(String[] args) {
        System.out.println(" ***** Inmutabilidad de Cadenas ***** ");

        String cadena1 = "Hola";
        System.out.println("cadena inicial: " + cadena1);

        var cadena2 = cadena1;
        cadena1 = "Adios";
        System.out.println("cadena modificada: " + cadena1);

        System.out.println("cadena2 = " + cadena2);
    }
}
