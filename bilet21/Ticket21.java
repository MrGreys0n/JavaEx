package bilet21;

import java.util.Comparator;
import java.util.Optional;

abstract class Finder<T> {
    public abstract Optional<Integer> findIndex(T[] elements, T value);

    public final Optional<T> find(T[] elements, T value) {
        return findIndex(elements, value)
            .map(index -> elements[index]);
    }
}

final class LinearFinder<T> extends Finder<T> {
    @Override
    public Optional<Integer> findIndex(T[] elements, T value) {
        for (int i = 0; i < elements.length; i++) {
            if (value == elements[i]) {
                return Optional.of(i);
            }
        }

        return Optional.empty();
    }
}

final class BinaryFinder<T> extends Finder<T> {
    private final Comparator<T> comparator;

    public BinaryFinder(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public static <T extends Comparable<T>> BinaryFinder<T> naturalOrder() {
        return new BinaryFinder<>(Comparator.<T>naturalOrder());
    }

    @Override
    public Optional<Integer> findIndex(T[] elements, T value) {
        int low = 0;
        int high = elements.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            var comparatorResult = comparator.compare(elements[mid], value);

            if (comparatorResult < 0) {
                low = mid + 1;
            } else if (comparatorResult > 0) {
                high = mid - 1;
            } else {
                return Optional.of(mid);
            }
        }

        return Optional.empty();
    }
}

public class Ticket21 {
    public static void main(String[] args) {
        var array = new Integer[] {1, 2, 3, 4, 5, 6, 7};
        var binaryFinder = BinaryFinder.<Integer>naturalOrder();
        System.out.println(binaryFinder.findIndex(array, 3));
    }
}
