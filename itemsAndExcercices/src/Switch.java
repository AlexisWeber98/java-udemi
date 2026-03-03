import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        System.out.println("Ingrese un numero del 1 al 7: ");

        Scanner console = new Scanner(System.in);
        int day = console.nextInt();
        console.close();

        switch (day) {
            case 1:
                System.out.println("Es Lunes");
                break;
            case 2:
                System.out.println("Es Martes");
                break;
            case 3:
                System.out.println("Es Miercoles");
                break;
            case 4:
                System.out.println("Es Jueves");
                break;
            case 5:
                System.out.println("Es Viernes");
                break;
            case 6:
                System.out.println("Es Sabado");
                break;
            case 7:
                System.out.println("Es Domingo");
                break;
            default:
                System.out.println("Numero invalido");
        }

    }

}
