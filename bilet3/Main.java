package bilet3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Marty", "Stepp");
        map.put("Stuart", "Reges");
        map.put("Jessica", "Miller");
        map.put("Amanda", "Camp");
        map.put("Hal", "Perkins");
        System.out.println(map);
        Uniquer uniquer = new Uniquer();
        System.out.println(uniquer.isUnique(map));
        Map<String, String> map1 = new HashMap<>();
        map1.put("Kendrick", "Perkins");
        map1.put("Stuart", "Reges");
        map1.put("Jessica", "Miller");
        map1.put("Bruce", "Reges");
        map1.put("Hal", "Perkins");
        System.out.println(uniquer.isUnique(map1));
        map.clear();
        System.out.println(uniquer.isUnique(map));
    }
}
