package bilet23;

public class Rectangle extends GeometryShape {
    public double length;
    public double width;

    public Rectangle() {
        this.length = Math.random() * 10;
        this.width = Math.random() * 10;
    }

    @Override
    public double find_square() {
        return length * width;
    }

    @Override
    public double find_perimeter() {
        return 2 * (width + length);
    }

}
