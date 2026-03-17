public class Matrix {
    public static void main(String[] args) {
        // las matrices son arreglos de dos dimensiones (filas y columnas)

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
        // imprimir la tabla completa (la matriz)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
