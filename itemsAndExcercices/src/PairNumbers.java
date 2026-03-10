public class PairNumbers {
    public static void main(String[] args) {
        System.out.println("Pair numbers from 1 to 20:");
        int count = 1;

        while (count <= 20) {
            if (count % 2 == 0)
                System.out.print(count + " ");
            count++;
        }
    }
}
