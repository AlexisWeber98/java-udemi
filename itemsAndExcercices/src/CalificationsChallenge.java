import java.util.Scanner;

public class CalificationsChallenge {
    public static void main(String[] args) {
        /*
         * convertir calificacioon numerica al corresponmdiente literal
         * si la calificacion es >= 9 y <= 10 imprimir A
         * si la calificacion es >= 8 y < 9 imprimir B
         * si la calificacion es >= 7 y < 8 imprimir C
         * si la calificacion es >= 6 y < 7 imprimir D
         * si la calificacion es >= 0 y < 6 imprimir F
         * si la calificacion es < 0 o > 10 imprimir "calificacion no valida"
         */

        Scanner console = new Scanner(System.in);

        System.out.println(
                "---------------------------------- Ingresa una calificacion numerica ----------------------------");
        double calificacion = console.nextDouble();

        console.close();

        if (calificacion >= 9 && calificacion <= 10)
            System.out.println("A");

        else if (calificacion >= 8 && calificacion < 9)
            System.out.println("B");

        else if (calificacion >= 7 && calificacion < 8)
            System.out.println("C");

        else if (calificacion >= 6 && calificacion < 7)
            System.out.println("D");

        else if (calificacion >= 0 && calificacion < 6)
            System.out.println("F");

        else
            System.out.println("calificacion no valida");
    }
}
