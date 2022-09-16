package com.learning.algorithmic;

public class QuickSortTest {

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int low, int high, int[] a) {
        if (low < high) {
            int p = partition(a, low, high);
            quickSort(low, p - 1, a);
            quickSort(p + 1, high, a);
        }
    }

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {38, 27, 43, 3, 9, 82, 10};
        quickSort(0, a.length - 1, a);
        printArray(a, a.length);
        System.out.println("");
    }
}
