package bilet23;

public class Circle extends GeometryShape{

    public double radius;

    public Circle() {
        this.radius = Math.random() * 10;
    }

    @Override
    public double find_square() {
        return Math.PI * radius * radius;
    }

    @Override
    public double find_perimeter() {
        return 2 * Math.PI * radius;
    }

}
