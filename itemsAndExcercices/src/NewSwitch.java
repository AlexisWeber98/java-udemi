import java.util.Scanner;

public class NewSwitch {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero del 1 al 7: ");

        Scanner console = new Scanner(System.in);
        int day = console.nextInt();
        console.close();

        switch (day) {
            case 1 -> System.out.println("Es Lunes");
            case 2 -> System.out.println("Es Martes");
            case 3 -> System.out.println("Es Miercoles");
            case 4 -> System.out.println("Es Jueves");
            case 5 -> System.out.println("Es Viernes");
            case 6 -> System.out.println("Es Sabado");
            case 7 -> System.out.println("Es Domingo");
            default -> System.out.println("Numero invalido");
        }

    }
}
