public class ManejoSubCadenas {
    public static void main(String[] args) {

        // Subcadenas

        String frase = "Java es un lenguaje de programación orientado a objetos";
        System.out.println("frase: " + frase);


        String subcadena1 = frase.substring(0,35);
        System.out.println("subcadena1: " + subcadena1);
        String subcadena2 = frase.substring(36);

        System.out.println("subcadena2: " + subcadena2);

        // Busqueda de Subcadenas

        int indice = frase.indexOf("programación");

        System.out.println("indice = " + indice);

        System.out.println("'lenguaje' aparece en el indice: " + frase.indexOf("lenguaje"));


        // ultima apricion de la subcadena

        System.out.println("'a' aparece por ultima vez en el indice: " + frase.lastIndexOf("a"));
        System.out.println("'orientado' aparece por ultima vez en el indice: " + frase.lastIndexOf("orientado"));


        // subcadena que no existe

        System.out.println("'mundo' aparece en el indice: " + frase.indexOf("mundo") + " ('-1' significa que no existe o no esta)"); // -1;

    // reemplazar subcadenas

        String cadena1 = "Hola Mundo";
        System.out.println("cadena1: " + cadena1);
        String cadena2 = cadena1.replace("Mundo", "Java");
        System.out.println("cadena2: " + cadena2);
        String cadena3 = cadena1.replace("Hola", "Saludos");
        System.out.println("cadena3: " + cadena3);
    }
}
