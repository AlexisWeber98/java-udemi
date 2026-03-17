import java.util.Scanner;

public class DynamicMatrix {
    public static void main(String[] args) {
        int rows, columns;

        Scanner console = new Scanner(System.in);

        System.out.println("¿Cuántas filas tendrá la matriz?");
        rows = console.nextInt();
        System.out.println("¿Cuántas columnas tendrá la matriz?");
        columns = console.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Matriz creada con " + rows + " filas y " + columns + " columnas.");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Ingrese el valor para la posición [" + i + "][" + j + "]:");
                matrix[i][j] = console.nextInt();
            }
        }

        console.close();

        System.out.println("Matriz ingresada:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println(" el valor para la posición [" + i + "][" + j + "]: " + matrix[i][j]);

            }
        }
    }
}