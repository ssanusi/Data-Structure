package com.ssanusi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// Built In Hashmap In Java
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "sanusi");
        map.put(2, "sulaiman");
        map.put(3, "bashir");
        map.put(4, "fatimah");
        var name = map.get(1);
        System.out.println(name);
        System.out.println(map);
        map.containsKey(2); //O(1)
        map.containsValue("sanusi"); //O(n)

        for (var items:map.entrySet()) {
            System.out.println(items);
        }

        //Built In Set Interface
        Set<Integer> set = new HashSet<>();
        int[] numbers = { 1, 2, 3, 2, 1, 3, 5};
        for( var num: numbers)
            set.add(num);
        System.out.println(set);

        //CharFinder Implementation
        CharFinder finder = new CharFinder();
        var fistNonRepeating = finder.findFirstNonRepeatingChar("a green apple");
        var firstRepeated = finder.findFirstRepeatedChar("green apple");
        System.out.println(firstRepeated);
        System.out.println(fistNonRepeating);

        //Hashtable Implementation
        HashTable table = new HashTable();
        table.put(6, "A"); // 1
        table.put(8, "B"); // 3
        table.put(11, "C"); // 1 -> 1
        table.remove(6);
        System.out.println(table);

    }
}
