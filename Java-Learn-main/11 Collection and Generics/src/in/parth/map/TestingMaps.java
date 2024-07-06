package in.parth.map;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Parth", 100);
        map.put("Prince", 88);
        map.put("Ram", 70);
        map.put("sohan", 50);
        System.out.println(map.size());
        System.out.println(map.get("Parth"));
        System.out.println(map.containsKey("Ram"));
        System.out.println(map.containsKey("Geeta"));
        System.out.println(map.remove("sohan"));
        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.printf("%s : %s\n", key, map.get(key));
        }
    }
}









