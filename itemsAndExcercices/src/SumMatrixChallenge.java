import java.util.Scanner;

public class SumMatrixChallenge {
    public static void main(String[] args) {
        int row, column;
        int sum = 0;

        Scanner console = new Scanner(System.in);

        System.out.println("¿Cuántas filas tendrá la matriz?");
        row = console.nextInt();
        System.out.println("¿Cuántas columnas tendrá la matriz?");
        column = console.nextInt();

        int[][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Ingrese el valor para la posición [" + i + "][" + j + "]:");
                matrix[i][j] = console.nextInt();

            }
        }

        console.close();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("La suma de la diagonal principal es: " + sum);
    }
}
