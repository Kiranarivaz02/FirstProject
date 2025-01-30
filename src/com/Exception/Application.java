/* Jason wants to create an application to accept name, age, address, and phone no. user 
 * The application should accept input from user and display all info
 * The code should include exception handling code as well for below
 * 1.illegal data type entered
 * 2.length of phone number is beyond 10 digits
 * 3.write the code to be used as per try with resources
 */

package com.Exception;
import java.util.Scanner;
class Application implements AutoCloseable {
    private Scanner scanner;
 
    public Application() {
        scanner = new Scanner(System.in);
    }
 
    // Method to accept user inputs
    public void getUserInfo() {
        try {
            // Accept Name
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
 
            // Accept Age with exception handling for Illegal data type
            System.out.print("Enter Age: ");
            int age = getAge();
 
            // Accept Address
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();
 
            // Accept Phone Number with exception handling for length limit
            System.out.print("Enter Phone Number: ");
            String phoneNumber = getPhoneNumber();
 
            // Display Information
            System.out.println("\n--- User Information ---");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Address: " + address);
            System.out.println("Phone Number: " + phoneNumber);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
 
    // Method to get Age and handle incorrect data type
    private int getAge() {
        int age = 0;
        try {
            age = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Age must be an integer.");
        }
        return age;
    }
 
    // Method to get Phone Number and handle length
    private String getPhoneNumber() {
        String phoneNumber = scanner.nextLine();
        if (phoneNumber.length() > 18) {
            throw new IllegalArgumentException("Phone number length must not exceed 18 digits.");
        }
        return phoneNumber;
    }
 
    @Override
    public void close() {
        scanner.close();
    }
 
 
 
    public static void main(String[] args) {
        // Using try-with-resources to automatically close the resource
        try (Application userInfo = new Application()) {
            userInfo.getUserInfo();
        } catch (Exception e) {
            System.out.println("Application Error: " + e.getMessage());
        }
    }
}
 