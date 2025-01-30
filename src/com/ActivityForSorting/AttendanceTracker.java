package com.ActivityForSorting;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Employee5 {
    private int employeeId;
    private String name;

    public Employee5(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee5 employee = (Employee5) obj;
        return employeeId == employee.employeeId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(employeeId);
    }
}

public class AttendanceTracker {
    private Stack<Employee5>[] dailyStacks;
    private Map<Employee5, Integer> attendanceCount;

    @SuppressWarnings("unchecked")
    public AttendanceTracker(int daysInMonth) {
        dailyStacks = new Stack[daysInMonth];
        for (int i = 0; i < daysInMonth; i++) {
            dailyStacks[i] = new Stack<>();
        }
        attendanceCount = new HashMap<>();
    }

    public void markAttendance(int day, Employee5 employee) {
        if (day < 1 || day > dailyStacks.length) {
            throw new IllegalArgumentException("Invalid day: " + day);
        }
        dailyStacks[day - 1].push(employee);
    }

    public void calculateMonthlyAttendance() {
        for (Stack<Employee5> dailyStack : dailyStacks) {
            while (!dailyStack.isEmpty()) {
                Employee5 employee = dailyStack.pop();
                attendanceCount.put(employee, attendanceCount.getOrDefault(employee, 0) + 1);
            }
        }
    }

    public void printAttendance() {
        for (Map.Entry<Employee5, Integer> entry : attendanceCount.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey().getEmployeeId() +
                               ", Name: " + entry.getKey().getName() +
                               ", Days Present: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        AttendanceTracker tracker = new AttendanceTracker(31);

        Employee5 emp1 = new Employee5(1, "Alice");
        Employee5 emp2 = new Employee5(2, "Bob");
        Employee5 emp3 = new Employee5(3, "Charlie");

        // Mark attendance for a few days
        tracker.markAttendance(1, emp1);
        tracker.markAttendance(1, emp2);
        tracker.markAttendance(2, emp1);
        tracker.markAttendance(2, emp3);
        tracker.markAttendance(3, emp2);
        tracker.markAttendance(3, emp3);

        // Calculate and print monthly attendance
        tracker.calculateMonthlyAttendance();
        tracker.printAttendance();
    }
}

