import java.util.Scanner;

public class longerNumber {
    public static void main(String[] args) {

        // --------------- longer number -----------------//

        Scanner console = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Enter the first number: ");
        num1 = console.nextInt();
        System.out.println("Enter the second number: ");
        num2 = console.nextInt();

        console.close();

        if (num1 != num2)
            System.out.println("The longer number is: " + ((num1 > num2) ? num1 : num2));
        else
            System.out.println("The numbers are equal.");
    }
}
