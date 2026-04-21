package generics_ex.hashmap_ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Code249 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        // .put <key, value> 쌍을 HashMap에 추가함
        map.put("david", "qwer123");
        map.put("cindy", "qwer123");
        map.put("alice", "abc000");
        map.put("paul", "asdf5757");
        map.put("mary", "good!*?");
        // key 중복 값x, value는 중복 가능
        
        Set<String> keySet = map.keySet(); // key만 뽑아냄
        System.out.println(keySet);
        System.out.println("-------------------");

        for(Map.Entry<String, String> e:map.entrySet()) {
            String key = e.getKey();
            String value = e.getValue();
            System.out.println(key + ":" + value);
        }
            System.out.println("-------------------");
            String val = (String)map.get("alice");
            // map.get(key)
            System.out.println("Value for key alice is: " + val);
    }
    
}
