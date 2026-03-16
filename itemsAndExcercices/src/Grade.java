import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int gradeSizeList;

        System.out.println("Ingrese el numero de calificaciones: ");
        gradeSizeList = console.nextInt();

        int[] gradeList = new int[gradeSizeList];

        for (int i = 0; i < gradeSizeList; i++) {
            System.out.print("Ingrese la calificacion para el estudiante " + (i + 1) + ": ");
            gradeList[i] = console.nextInt();
        }
        console.close();

        int sum = 0;

        for (int j = 0; j < gradeList.length; j++) {
            sum += gradeList[j];
        }

        double average = (double) sum / gradeList.length;
        System.out.println("El promedio de las calificaciones es: " + average);
    }
}
