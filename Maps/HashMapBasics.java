package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapBasics {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Map<String , String> map = new HashMap<>();

        // Through this we get all the entry in map
        Set<Map.Entry<String , String>> enteries = map.entrySet();
        // To iterate in map
        for(Map.Entry<String , String> entry : enteries){
            System.out.println(entry.getKey() + ", " + entry.getValue());
          }

        // To insert in map
        map.put("us" , "United State");
        map.put("in" , "india");
        // if the key does not have value then it will put the value
        map.putIfAbsent("in" , "india2");
        
        // to get only keys
        Set<String> key = map.keySet();
        System.out.println(key);


        // To remove a element in map
        // map.remove("us");
        System.out.println(map);

        // To check if value present
        System.out.println(map.containsKey("us"));
        
        // To get a value
        System.out.println(map.get("in"));


        System.out.println(map.getOrDefault("en", "other"));
    
        // check if value is there
        System.out.println("conatins value : " + map.containsValue("United State"));
    }
}
