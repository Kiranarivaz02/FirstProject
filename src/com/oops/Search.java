package com.oops;
import java.util.Arrays;
 
class Search
{
	 public static void main(String args[]) {
		 long starttime;
		 long endtime;
		 long elapsedtime;
		 int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		 int value=8;
		 starttime=System.nanoTime();
		
		 //O(n)
		 int index=search(arr,value);
		 endtime=System.nanoTime();
		 elapsedtime=endtime=starttime;
		 System.out.println("Search took:"+ elapsedtime+"nsecs");
		
		 if(index!=-1) {
			 System.out.println("Found at:"+index);
		 }
		 else {
			 System.out.println("Not Found at:");
		 }
		
		 int arr1[]= {21,4,6,7,8,9,14,5,6,3,15,19,3,2};
		 starttime=System.nanoTime();
		 //O(log n)
		
		 int index_1=Arrays.binarySearch(arr1, value);
		
		 endtime=System.nanoTime();
		 elapsedtime=endtime=starttime;
		 System.out.println("Binary Search took:"+ elapsedtime+"nsecs");
		 }//end of main
	
	 static int search(int array[],int value) {
		 for(int i=0;i<array.length;i++)
		 {
			 if (array[i]==value)
				 return i;
		 }
		 return -1;
	 }
}//end of class
 
//task
//1.what is the best case of binary Search O(1)
//2.what is the worst case of binary Search O(log n)
//3.what is the average case of binary search O(log n)
 
