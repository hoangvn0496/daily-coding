package com.learning.dailycoding;

public class Problem747 {

    /**
     * Given two strings A and B, return whether or not A can be shifted some
     * number of times to get B. For example, if A is abcde and B is cdeab,
     * return true. If A is abc and B is acb, return false.
     */

    public boolean rotateString(String s1, String goal) {
        return s1.length() == goal.length() && (s1 + s1).contains(goal);
    }

}
