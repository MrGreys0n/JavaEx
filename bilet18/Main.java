package bilet18;

public class Main {
    public static void main(String[] args) {
        var array = new ArrayIntList();
        array.add(1);
        array.add(3);
        array.add(5);
        array.add(2);
        array.add(9);
        array.add(7);
        array.add(-3);
        array.add(0);
        array.add(42);
        array.add(308);
        array.add(17);
        System.out.println(array.longestSortedSequence());
    }
}
