package com.DataStructure;
class ListNode {
    int value;
    ListNode next;
    
    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class MergeSortLinked {
    
    public static ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Base case: list is already sorted
        }
        
        // Split the list into two halves
        ListNode middle = getMiddle(head);
        ListNode nextOfMiddle = middle.next;
        middle.next = null; // Split the list into two halves
        
        // Recursively sort the two halves
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(nextOfMiddle);
        
        // Merge the sorted halves
        return merge(left, right);
    }
    
    private static ListNode getMiddle(ListNode head) {
        if (head == null) {
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        // Move fast by two and slow by one
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow; // Slow is now at the middle
    }
    
    private static ListNode merge(ListNode left, ListNode right) {
        if (left == null) return right;
        if (right == null) return left;
        
        ListNode result;
        
        // Start with the linked list that has the smaller value
        if (left.value <= right.value) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(38);
        head.next = new ListNode(27);
        head.next.next = new ListNode(43);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next = new ListNode(82);
        head.next.next.next.next.next.next = new ListNode(10);
        
        System.out.println("Original linked list:");
        printList(head);
        
        head = mergeSort(head);
        
        System.out.println("Sorted linked list:");
        printList(head);
    }
    
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
