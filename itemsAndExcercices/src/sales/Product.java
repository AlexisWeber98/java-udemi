package sales;

public class Product {
    private final int idProduct;
    private String name;
    private double price;
    private static int productsCounter;

    public Product(String name, double price) {
        this.idProduct = ++Product.productsCounter;
        this.name = name;
        this.price = price;
    };

    public int getIdProduct() {
        return this.idProduct;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Product: {" +
                "idProduct=" + this.idProduct +
                ", name='" + this.name + '\'' +
                ", price=" + this.price +
                '}';
    }
}
