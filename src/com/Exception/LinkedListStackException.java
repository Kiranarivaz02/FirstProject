package com.Exception;
/*problem statement
 * Erric has to create a prg to store values in a LinkedList like a stack which follows FIFO
 * He also has to implement exception handling for different scenarios for stack 
 * #when stack is full
 * # when stack is empty
 * For this erric can create a user defined exception class StackMemoryException 
 * Create the above prg and implement exception handling using StackMemoryException on push.pop and peek method 
 */

class StackOverflowException extends Exception {
    public StackOverflowException(String message) {
        super(message);
    }
}
 
class StackUnderflowException extends Exception {
    public StackUnderflowException(String message) {
        super(message);
    }
}
 
class Node {
    int data;
    Node next;
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
 
public class LinkedListStackException {
    Node TOP;
    int size;
    int capacity;
 
    public LinkedListStackException(int capacity) {
        this.TOP = null;
        this.size = 0;
        this.capacity = capacity;
    }
 
    public void push(int data) throws StackOverflowException {
        if (size == capacity) {
            throw new StackOverflowException("Stack is full. Cannot push " + data);
        }
        Node n = new Node(data, null);
        n.next = TOP;
        TOP = n;
        size++;
    }
 
    public int pop() throws StackUnderflowException {
        if (TOP == null) {
            throw new StackUnderflowException("Stack is empty. Cannot pop.");
        }
        int data = TOP.data;
        TOP = TOP.next;
        size--;
        return data;
    }
 
    public int peek() throws StackUnderflowException {
        if (TOP == null) {
            throw new StackUnderflowException("Stack is empty. Cannot peek.");
        }
        return TOP.data;
    }

    public static void main(String args[]) {
        try {
            LinkedListStackException ls = new LinkedListStackException(3);
            ls.push(10);
            ls.push(20);
            ls.push(30);
            // Uncommenting the next line will throw a StackOverflowException
             //ls.push(40);
 
            System.out.println(ls.peek()); // Should print 30
            System.out.println(ls.pop());  // Should print 30
            System.out.println(ls.pop());  // Should print 20
            System.out.println(ls.pop());  // Should print 10
            // Uncommenting the next line will throw a StackUnderflowException
            System.out.println(ls.pop());
        } catch (StackOverflowException | StackUnderflowException e) {
            System.err.println(e.getMessage());
        }
    
    }
    
}

