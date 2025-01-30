//import java.util.*;
package com.DataStructure;

class BubbleSort {  
    void bubbleSort(int arr[])
    {
        int n = arr.length;
      
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                  
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    // Driver method to test above
    public static void main(String args[])
    {

        BubbleSort ob = new BubbleSort();
        int arr[] = { 64, 34, 25, 12 };
      
        ob.bubbleSort(arr);
      
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}