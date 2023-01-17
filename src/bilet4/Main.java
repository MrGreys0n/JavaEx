package bilet4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(2);
        Odder odder = new Odder();
        System.out.println(odder.hasOdd(set));
    }
}
