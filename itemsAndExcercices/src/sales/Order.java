package sales;

public class Order {
    private final int orderId;
    private Product[] products;
    private int productsCount;
    private static final int MAX_PRODUCTS = 10;
    private static int orderCounter;

    public Order() {
        this.orderId = ++Order.orderCounter;
        this.products = new Product[MAX_PRODUCTS];
    }

    public void addProduct(Product product) {
        if (this.productsCount < MAX_PRODUCTS) {

            this.products[this.productsCount++] = product;

        } else {

            System.out.println("Cannot add more products to this order. Maximum limit reached.");
        }
    }

    public double total() {
        double total = 0;
        for (int i = 0; i < this.productsCount; i++) {
            total += this.products[i].getPrice();
        }
        return total;

    }

    public void showOrder() {
        System.out.println("Order ID: " + this.orderId);

        System.out.println("total order: " + this.total());

        System.out.println("\tProducts in the order:");

        for (int i = 0; i < this.productsCount; i++) {
            System.out.println("\t\t" + this.products[i].toString());
        }
    }
}
