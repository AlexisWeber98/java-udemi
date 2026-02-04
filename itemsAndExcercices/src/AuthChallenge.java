import java.util.Scanner;

public class AuthChallenge {

    public static void main(String[] args) {

        final String USER_VALID = "admin";
        final String PASSWORD_VALID = "admin123";

        var console = new Scanner(System.in);

        System.out.println(" username: ");

        String userInput = console.nextLine();

        System.out.println(" password: ");
        String passwordInput = console.nextLine();

        console.close();

        if (!userInput.equals(USER_VALID) || !passwordInput.equals(PASSWORD_VALID)) {
            System.out.println(" credenciales invalidas ");
        } else {
            System.out.println(" bienvenido al sistema ");
        }
    }
}
