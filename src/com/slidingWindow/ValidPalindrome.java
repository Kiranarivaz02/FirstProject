package com.slidingWindow;

public class ValidPalindrome {
public boolean isPalindrome(String s) {
int left = 0; // Start pointer
int right = s.length() - 1; // End pointer
 
while (left < right) {
// Move left pointer to the next alphanumeric character
while (left < right && !isAlphanumeric(s.charAt(left))) {
left++;
}
// Move right pointer to the previous alphanumeric character
while (left < right && !isAlphanumeric(s.charAt(right))) {
right--;
}
// Compare characters at left and right pointers
if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
return false; // Not a palindrome
}
left++;
right--;
}
return true; // It is a palindrome
}
// Helper method to check if a character is alphanumeric
private boolean isAlphanumeric(char c) {
return Character.isLetterOrDigit(c);
}
 
public static void main(String[] args) {
ValidPalindrome vp = new ValidPalindrome();
String input = "A man, a plan, a canal: Panama";
boolean result = vp.isPalindrome(input);
System.out.println("Is the input a valid palindrome? " + result);
}
}