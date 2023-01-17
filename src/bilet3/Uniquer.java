package bilet3;

import java.util.HashMap;
import java.util.Map;

public class Uniquer {
    public Map<String, String> reversemap;
    public boolean isUnique(Map<String, String> map){
        if (map.isEmpty()) return true;
        Map<String, String> reversemap = new HashMap<>();
        for(Map.Entry<String, String> entry: map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            reversemap.put(value, key);
        }
        if (map.size() != reversemap.size()) return false;
        return true;
    }
}
