package bilet23;

public class Main {
    public static void main(String[] args) {
        GeometryShape circle = ShapeFactory.create_Shape(ShapeTypes.CIRCLE);
        GeometryShape rectangle = ShapeFactory.create_Shape(ShapeTypes.RECTANGLE);
        System.out.println(circle.find_perimeter());
        System.out.println(circle.find_square());
        System.out.println(rectangle.find_perimeter());
        System.out.println(rectangle.find_square());
    }
}
