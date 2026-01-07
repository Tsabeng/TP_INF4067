//package ocp.before;

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() { return radius; }
}

public class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.getWidth() * r.getHeight();
        } else if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return Math.PI * c.getRadius() * c.getRadius();
        }
        throw new IllegalArgumentException("Unknown shape type");
    }

    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        Rectangle r = new Rectangle(4, 3);
        Circle c = new Circle(2);
        System.out.println("Aire du rectangle = " + calc.calculateArea(r));
        System.out.println("Aire du cercle = " + calc.calculateArea(c));
    }
}
