package com.sample;
 
import java.util.Scanner;
 
public class MaxSubarraySum {
    public static int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;
        if (n < k) {
            return -1; // If there are fewer elements than k
        }
 
        // Compute the sum of the first subarray of size k
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
 
        // Compute the sums of remaining subarrays of size k
        int currentSum = maxSum;
        for (int i = k; i < n; i++) {
            currentSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }
 
        return maxSum;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Read input values
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
 
        // Calculate the maximum sum of a subarray of size k and print the result
        System.out.println(maxSubarraySum(arr, k));
    }
}