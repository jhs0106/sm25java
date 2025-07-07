package collection;
//0707
import java.util.HashMap;
import java.util.Map;

public class Collection3 {
    public static void main(String[] args) {
        // Map (Key, Value)
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);

        for(String s : map.keySet()){
            System.out.println(s);
        }
        for(Integer i : map.values()){
            System.out.println(i);
        }
    }
}
