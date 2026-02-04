public class RectangleCalculator {
    public static void main(String[] args) {
        var console = new java.util.Scanner(System.in);
        double height;
        double length;

        System.out.println("Enter the height of the rectangle: ");
        height = Double.parseDouble(console.nextLine());

        System.out.println("Enter the length of the rectangle: ");
        length = Double.parseDouble(console.nextLine());

        console.close();

        double area = height * length;
        double perimeter = 2 * (height + length);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
