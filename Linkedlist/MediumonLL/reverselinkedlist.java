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

public class reverselinkedlist {
     private static Node arraytoLL(int []arr){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1;i<arr.length;i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    // private static Node reverseLinkedlist(Node head){
    //     Node temp = head;
    //     Stack <Integer> stack = new Stack<>();
    //     while(temp!= null){
    //         stack.push(temp.data);
    //         temp = temp.next;
    //     }
    //     temp = head;
    //     while(temp!=null){
    //         temp.data = stack.pop();
    //         temp = temp.next;
    //     }
    //     return head;
    // }

    // Better
    // private static Node reverseLinkedlist(Node head){
    //     Node temp = head;
    //     Node prev = null;
    //     while(temp!=null){
    //         Node front = temp.next;
    //         temp.next= prev;
    //         prev = temp; 
    //         temp = front;
    //     }
    //     return prev;
    // }

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
     public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        Node head = arraytoLL(arr);
        head = reverseLinkedlist(head);
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}
