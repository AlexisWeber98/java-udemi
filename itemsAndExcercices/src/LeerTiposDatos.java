import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {

        // valor de tipo int

        var console = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");

        var edad = console.nextInt();

        System.out.println("Tu edad es: " + edad);

        // valor de tipo double

        System.out.print("Introduce tu estatura (por ejemplo 1.75): ");

        var heigth = console.nextDouble();

        System.out.println("Tu estatura es: " + heigth);

        // valor de tipo String

        console.nextLine(); // Limpiar el buffer o rompe

        System.out.print("Ingresa tu nombre: ");

        var name = console.nextLine();
        System.out.println("Tu nombre es: " + name);

        // leer int o double sin romper (conversion de datos)

        System.out.print("Ingresa un número: ");
        var enteroString = console.nextLine();
        var integer = Integer.parseInt(enteroString);

        System.out.println("El número ingresado es: " + integer);

        // pedimos float

        System.out.print("Ingresa un número decimal (por ejemplo 3.14): ");
        var floatString = Float.parseFloat(console.nextLine());

        System.out.println("El número decimal ingresado es: " + floatString);

        // double

        System.out.print("Ingresa un número decimal grande (por ejemplo 2.71828): ");
        var doubble = console.nextLine();
        var doubleNUmber = Double.parseDouble(doubble);

        System.out.println("El número decimal ingresado es: " + doubleNUmber);
        console.close();
    }
}
