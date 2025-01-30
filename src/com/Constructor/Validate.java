/*
DataInputStream 1.0: java.io
BufferedReader 1.3:java.io
Scanner 1.5: java.util

*/
package com.Constructor;
import java.util.*;
class Employee1
{
int eid;
String ename;

Employee1(int eid,String ename)
{
this.eid=eid;
this.ename=ename;
}

public String toString()
{
return eid + "" +ename;
}



public boolean equals(Object obj)
{
boolean result = false;
		if (obj == null || obj.getClass() != getClass()) {
			result = false;
		} else {
			Employee1 emp = (Employee1) obj;
			if (this.eid == emp.eid
					&& this.ename == emp.ename) {
				result = true;
			}
		}
		return result;
}


public int hashCode()
{
int hash = 3;
		hash = 7 * hash + Integer.hashCode(this.eid);
		hash = 7 * hash + this.ename.hashCode();
		return hash;

}


}


// to check if the objects are same

class Validate
{

public static void main(String a[])
{



Employee1 emp=new Employee1(101,"java");
Employee1 emp1=new Employee1(102,"java");
System.out.println(emp.equals(emp1));

/*java.util.Scanner s=new java.util.Scanner(System.in);

System.out.println("Welcome !! Please Enter your credentials");
System.out.println("Enter Username");
String username=s.next();

System.out.println("Enter Password");
String password=s.next();

if(username.equals("Saranya") && password.equals("Siri"))
//if(username=="Saranya" && password =="Siri")
{

System.out.println("Welcome:"+ username);
}

else
{
System.out.println("Invalid Credentials");

}
*/


}//end  of main

}//end of class
