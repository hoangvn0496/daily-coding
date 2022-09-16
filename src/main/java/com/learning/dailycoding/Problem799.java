package com.learning.dailycoding;

import java.util.HashMap;
import java.util.Map;

public class Problem799 {

    /**
     * Implement a PrefixMapSum class with the following methods:
     *
     * insert(key: str, value: int): Set a given key's value in the map. If the
     * key already exists, overwrite the value. sum(prefix: str): Return the sum
     * of all values of keys that begin with a given prefix.
     *
     */
    public static void main(String[] args) {
        Problem799 p = new Problem799();
        p.test();
    }

    void test() {
        PrefixMap p = new PrefixMap();
        p.insert("123", 3);
        p.insert("12", 5);
        p.insert("132", 8);
        p.insert("1", 1);
        System.out.println("test: " + p.sum("132"));
    }

    class PrefixMap {

        Map<String, Integer> preMap = new HashMap<>();

        void insert(String key, Integer value) {
            preMap.put(key, value);
        }

        Integer sum(String pre) {
            Integer sum = 0;
            sum = preMap.entrySet().stream().filter((entry) -> (entry.getKey().contains(pre))).map((entry) -> entry.getValue()).reduce(sum, Integer::sum);
            return sum;
        }
    }
}
