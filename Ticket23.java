abstract class Shape {
    private final String color;
    private final boolean isFilled;

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return isFilled;
    }
}

final class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(String color, boolean isFilled, double width, double height) {
        super(color, isFilled);

        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

final class Circle extends Shape {
    private final double radius;

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

final class ShapeFactory {
    public sealed interface ShapeArgs permits RectangleArgs, CircleArgs { }

    public record RectangleArgs(double width, double height) implements ShapeArgs { }

    public record CircleArgs(double radius) implements ShapeArgs { }

    public Shape create(String color, boolean isFilled, ShapeArgs args) {
        if (args instanceof RectangleArgs rectangleArgs) {
            return new Rectangle(color, isFilled, rectangleArgs.width, rectangleArgs.height);
        }

        if (args instanceof CircleArgs circleArgs) {
            return new Circle(color, isFilled, circleArgs.radius);
        }

        return null;
    }
}
