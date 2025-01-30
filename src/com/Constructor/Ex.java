/*Create a class Employee with the following data members and methods 
Data 
empID : string
empName : string
address : Address
Methods
Set methods and get methods for the data members
The class Address has the following
Data 
addr1 : string 
addr2 : string 
city : string 
pin : int 
Methods 
set and get methods 
Write a class EmployeeDemo with a main and two methods
storeData() which takes the Employee object as an argument 
Accepts user input for employee data and sets the data on the object 
showData() which takes an Employee object as the argument and displays the data from the object
Create an instance of the Employee object and pass the same to the storeData() and showData()*/
package com.Constructor;
import java.util.Scanner;
class Address{
	private String addr1;
	private String addr2;
	private String city;
	private int pin;
	
	public void setaddr1(String addr1) {
		this.addr1=addr1;
	}
	public void setaddr2(String addr2) {
		this.addr2=addr2;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public void setPin(int pin) {
		this.pin=pin;
	}
	
	
	public String getaddr1() {
		return addr1;
	}
	public String getaddr2() {
		return addr2;
	}
	public String getCity() {
		return city;
	}
	public int getPin() {
		return pin;
	}
}

class EmployeeA{
	private String empId;
	private String empName;
	private Address address;
	public EmployeeA() {
		 address=new Address();
	 }
	
	public void setEmpId(String empId) {
		this.empId=empId;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	public void setAddress(Address address) {
		this.address= address;
	}
	
	public String getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public Address getAddress() {
		return address;
	}
}
	
	



public class Ex {
    public static void storeData(EmployeeA emp) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        emp.setEmpId(scanner.nextLine());

        System.out.print("Enter Employee Name: ");
        emp.setEmpName(scanner.nextLine());

        Address addr = emp.getAddress();

        System.out.print("Enter Address Line 1: ");
        addr.setaddr1(scanner.nextLine());

        System.out.print("Enter Address Line 2: ");
        addr.setaddr2(scanner.nextLine());

        System.out.print("Enter City: ");
        addr.setCity(scanner.nextLine());

        System.out.print("Enter PIN: ");
        addr.setPin(scanner.nextInt());

        emp.setAddress(addr);
    }

    public static void showData(EmployeeA emp) {
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getEmpName());

        Address addr = emp.getAddress();
        System.out.println("Address Line 1: " + addr.getaddr1());
        System.out.println("Address Line 2: " + addr.getaddr2());
        System.out.println("City: " + addr.getCity());
        System.out.println("PIN: " + addr.getPin());
    }
	
	

	public static void main(String[] args) {
		
		EmployeeA emp=new EmployeeA();
		storeData(emp);
		showData(emp);
		
		
		
		

	}

}
