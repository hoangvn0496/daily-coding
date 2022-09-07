package com.learning.algorithmic;


public class QuickSortTest {

    static int partition(int start, int end, int[] a) {
        int pirotIndex = start;
        int pirotValue = a[pirotIndex];
        while (start < end) {
            while (start < a.length && a[start] <= pirotValue) {
                start++;
            }
            while (a[end] > pirotValue) {
                end -= 1;
            }
            if (start < end) {
                int tmp = a[start];
                a[start] = a[end];
                a[end] = tmp;
            }
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + "\t");
            }
            System.out.println("\n");
        }
        int tmp = a[end];
        a[end] = a[pirotIndex];
        a[pirotIndex] = tmp;
        return end;
    }

    static void quickSort(int start, int end, int[] a) {
        if (start < end) {
            int p = partition(start, end, a);
            quickSort(start, p - 1, a);
            quickSort(p + 1, end, a);
        }
    }

    public static void main(String[] args) {
        int[] a = {38, 27, 43, 3, 9, 82, 10};
        quickSort(0, a.length - 1, a);
        System.out.println("");
    }
}
