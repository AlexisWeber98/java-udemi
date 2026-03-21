package sales;

public class SalesSystem {
    public static void main(String[] args) {
        System.out.println(" ---------------- Sales system ----------------");
        Product product1 = new Product("shirt", 22.00);
        // System.out.println(product1.toString());

        Product product2 = new Product("Shoe", 42.55);
        // System.out.println(product2.toString());

        Product product3 = new Product("Pants", 32.00);

        // -------------------------- Order 1 -------------------- //
        Order order1 = new Order();

        order1.addProduct(product1);
        order1.addProduct(product2);

        System.out.println("Order 1 details: \n" + order1.toString());

        // -------------------------- Order 2 -------------------- //

        Order order2 = new Order();
        order2.addProduct(product1);
        order2.addProduct(product2);
        order2.addProduct(product3);

        System.out.println("Order 2 details: \n" + order2.toString());

    }
}
