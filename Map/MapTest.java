package Map;

import java.util.HashMap;
import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(4, "World");

        Set set = map.entrySet();
        System.out.println(set);

        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}
