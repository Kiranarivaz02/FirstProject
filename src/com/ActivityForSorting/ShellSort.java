package com.ActivityForSorting;
public class ShellSort {
    public static void shellSort(int[] array) {
        int n = array.length;

        // Start with a large gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Perform a gapped insertion sort for this gap size
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 34, 54, 2, 3};
        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        shellSort(array);

        System.out.println("\nSorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
