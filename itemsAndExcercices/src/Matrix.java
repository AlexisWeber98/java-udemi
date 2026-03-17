public class Matrix {
    public static void main(String[] args) {
        // las matrices son arreglos de dos dimensiones (filas y columnas)
        final int ROWS = 3;
        final int COLS = 3;
        int[][] matrix = new int[3][3];

        // modificar alores de la matriz
        matrix[0][0] = 100;
        matrix[0][1] = 200;
        matrix[0][2] = 300;
        matrix[1][0] = 400;
        matrix[1][1] = 500;
        matrix[1][2] = 600;
        matrix[2][0] = 700;
        matrix[2][1] = 800;
        matrix[2][2] = 900;

        // imprimir los valores de la matriz

        System.out.println("Valor en la posición [0][0]: " + matrix[0][0]);
        System.out.println("Valor en la posición [1][1]: " + matrix[1][1]);
        System.out.println("Valor en la posición [2][2]: " + matrix[2][2] + "\n\n");

        // recorrer una matriz

        for (int ren = 0; ren < ROWS; ren++) {
            for (int col = 0; col < COLS; col++) {
                System.out.println("Valor en la posición [" + ren + "][" + col + "]: " + matrix[ren][col]);
            }
        }

    }

}
