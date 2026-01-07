//package ocp.after;

interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class AreaCalculator2 {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    public static void main(String[] args) {
        AreaCalculator2 calc = new AreaCalculator2();
        Shape rect = new Rectangle(5, 4);
        Shape circle = new Circle(3);
        System.out.println("Aire du rectangle = " + calc.calculateArea(rect));
        System.out.println("Aire du cercle = " + calc.calculateArea(circle));
    }
}
