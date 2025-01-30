/*Exercise 4: Largest and Smallest
Description:
Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
*/
package com.classWork;
public class LarSmall{
	public static void main(String args[])
	{
		int arr[]= {2,4,6,3,5,8,7,1,9,10};
		secSmallest(arr);
		secLargest(arr);
	}
	static void secSmallest(int[] arr)
	{
			int small=arr[0];
			int secsmall=-1;
			for(int i=0;i<arr.length;i++)
			{
				if(small>arr[i])
				{
					secsmall=small;
					small=arr[i];
				}
				else if(arr[i] >small && arr[i]< secsmall)
					secsmall=arr[i];
			}
			System.out.println("Smallest :"+small);
			System.out.println("Second Smallest :"+secsmall);	
	}
	static void secLargest(int[] arr)
	{
			int large=arr[0];
			int seclarge=-1;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>large)
				{
					seclarge=large;
					large=arr[i];
				}
				else if(arr[i] <large && arr[i]> seclarge)
					seclarge=arr[i];
			}
			System.out.println("Largest :"+large);
			System.out.println("Second Largest :"+seclarge);	
	}
	
 
	
}
	
 
