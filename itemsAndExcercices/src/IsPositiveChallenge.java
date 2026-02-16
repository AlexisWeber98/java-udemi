import java.util.Scanner;

public class IsPositiveChallenge {
    public static void main(String[] args) {

        System.out.println("give me a number and i will tell you if it is positive, negative or zero7");
        Scanner console = new Scanner(System.in);

        int number = console.nextInt();

        console.close();
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("the number is 0");
        }
    }
}
