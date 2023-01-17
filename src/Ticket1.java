import java.util.ArrayList;
import java.util.Arrays;

public class Ticket1 {
    public static ArrayList<Integer> alternate(ArrayList<Integer> listA, ArrayList<Integer> listB) {
        var newList = new ArrayList<Integer>();

        var minSize = Math.min(listA.size(), listB.size());
        for (int i = 0; i < minSize; i++) {
            newList.add(listA.get(i));
            newList.add(listB.get(i));
        }

        var remainderList = listA.size() != minSize ? listA : listB;
        for (int i = minSize; i < remainderList.size(); i++) {
            newList.add(remainderList.get(i));
        }

        return newList;
    }

    public static void main(String[] args) {
        var listA = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        var listB = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10, 11, 12));

        System.out.println(alternate(listA, listB));
    }
}
