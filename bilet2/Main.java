package bilet2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> original_map = new HashMap<>();
        original_map.put(1, "string 1");
        original_map.put(2, "string 2");
        original_map.put(3, "string 3");
        original_map.put(4, "string 2");
        System.out.println(original_map);
        bilet2.ReverseMap map = new ReverseMap();
        Map<String, Integer> final_map = map.reverse(original_map);
        System.out.println(final_map);
    }
}