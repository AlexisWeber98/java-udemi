

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

    // mas formas de concatenar cadenas

        String cadenaA = "Hola";
        String cadenaB = "Mundo";

        String cadenaC = cadenaA + " " + cadenaB;

        System.out.println("cadenaC: " + cadenaC);

        // metodo concat()

        String resutado1  = cadenaA.concat(cadenaB);
        System.out.println("resutado1 = " + resutado1);

        String resutado2  = cadenaA.concat(" ").concat(cadenaB);
        System.out.println("resutado2 = " + resutado2);

        // stringBuilder() mas efisciente para concatenar muchas cadenas

        var constructorDeCadenas = new StringBuilder();

        constructorDeCadenas.append(cadenaA);
        constructorDeCadenas.append(" ");
        constructorDeCadenas.append(cadenaB);
        constructorDeCadenas.append(" mundial");
        constructorDeCadenas.append (" mundialito mundalotoski");

        System.out.println("constructorDeCadenas = " + constructorDeCadenas.toString());


        // stringBuffer() es similar a StringBuilder pero es sincronizado (thread-safe)

        var constructorDeCadenas2 = new StringBuffer();



        constructorDeCadenas2.append(cadenaA).append(" ").append(cadenaB).append(" universal").toString();
        System.out.println("constructorDeCadenas2 = " + constructorDeCadenas2);



        // Join() une cadenas con un delimitador

       var resultado = String.join(" - ",cadenaA, cadenaB, "todo", "bien?");
       System.out.println("resultado = " + resultado);


       String name = "Alexis";
       String lastName = "Weber";

         String fullName = String.join(" ", name, lastName);
        System.out.println("fullName = " + fullName);

    }
}
