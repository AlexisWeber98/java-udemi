public class ConcatenacionCadenas {
    public static void main(String[] args) {
        System.out.println(" ***** Concatenación de Cadenas ***** ");

        String nombre = "Ana";
        String apellido = "García";

        var nombreCompleto = nombre + " " + apellido;
        System.out.println("Nombre Completo: " + nombreCompleto);

        var saludo = "Hola, " + nombreCompleto + ". Bienvenida!";
        System.out.println(saludo);
    }
}
