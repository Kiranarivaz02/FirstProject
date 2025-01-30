package com.slidingWindow;

public class MaximumSumSubarray {
public static int maxSum(int[] arr, int k) {
int maxSum = 0;
int windowSum = 0;
// Calculate the sum of the first window
for (int i = 0; i < k; i++) {
windowSum += arr[i];
}
maxSum = windowSum;
// Slide the window
for (int i = k; i < arr.length; i++) {
windowSum += arr[i] - arr[i - k];
maxSum = Math.max(maxSum, windowSum);
}
return maxSum;
}
public static void main(String[] args) {
int[] arr = {2, 1, 5, 1, 3, 2};
int k = 3;
System.out.println("Maximum sum of a subarray of size " + k + " is: " + maxSum(arr, k));
}
}
