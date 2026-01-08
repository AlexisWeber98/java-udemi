public class TipoVar {

    public static void main(String[] args) {
        System.out.println("**** Uso de Var en Java ****");
        String nombre1 = "Alejandro";
        var nombre2 = "Alejandro";
        System.out.println("Nombre1: " + nombre1);
        System.out.println("Nombre2: " + nombre2);

        var edad = 27; // se infiere tipo 
        System.out.println("Edad: " + edad);

        var sueldo = 5000.5F; // se infiere el tipo FLOAT
        System.out.println("sueldo = " + sueldo);

        var casado = false; // se infiere el tipo BOOLEAN
        System.out.println("casado = " + casado);
    }
}
