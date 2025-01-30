/*Problem Statement: Parentheses Matching
Objective: Write a function to determine if the parentheses in a given string are balanced.
 
Description: In programming, it is crucial to ensure that parentheses, brackets, and braces are correctly matched and nested. Your task is to implement a function that checks if a string containing various types of parentheses is balanced. A string is considered balanced if:

Every opening parenthesis has a corresponding closing parenthesis.
The parentheses are correctly nested.
Types of Parentheses: The types of parentheses to consider are:

Round brackets: ()
Curly braces: {}
Square brackets: []
Function Signature:


bool is_balanced(s: str) 
Input:

A single string s (1 ≤ |s| ≤ 10^4), which may contain characters including the parentheses mentioned above.
Output:

Return True if the string is balanced, and False otherwise.
Examples:

Input: s = "([]{})"
Output: True
Input: s = "([)]"
Output: False
Input: s = "{[()]}"
Output: True
Input: s = "((()))"
Output: True
Input: s = "((())"
Output: False
Additional Notes:
*/
package com.ActivityForSorting;
import java.util.Stack; 
	public class Paranthesis {
		  public static boolean isBalanced(String s) {
		        Stack<Character> stack = new Stack<>();
		        for (char c : s.toCharArray()) {
		            if (c == '(' || c == '{' || c == '[') {
		                stack.push(c);
		            } else if (c == ')' || c == '}' || c == ']') {
		                if (stack.isEmpty()) return false;
		                char top = stack.pop();
		                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
		                    return false;
		                }
		            }
		        }
		        return stack.isEmpty();
		    }
		 
		    public static void main(String[] args) {
		        System.out.println(isBalanced("([]{})"));  // True
		        System.out.println(isBalanced("([)]"));    // False
		        System.out.println(isBalanced("{[()]}"));  // True
		        System.out.println(isBalanced("((()))"));  // True
		        System.out.println(isBalanced("((())"));   // False
		    }
		}
