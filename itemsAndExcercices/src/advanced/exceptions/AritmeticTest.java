package advanced.exceptions;

public class AritmeticTest {
    public static void main(String[] args) {
        try {
            // int result = Aritmethic.division(10, 2);
            int result = Aritmethic.division(10, 2);
            System.out.println("Result: " + result);

        } catch (Exception exception) {

            System.out.println("Error: " + exception);
        } finally {
            // This block will always execute, regardless of whether an exception was thrown
            // or caught.
            System.out.println(" the division operation is completed");
        }

    }
}
