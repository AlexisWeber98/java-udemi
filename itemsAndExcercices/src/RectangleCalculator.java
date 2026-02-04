public class RectangleCalculator {
    public static void main(String[] args) {
        double height = 5.0;
        double length = 10.0;

        double area = height * length;
        double perimeter = 2 * (height + length);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
