package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {
    public static void main(String[] args) {

//        Map is an Interface whose elements are stored in key/value pairs. Keys are unique values associated with individual Values.
//        A map cannot contain duplicate keys. And, each key is associated with a single value.

        Map<String,Integer> numbers = new HashMap<>();

        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("Four",4);
        numbers.put("Five",5);

        System.out.println(numbers);

        numbers.remove("Five");

        System.out.println(numbers);

//        if(!numbers.containsKey("Two")){
//            numbers.put("Two",22);
//        }
        numbers.putIfAbsent("Two", 22); // this works similar to above commented code snippet. Map will not put same key "Two" again.
        numbers.put("Three", 33); // New Value of key "Three" will overwrite the older Value.

        System.out.println(numbers);

        // Iterating a map
        for (Map.Entry<String,Integer> e : numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
//        Iterating keys and values separately

//        for (String key: numbers.keySet()){
//            System.out.println(key);
//        }
//        for (Integer value: numbers.values()){
//            System.out.println(value);
//        }

//        TreeMap works on the implementation of a Binary search tree where the keys will be sorted.
        Map<String,Integer>  nums = new TreeMap<>();
        nums.put("One",1);
        nums.put("Two",2);
        nums.put("Three",3);
        nums.put("Four",4);
        nums.put("Five",5);

        System.out.println(nums);
    }
}
