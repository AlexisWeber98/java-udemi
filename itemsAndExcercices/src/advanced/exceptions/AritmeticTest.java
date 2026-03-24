package advanced.exceptions;

public class AritmeticTest {
    public static void main(String[] args) {
        try {
            int result = Aritmethic.division(10, 0);
            System.out.println("Result: " + result);

        } catch (Exception exception) {

            System.out.println("Error: " + exception);
        }

    }
}
