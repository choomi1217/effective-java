package chapter07.item43;

import java.util.HashMap;
import java.util.Map;

public class MethodReference {
    public static void main(String[] args) {
        //Lambda expression
        Map<String, Integer> map = new HashMap<>();
        map.merge("key", 1, (oldValue, newValue) -> (Integer)oldValue + (Integer)newValue);
        System.out.println(map.get("key"));

        //Method reference
        map.merge("key", 1, Integer::sum);
        System.out.println(map.get("key"));
    }
}
