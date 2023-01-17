abstract class Number<TSelf extends Number<TSelf>> {
    public abstract TSelf add(TSelf other);
    public abstract TSelf subtract(TSelf other);
    public abstract TSelf multiply(TSelf other);
    public abstract TSelf divide(TSelf other);
}

final class RealNumber extends Number<RealNumber> {
    private final double value;

    public RealNumber(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public RealNumber add(RealNumber other) {
        return new RealNumber(value + other.value);
    }

    @Override
    public RealNumber subtract(RealNumber other) {
        return new RealNumber(value - other.value);
    }

    @Override
    public RealNumber multiply(RealNumber other) {
        return new RealNumber(value * other.value);
    }

    @Override
    public RealNumber divide(RealNumber other) {
        return new RealNumber(value / other.value);
    }

    @Override
    public String toString() {
        return "Real(" + value + ")";
    }
}

final class ComplexNumber extends Number<ComplexNumber> {
    private final double realPart;
    private final double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(realPart + other.realPart, imaginaryPart + other.imaginaryPart);
    }

    @Override
    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(realPart - other.realPart, imaginaryPart - other.imaginaryPart);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber other) {
        // (x + iy)(z + iw)
        // xz + ixw + iyz - yw
        // (xz - yw) + i(xw + yz)
        double x = realPart, y = imaginaryPart;
        double z = other.realPart, w = other.imaginaryPart;
        return new ComplexNumber(x * z - y * w, x * w + y * z);
    }

    @Override
    public ComplexNumber divide(ComplexNumber other) {
        // (x + iy)/(z + iw)
        // (x + iy)(z - iw)/(z + iw)(z - iw)
        // ((xz - yw) + i(xw + yz))/(z^2 + w^2)
        // (xz + yw)/(z^2 + w^2) + i(yz - xw)/(z^2 + w^2)
        double x = realPart, y = imaginaryPart;
        double z = other.realPart, w = other.imaginaryPart;
        return new ComplexNumber(
            (x * z + y * w)/(z * z + w * w),
            (y * z - x * w)/(z * z + w * w)
        );
    }

    @Override
    public String toString() {
        return "Complex(" + realPart + "; " + imaginaryPart + ")";
    }
}

final class NumberFactory {
    public Number create(double value, int numberOfDimensions) {
        return switch (numberOfDimensions) {
            case 1 -> new RealNumber(value);
            case 2 -> new ComplexNumber(value, value);
            default -> throw new IllegalArgumentException("unsupported number of dimensions");
        };
    }
}

public class Ticket24 {
    public static void main(String[] args) {
        var factory = new NumberFactory();
        System.out.println(factory.create(5, 1));
        System.out.println(factory.create(25, 2));
    }
}
