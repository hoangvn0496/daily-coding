package com.learning.algorithmic;

public class DivideAndConquer {

    static int DAC_Max(int a[], int index, int l) {
        int max;

        if (index >= l - 2) {
            if (a[index] > a[index + 1]) {
                return a[index];
            } else {
                return a[index + 1];
            }
        }

        max = DAC_Max(a, index + 1, l);

        if (a[index] > max) {
            return a[index];
        } else {
            return max;
        }
    }

    // Driver Code
    public static void main(String[] args) {
        int max;

        // Initializing the array
        int a[] = {70, 250, 50, 80, 140, 12, 14};

        // Recursion - DAC_Max function called
        max = DAC_Max(a, 0, 7);

//        System.out.printf("The maximum number in a given array is : %d", max);
        
        int nDisks = 5;
        doTowers(nDisks, 'A', 'B', 'C');
    }
    
     public static void doTowers(int topN, char from,
            char inter, char to) {
        if (topN == 1) {
            System.out.println("Disk 1 from "
                    + from + " to " + to);
        } else {
            doTowers(topN - 1, from, to, inter);
            System.out.println("Disk "
                    + topN + " from " + from + " to " + to);
            doTowers(topN - 1, inter, from, to);
        }
    }
}
