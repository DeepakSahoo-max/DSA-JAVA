package Linkedlist.MediumonLL;

import java.util.HashMap;

class Node {
    int data;
    Node next;
    Node (int data1,Node next1){
        data = data1;
        next = next1;
    }
    Node (int data1){
        data = data1;
        next = null;
    }
}
public class startofloop {
    // private static Node startOfloop(Node head){
    //     if(head==null || head.next==null) return head;
    //     Node temp = head;
    //     HashMap <Node,Integer> map = new HashMap<>();
    //     while(temp!=null){
    //         if(map.containsKey(temp)){
    //             return temp;
    //         }
    //         map.put(temp,1);
    //         temp = temp.next;
    //     }
    //     return null;
    // }
    
    private static Node startOfloop(Node head){
        if(head==null || head.next==null) return head;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow ==  fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null; 
    }
    public static void main (String[]args){
         Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;
        Node temp = startOfloop(head);
        System.out.println(temp.data);
    }
}
