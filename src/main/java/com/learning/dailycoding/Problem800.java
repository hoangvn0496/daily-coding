package com.learning.dailycoding;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Problem800 {

    /**
     * Given a linked list, rearrange the node values such that they appear in
     * alternating low , high , low , high ... form. For example, given 1 , 2 ,
     * 3 , 4 , 5, you should return 1 , 3 , 2 , 5 , 4.
     *
     * @param lst
     */
    static void rearrange(List<Integer> lst) {
        Collections.sort(lst);
        for (int i = 1; i < lst.size() - 1;) {
            int temp = lst.get(i);
            lst.set(i, lst.get(i + 1));
            lst.set(i + 1, temp);
            i = i + 2;
        }
    }

    static void rearrange2(List<Integer> lst) {
        for (int i = 1; i < lst.size() - 1;) {
            Integer tempPrev = lst.get(i - 1);
            Integer tempI = lst.get(i);

            if (tempPrev > tempI) {
                lst.set(i - 1, tempI);
                lst.set(i, tempPrev);
                tempI = tempPrev;
            }
            Integer tempNextI = lst.get(i + 1);
            if (tempNextI != null && tempNextI > tempI) {
                lst.set(i, tempNextI);
                lst.set(i + 1, tempI);
            }
            if (lst.get(i + 1) == null) {
                break;
            }
            i = i + 2;
        }
    }

    public static void main(String[] args) {
        // 1, 2, 3, 4, 5, 6, 7 => 1 ,  3 ,  2 ,  5 ,  4 ,  7 ,  6
        // 9 ,  6 ,  8 ,  3 ,  7 => 6 ,  9 ,  3 ,  8 ,  7
        // 6 ,9 , 2 , 5 , 1 , 4 => 6 ,  9 ,  2 ,  5 ,  1 ,  4
        List<Integer> lst = new LinkedList<>(Arrays.asList(6, 9, 2, 5, 1, 4));
        rearrange2(lst);
        lst.stream().forEachOrdered(System.out::print);
    }

}
