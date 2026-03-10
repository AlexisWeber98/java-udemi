public class UnpairChallenge {
    public static void main(String[] args) {

        int count = 20;

        do {
            if (count % 2 != 0)
                System.out.println(count);
            count--;
        } while (count >= 0);
    }
}
