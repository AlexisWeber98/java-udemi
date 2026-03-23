package advanced;

public class AbstarctClass {
    public static void main(String[] args) {
        // GeometricFigure figure = new GeometricFigure() {}; -> Error: Cannot
        // instantiate the type GeometricFigure

        GeometricFigure rectangle = new Rectangle();
        rectangle.draw();

        GeometricFigure circle = new Circle();
        circle.draw();
    }

}

abstract class GeometricFigure {
    public abstract void draw();
}

class Rectangle extends GeometricFigure {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Circle extends GeometricFigure {

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}