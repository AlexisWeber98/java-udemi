public class CaracteresEspeciales {
    public static void main(String[] args) {

        String cadena1 = "Hola Mundo\n mudial mundialito";
        System.out.println("cadenas unasa: " + cadena1);

        String cadena2 = "Hola\tMundo\tmundialito";
        System.out.println("cadenas con tabulador: " + cadena2);

        String cadena3 = "Hola \' mundooooo \' mundialito";
        System.out.println("cadenas con comillas simples: " + cadena3);

        String cadena4 = "Hola \" mundooooo \" mundialito";
        System.out.println("cadenas con comillas dobles: " + cadena4);

        String cadena5 = "hola \\ mundo \\ mundialito";
        System.out.println("cadenas con barra invertida: " + cadena5);

    }
}