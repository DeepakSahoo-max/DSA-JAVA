package Linkedlist.MediumonLL;

import java.util.Stack;

class Node{
        int data;
        Node next;
        Node(int data1,Node next){
            this.data=data1;
            this.next=next;
        }
        Node(int data1){
            this.data=data1;
            this.next=null;
        }
    };
public class isPalindrome { 
    // public static boolean isPalindrome(Node head) {

    //     // Create an empty stack to store values
    //     Stack<Integer> st = new Stack<>();

    //     // Initialize a temporary pointer to the head of the linked list
    //     Node temp = head;

    //     // Traverse the linked list and push values onto the stack
    //     while (temp != null) {

    //         // Push the data from the current node onto the stack
    //         st.push(temp.data);

    //         // Move to the next node
    //         temp = temp.next;
    //     }

    //     // Reset the temporary pointer back to the head of the linked list
    //     temp = head;

    //     // Compare values by popping from the stack and checking against linked list nodes
    //     while (temp != null) {

    //         // If values don't match, it's not a palindrome
    //         if (temp.data != st.peek()) {
    //             return false;
    //         }

    //         // Pop the value from the stack
    //         st.pop();

    //         // Move to the next node in the linked list
    //         temp = temp.next;
    //     }

    //     // If all values match, it's a palindrome
    //     return true;
    // }
    private static Node arraytoLL(int []arr){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1;i<arr.length;i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }
    private static Node reverseLinkedlist(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newhead = reverseLinkedlist(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newhead;
    }
    
    private static boolean isPalindrome(Node head){
        if(head == null || head.next==null) return true;
        Node slow = head;
        Node fast = head;
        while (fast.next!= null && fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node newhead= reverseLinkedlist(slow.next);

        Node first = head;
        Node second = newhead;
        
        while(second!=null){
            if(first.data!= second.data){
                reverseLinkedlist(newhead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverseLinkedlist(newhead);
        return true;
    }
     public static void main(String[] args) {
        int []arr = {1,2,3,3 ,1};
        Node head = arraytoLL(arr);
        boolean b= isPalindrome(head);
        System.out.println(b);
    }
}
