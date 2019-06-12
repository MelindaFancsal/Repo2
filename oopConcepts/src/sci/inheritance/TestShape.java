package sci.inheritance;

import sci.homework.Library;

public class TestShape {
    public static void main(String[] args) {
        Shape[] listShape = new Shape[2];
        listShape[0] = new Circle();
        listShape[1] = new Triangle();

        listShape = new Shape[5];

        for (int i = 0; i < listShape.length; i++) {
            System.out.println(listShape[i]);
        }

        LibraryShapes libraryShapesObject = new LibraryShapes(listShape);

        Shape[] numeArray = new Shape[10];

        // Rectangle test
        double width = 5, length = 7;
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.area()
                + "\nResulting perimeter: " + rectangle.perimeter() + "\n");

        // Circle test
        double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
                + "\nResulting Area: " + circle.area()
                + "\nResulting Perimeter: " + circle.perimeter() + "\n");

        // Triangle test
        double a = 5, b = 3, c = 4;
        Shape triangle = new Triangle(a, b, c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nResulting Area: " + triangle.area()
                + "\nResulting Perimeter: " + triangle.perimeter() + "\n");

        displayAriaPerimeter(new Rectangle(4, 5));

        displayAriaPerimeter(new Circle(4));

    }

    public static void displayAriaPerimeter(Shape circle) {
        System.out.println(circle.area()
                + "\nResulting perimeter: " + circle.perimeter() + "\n");
    }

}