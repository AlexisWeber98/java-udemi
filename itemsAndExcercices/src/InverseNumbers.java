public class InverseNumbers {
    public static void main(String[] args) {

        int counter = 15;

        do {
            if (counter % 2 != 0) {
                System.out.println("Counter value unpair: " + counter);
            }
            counter--;

        } while (counter >= 0);

    }
}
