package com.learning.algorithmic;

import java.util.Arrays;

public class SortTest {

    static void mergeSort(Integer[] a) {
        if (a.length > 1) {
            int mid = a.length / 2;
            Integer[] left = Arrays.copyOfRange(a, 0, mid);
            Integer[] right = Arrays.copyOfRange(a, mid, a.length);
            mergeSort(left);
            mergeSort(right);
            mergeArr(a, left, right);
        }
    }

    static void mergeArr(Integer[] a, Integer[] l, Integer[] r) {
        int i = 0, j = 0, k = 0;
        while(i < l.length && j < r.length) {
            if(l[i] < r[j]){
                a[k] = l[i];
                i++;
            } else {
                a[k] = r[j];
                j++;
            }
            k++;
        }
        while(i < l.length) {
            a[k] = l[i];
            i++;
            k++;
        }
        while(j < r.length) {
            a[k] = r[j];
            j++;
            k++;
        }
        
        System.out.println("");
    }
    public static void main(String[] args) {
        Integer[] a = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(a);
        System.out.println("");
    }
}
