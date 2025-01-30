package com.MethodReferencing;
import java.util.Set;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.stream.Collectors;
class Employee
{
	String empname;
	String dept;
	float salary;
	public Employee(String empname, String dept, float salary) {
		super();
		this.empname = empname;
		this.dept = dept;
		this.salary = salary;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
}
public class EmployeeRecord {
public static void main(String[] args)
{
	List<Employee> c=Arrays.asList(new Employee("Kiran","CSE",12000),
			new Employee("Seshu","Sql",200000),
			new Employee("Harishma","Java",2500000),
			new Employee("Sneha","Development",4000),
			new Employee("Shreya","Python",7000),
			new Employee("John","Develops",30000),
			new Employee("Hema","Development",60000));
	
	
Stream<Employee> employeeStream = c.stream();
	
	/*
	 * Collector<Employee,?,List<Employee>> collector=Collectors.toList();
	 *
	 * List<Employee>
	 * devopsList=employeeStream.filter((e)->e.getDepartment().equals("Devops")).
	 * collect(Collectors.toList());
	 *
	 * devopsList.forEach(System.out::println);
	 */
	
	Collector<Employee,?,Set<Employee>> collectorSet=Collectors.toSet();
	
	Set<Employee> developerSet=employeeStream.filter((e)->e.getDept().equals("Development")).collect(collectorSet);
	
	developerSet.forEach(System.out::println);
 
 
 
}
}
 