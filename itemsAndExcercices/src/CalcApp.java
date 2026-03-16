import java.util.Scanner;

public class CalcApp {
    double num1, num2;
    Scanner console = new Scanner(System.in);

    public void sum() {

        System.out.println("Suma");

        System.out.println("Ingresa el primer numero:");
        num1 = console.nextDouble();
        System.out.println("Ingresa el segundo numero:");
        num2 = console.nextDouble();
        System.out.println("El resultado de la suma es: " + (num1 + num2));

        main(null);
    }

    public void rest() {

        System.out.println("Resta");
        System.out.println("Ingresa el primer numero:");
        num1 = console.nextDouble();
        System.out.println("Ingresa el segundo numero:");
        num2 = console.nextDouble();
        System.out.println("El resultado de la resta es: " + (num1 - num2));

        main(null);
    }

    public void multiplication() {
        System.out.println("Multiplicacion");
        System.out.println("Ingresa el primer numero:");
        num1 = console.nextDouble();
        System.out.println("Ingresa el segundo numero:");
        num2 = console.nextDouble();
        System.out.println("El resultado de la multiplicacion es: " + (num1 * num2));

        main(null);
    }

    public void division() {
        System.out.println("Division");
        System.out.println("Ingresa el primer numero:");
        num1 = console.nextDouble();
        System.out.println("Ingresa el segundo numero:");
        num2 = console.nextDouble();
        if (num2 != 0) {
            System.out.println("El resultado de la division es: " + (num1 / num2));
        } else {
            System.out.println("Error: Division por cero no permitida.");
        }

        main(null);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("""
                Bienvenido a la calculadora, elige una opcion:
                1. Sumar
                2. Restar
                3. Multiplicar
                4. Dividir
                5. Salir
                """);

        int option = console.nextInt();

        switch (option) {
            case 1 -> new CalcApp().sum();
            case 2 -> new CalcApp().rest();
            case 3 -> new CalcApp().multiplication();
            case 4 -> new CalcApp().division();
            case 5 -> {
                System.out.println("Saliendo de la calculadora...");
                console.close();
            }

            default -> System.out.println("Opcion no valida, elige una opcion del menu\n");
        }

    }
}
