package com.learning.dailycoding;

import java.util.HashMap;
import java.util.Map;

public class Probelm771 {

    private boolean isIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            Character tmp = map.get(c1[i]);
            if (tmp != null && tmp != c2[i]) {
                return false;
            }
            if (tmp == null && map.containsValue(c2[i])) {
                return false;
            }
            map.put(c1[i], c2[i]);
        }
        return true;
    }
    
    public static void main(String[] args) {
        Probelm771 p = new Probelm771();
        System.out.println(p.isIsomorphic("abc", "abb"));
    }
}
