public class ProductDetail {
    public static void main(String[] args) {
        String productName = "Laptop";
        double productPrice = 1200.50;
        int stock = 50;
        boolean isAvailable = true;

        System.out.println("productName = " + productName);
        productName = "Gaming Laptop";
        System.out.println("Product Name: " + productName);


        System.out.println("productPrice = " + productPrice);
        productPrice = 1500.75;
        System.out.println("Product Price: " + productPrice);

        System.out.println("stock = " + stock);
        stock = 20;
        System.out.println("productPrice = " + stock);

        System.out.println("isAvailable = " + isAvailable);
        isAvailable = false;
        System.out.println("Is Available: " + isAvailable);

    }
}
