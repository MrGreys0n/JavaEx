package bilet23;

public class ShapeFactory {
    public static GeometryShape create_Shape(ShapeTypes type) {
        GeometryShape shape = null;
        switch (type) {
            case CIRCLE -> shape = new Circle();
            case RECTANGLE -> shape = new Rectangle();
        }
        return shape;
    }

}
