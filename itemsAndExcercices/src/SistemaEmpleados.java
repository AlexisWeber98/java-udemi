import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {

        var console = new Scanner(System.in);

        System.out.print("Introduce el nombre del empleado: ");

        var name = console.nextLine();

        System.out.print("Introduzca la edad del empleado: ");

        var age = Integer.parseInt(console.nextLine());

        System.out.print("Introduzca el salario del empleado: ");

        var salary = Double.parseDouble(console.nextLine());

        System.out.print("¿Es jefe el empleado? (true/false): ");

        var isChief = Boolean.parseBoolean(console.nextLine());

        console.close();

        System.out.println("\n--- Datos del Empleado ---");
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age + " años");
        // System.out.println("Salario: $" + salary);
        // System.out.println("Salario: $%.2f".formatted(salary));
        System.out.printf("Salario: $%.2f%n", salary);
        System.out.println("Es jefe: " + isChief);
    }
}
