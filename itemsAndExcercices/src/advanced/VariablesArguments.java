package advanced;

public class VariablesArguments {
    public static void main(String[] args) {
        // printNumbers(1, 2, 3, 4, 5);
        multipleParameters("Hello", 1, 2, 3, 4, 5);
    }

    static void printNumbers(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    static void multipleParameters(String message, int... numbers) {

        System.out.println("Message: " + message);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    };
}
