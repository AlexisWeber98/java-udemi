package advanced;

public class Exceptions {
    public static void main(String[] args) {

        int value1 = 10, value2 = 0;
        try {
            int result = value1 / value2;
            System.out.println("result: " + result);

        } catch (Exception exception) {
            System.out.println("An error has occurred: " + exception);
        }

    }

}
