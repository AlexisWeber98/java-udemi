import java.util.Scanner;

public class MarketWithbDiscount {
    public static void main(String[] args) {
        int min = 1000;

        boolean isMember;

        int discount;

        Scanner console = new Scanner(System.in);

        System.out.println("How much is your purchase?");
        int purchaseAmount = console.nextInt();

        System.out.println("Are you a member of our market? (true/false)");
        isMember = console.nextBoolean();

        console.close();

        if (purchaseAmount >= min && isMember) {
            discount = 10;

        } else if (isMember) {
            discount = 5;
        } else {
            discount = 0;
        }

        if (discount != 0) {
            double discountedPrice = purchaseAmount - (purchaseAmount * discount / 100.0);
            System.out.println("You get a discount of " + discount + "%");
            System.out.println("Your discounted price is: " + discountedPrice);
        } else {
            System.out.println("You don't get a discount");
        }

    }
}
