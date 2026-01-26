import java.util.Scanner;

public class RangeChallenge {
    public static void main(String[] args) {
        System.out.println("Range Challenge");

        final int MIN = 0;
        final int MAX = 10;

        var console = new Scanner(System.in);
        System.out.println("Please enter a number between " + MIN + " and " + MAX + ": ");

        var dato = Integer.parseInt(console.nextLine());

        boolean inRange = dato <= MAX && dato >= MIN;

        System.out.println("The number " + dato + " is in range: " + inRange);

    }
}
