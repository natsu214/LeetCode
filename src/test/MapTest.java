package test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("123",1);
        maps.put("456",2);
        maps.put("456",23);
        maps.put("222",3);
        System.out.println(maps.get("456"));

    }
}

