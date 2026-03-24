package advanced.exceptions;

public class Aritmethic {
    public static int division(int values1, int value2) {
        if (value2 == 0) {
            throw new RuntimeException("division by zero is not allowed");
        }
        return values1 / value2;

    }
}
