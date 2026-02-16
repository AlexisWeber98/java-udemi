import java.util.Scanner;

public class MirrorHause {
    public static void main(String[] args) {
        int age;
        boolean isAfraid;
        Scanner console = new Scanner(System.in);

        System.out.println(" ***** Welcome to the Mirror House! *****");

        System.out.println("Please enter you age:");
        age = console.nextInt();

        System.out.println("Are you afraid of darknes? (true/false)");
        isAfraid = console.nextBoolean();

        console.close();

        if (age >= 12 && !isAfraid) {
            System.out.println("Welcome to the Mirror House! Enjoy your visit!");
        } else {
            System.out.println(
                    "Sorry, you cannot enter the Mirror House. You must be at least 12 years old and not afraid of darkness.");
        }
    }
}
