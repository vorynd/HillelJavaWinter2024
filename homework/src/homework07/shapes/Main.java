package homework07.shapes;

public class Main {
    public static void main(String[] args) {
        Shape[] shapeArray = {
                new Square(8),
                new Circle(15),
                new Triangle(4, 8),
                new Triangle(6, 2),
                new Circle(5),
                new Square(3),
                new Square(6),
                new Triangle(4, 4)};

        areaOfShapes(shapeArray);
    }

    public static void areaOfShapes(Shape[] shapeArray) {
        double summ = 0;
        for (Shape shape : shapeArray) {
            summ = summ + shape.getArea();
        }
        System.out.println("Area of all Shapes = " + summ);
    }

}
