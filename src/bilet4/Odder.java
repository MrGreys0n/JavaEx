package bilet4;

import java.util.Set;

public class Odder {
    public boolean hasOdd(Set<Integer> set){
        for (Integer element: set){
            if (element % 2 == 1) return true;
        }
        return false;
    }
}
