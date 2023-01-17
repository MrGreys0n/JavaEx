package bilet2;

import java.util.HashMap;
import java.util.Map;

public class ReverseMap {
    public Map<String, Integer> reversemap;
    Map<String, Integer> reverse(Map<Integer, String> map){
        Map<String, Integer> reversemap = new HashMap<>();
        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            reversemap.put(value, key);
        }
        return reversemap;
    }
}
