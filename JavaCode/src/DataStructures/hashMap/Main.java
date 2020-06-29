package DataStructures.hashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        Map<String, Integer> map = new BasicHashMap<>(10);
        Map<String, Integer> map = new LinkedListMap<>(5);
        map.insert("one", 1);
        map.insert("two", 2);
        System.out.println(map);
        System.out.println(map.size());
        map.insert("three", 3);
        map.insert("four", 4);
        map.insert("five", 5);
        map.insert("six", 6);
        map.insert("seven", 7);
        map.insert("eight", 8);
        map.insert("nine", 9);
        System.out.println(map.size());
        System.out.println(map.hasValue(9));
        System.out.println(map.hasKey("three"));
        map.delete("three");
//        System.out.println(map.hasKey("three"));
        System.out.println(map.get("nine"));
        System.out.println(map);
    }
}
