/*Topics: Java Foundation [Array]
Exercise 1: Majority of Element 
Description:
Majority of an element means if an element is present in an array for more than n/2 times, where n is the length of the Array.
Ex: Array = {3, 3, 4, 2, 4, 4, 2, 4, 4} => 4
Create a Java Code to achieve the above requirement.*/

package com.classWork;
import java.util.Scanner;
public class Majority {
     public static int arrMajority(int arr[]) {
		int n;
		n=arr.length;
		for(int i=0;i<n;i++)
		{	int cnt=0;
			for(int j=0;j<n;j++) {
			if(arr[i]==arr[j])
			{
				cnt++;
			}
			}
		
		if(cnt>n/2)
			return arr[i];
		
		}
	return -1;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[9];
		System.out.println("Enter array values:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//int arr[]={3, 3, 4, 2, 4, 4, 2, 4, 4};
		System.out.println("Majority is "+arrMajority(arr));
}
}
