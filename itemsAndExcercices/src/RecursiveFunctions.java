public class RecursiveFunctions {

    static boolean isOne(int number) {
        if (number == 1) {
            return true;
        } else {
            System.out.println("Number = " + number);
            return isOne(number - 1);

        }
    }

    public static void main(String[] args) {

        System.out.println(isOne(10));
    }
}