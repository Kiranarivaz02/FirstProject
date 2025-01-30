package com.ActivityForSorting;
class Employee4 {
    private int eid;
    private String employeeName;
 
    // Parameterized constructor
    public Employee4(int eid, String employeeName) {
        this.eid = eid;
        this.employeeName = employeeName;
    }
 
    // Getter and setter methods
    public int getEid() {
        return eid;
    }
 
    public void setEid(int eid) {
        this.eid = eid;
    }
 
    public String getEmployeeName() {
        return employeeName;
    }
 
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
 
    // toString method to display employee details
    @Override
    public String toString() {
        return "Employee [eid=" + eid + ", employeeName=" + employeeName + "]";
    }
}
 
// Node class to store Employee objects in LinkedList
class Node7 {
    Employee4 employee;
    Node7 next;
 
    // Constructor
    public Node7(Employee4 employee) {
        this.employee = employee;
        this.next = null;
    }
}
 
public class EmployeeLinkedList {
    private Node7 head;
 
    // Constructor to initialize an empty linked list
    public EmployeeLinkedList() {
        head = null;
    }
 
    // Add an employee at the end of the list
    public void add(Employee4 employee) {
        Node7 newNode = new Node7(employee);
        if (head == null) {
            head = newNode;
        } else {
            Node7 curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }
 
    // Traverse and print all employees in the list
    public void traverse() {
        Node7 curr = head;
        while (curr != null) {
            System.out.println(curr.employee);
            curr = curr.next;
        }
    }
 
    // Sort the list by Employee ID (eid) using Bubble Sort
    public void sortByEmployeeId() {
        if (head == null || head.next == null) {
            return; // No need to sort if the list is empty or has one element
        }
 
        boolean swapped;
        do {
            swapped = false;
            Node7 curr = head;
            while (curr != null && curr.next != null) {
                if (curr.employee.getEid() > curr.next.employee.getEid()) {
                    // Swap the employee objects
                    Employee4 temp = curr.employee;
                    curr.employee = curr.next.employee;
                    curr.next.employee = temp;
                    swapped = true;
                }
                curr = curr.next;
            }
        } while (swapped); // Continue sorting until no swaps are made
    }
 
    // Sort the list by Employee Name (employeeName) using Bubble Sort
    public void sortByEmployeeName() {
        if (head == null || head.next == null) {
            return; // No need to sort if the list is empty or has one element
        }
 
        boolean swapped;
        do {
            swapped = false;
            Node7 curr = head;
            while (curr != null && curr.next != null) {
                if (curr.employee.getEmployeeName().compareTo(curr.next.employee.getEmployeeName()) > 0) {
                    // Swap the employee objects
                    Employee4 temp = curr.employee;
                    curr.employee = curr.next.employee;
                    curr.next.employee = temp;
                    swapped = true;
                }
                curr = curr.next;
            }
        } while (swapped); // Continue sorting until no swaps are made
    }
 
    public static void main(String[] args) {
        EmployeeLinkedList empList = new EmployeeLinkedList();
 
        // Add employee objects to the list
        empList.add(new Employee4(3, "John"));
        empList.add(new Employee4(1, "Alice"));
        empList.add(new Employee4(2, "Bob"));
        empList.add(new Employee4(5, "Charlie"));
        empList.add(new Employee4(4, "David"));
 
        // Print original list
        System.out.println("Original List:");
        empList.traverse();
 
        // Sort by Employee ID
        empList.sortByEmployeeId();
        System.out.println("\nSorted by Employee ID:");
        empList.traverse();
 
        // Sort by Employee Name
        empList.sortByEmployeeName();
        System.out.println("\nSorted by Employee Name:");
        empList.traverse();
    }
}

