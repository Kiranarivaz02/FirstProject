package com.Constructor;

class Employee {
	//instance members
	int eid;
	String name;
	int phone;
	float salary;
	  
	
	void saveEmployee(	int id, String name, int phone,float salary) {
		
		eid=id;
		this.name=name; 
		this.phone=phone;
		this.salary=salary;
		System.out.println("Saved the details");
	}
	void printEmployee(){
		System.out.println(" "+ eid+ " "+ name+ " " +phone + " "+salary);
	}
public String toString() {
	return " "+ eid+ " "+ name+ " " +phone + " "+salary; 
}

}

class Employeee {
	public static void main(String[] args) {
		//let test the class
		//need to create or instantiate
		//Employee emp1; //reference variable
		Employee emp= new Employee();
		emp.saveEmployee(101, "Kiran",8888, 400000.56f);
		emp.printEmployee();
		emp=new Employee();
		emp.saveEmployee(101, "Harishma",7777, 500000.55f);	

	}

}
