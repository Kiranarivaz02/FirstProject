/*Exercise 2: Sum of Elements  
Description:
Write a program to print the sum of the elements of an array following the given below condition.
Note: [If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum]
Ex: Array Elements - 10,3,6,1,2,7,9 
O/P: 22 [i.e. 10+3+9]*/

package com.classWork;
public class Sum {
 
	public static void main(String[] args) {
		int [] a= {10,3,6,1,2,7,9};
		int sum =0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==6) {
				for(int j=i+1;j<a.length;j++) {
					if(a[j]==7) {
						i=j;
						break;
					}					
				}
				continue;
			}
			sum+=a[i];
		}
		System.out.println("Output: "+ sum);
 
	}
 
}