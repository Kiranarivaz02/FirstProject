package com.Constructor;

class Emp {
	//instance members
	int eid;
	String name;
	int phone;
	float salary;
	  
	
	Emp(int eid, String name, int phone, float salary){
		this.eid=eid;
		this.name=name;
		this.phone=phone;
		this.salary=salary;
		
	}
	
public String toString() {
	return " "+ eid+ " "+ name+ " " +phone + " "+salary; 
}

}

class Call {
	public static void main(String[] args) {
		//let test the class
		//need to create or instantiate
		//Employee emp1; //reference variable
		Emp emp[]= new Emp[4];
		emp[0]=new Emp(101, "Kiran",8888, 400000.56f);
		emp[1]=new Emp(102, "Arivaz",9999, 500000.36f);
		emp[2]=new Emp(103, "Prema",2222, 600000.96f);
		emp[3]=new Emp(104, "Harishma",6666, 700000.46f);
		for (Emp e:emp) {
			System.out.println(e);
		}
		
		//printAllEmp(emp);
		//I want to ensure that need to store atleast 5emp
		//also provide a method to print all the 5 emp
	
	}// end of main
	/*static void printAllEmp(Emp emp[]) {
		for (Emp e:emp) {
			System.out.println(e);
		}
	}*/
}


