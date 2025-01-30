/*Exercise 3: Reverse a matrix 
Description:

Write a program to reverse the elements of a given 2*2 array. Four integer numbers need to be passed as Command Line arguments
Ex: C:\>java ReverseMatrix 1 2 3
O/P: Please enter 4 integer numbers
Ex: C:\>java ReverseMatrix 1 2 3 4  
O/P:  The given array is: 
  1 2 
  3 4 
 The reverse of the array is:
  4 3 
  2 1
*/

/*Write a program to reverse the elements of a given 2*2 array. 

* Four integer numbers need to be passed as Command Line arguments */
 package com.classWork;
import java.util.Scanner;
public class ReverseMatrix {
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int[][] a=new int[2][2];
System.out.println("enter elements of array:");
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a.length;j++)
	{
	a[i][j]=s.nextInt();
	}
}
System.out.println("Array elements are:");
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a.length;j++)
	{
	System.out.print(a[i][j]+"\t");
	}
	System.out.println();
}
System.out.println("Reversed Array elements are:");
int[][] b=new int[2][2];
for(int i=0;i<2;i++){
	for(int j=0;j<2;j++)
	{
		if(i==0 && j==0)
		{
			b[i][j]=a[1][1];
		}
		else if(i==1 && j==1)
		{
			b[i][j]=a[0][0];
		}
		else
		{
			b[i][j]=a[j][i];
		}
	}
}
for(int i=0;i<2;i++){
	for(int j=0;j<2;j++){
		System.out.print(b[i][j]+"\t");
	}
	System.out.println();
}
}
}

 