package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class JCF {
    public static void main(String[] args) {

        //arrays are fixed size
        //not methods (almost)

        //collections into 3 categories: list, set, map

        //==========================================
        // List
        //==========================================

        //generics < > - array list of strings
        // only non primitive types allowed
        List<String> list = new LinkedList<>();//ArrayList
        list.add("Hello");
        list.add("Hasdello");
        list.add("");

        //==========================================
        // Sets
        //==========================================

        //1 - no duplicates
        //2 - no order(depends on the right side)
        Set<String> set = new HashSet<>();//LinkedHashSet, TreeSet
        //wrapper classes
        //primitive int -> non primitive Integer
        //char -> Character
        //boolean -> Boolean
        set.add("iGyJ7MU");
        set.add("bKpQG16B");
        set.add("ttpJO341");
        System.out.println(set);


        //==========================================
        // Maps
        //==========================================
//        key  -> value
//        name -> phone

        Map<String, Integer> namesToPhones = new HashMap<>();//LinkedHashMap, TreeMap
        namesToPhones.put("Alex", 123456789);
        namesToPhones.put("Alex", 9876543);

        Integer alexesPhone = namesToPhones.get("Alex");

        Map<String, List<Integer>> x = new HashMap<>();//LinkedHashMap, TreeMap
        //zheka -> [1,2,3,4]
        Map<Integer, List<String>> ...

        Map<String, Map<String, Integer>> x;

        Collections.shuffle(list);
//        Collections. ...
    }
}
