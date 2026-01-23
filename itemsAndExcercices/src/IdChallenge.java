import java.util.Scanner;
import java.util.random.*;

public class IdChallenge {
    public static void main(String[] args) {

        System.out.println(" *** Sistema de generación de ID *** ");
        Scanner console = new Scanner(System.in);
        String name;
        String lastName;
        int yearOfBirth;

        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        // "---------------------------------------" //

        System.out.print("What's your name? ");
        name = console.nextLine().trim();

        System.out.println("what is your laste name? ");
        lastName = console.nextLine();

        System.out.println("what is your year of birth? ");
        yearOfBirth = Integer.parseInt(console.nextLine());

        console.close();

        // normalizer

        String nameID = name.toUpperCase().substring(0, 2);
        String lastNameID = lastName.toUpperCase().substring(0, 2);
        var yearID = Integer.toString(yearOfBirth).substring(2, 4);

        int randonnumber = randomGenerator.nextInt(9999) + 1;
        var randonnumberFormat = String.format("%04d", randonnumber);

        var finalID = String.format("%s%s%s%s", nameID, lastNameID, yearID, randonnumberFormat);

        System.out.println("Generating your ID..." + finalID);

        System.out.printf("""

                Hello %s
                Your ID is: %s
                        """, nameID, finalID);

    }

}
