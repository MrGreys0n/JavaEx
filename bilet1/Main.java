package bilet1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var merger = new MergeList<Integer>();
        var list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        var list2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10, 11, 12));
        var final_list = merger.alternate(list1, list2);
        System.out.println(final_list);
    }
}
