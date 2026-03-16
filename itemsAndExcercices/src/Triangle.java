import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ingresa numero de filas del triángulo:");
        int rows = console.nextInt();
        console.close();

        for (int i = 1; i <= rows; i++) {

            String whiteSpaces = " ".repeat(rows - i);

            String stars = "*".repeat(2 * i - 1);
            System.out.println(whiteSpaces + stars);

        }
    }
}
