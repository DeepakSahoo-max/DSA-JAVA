package Linkedlist.MediumonLL;
import java.util.*;

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
public class lengthofloop {
    //  private static int   detectLoop(Node head){
    //     Node temp = head;
    //     HashMap<Node,Integer> nodeMap = new HashMap<>();
    //     int timer =0;
    //     while(temp!=null){
    //         if(nodeMap.containsKey(temp)){
    //             int loopLength = timer - nodeMap.get(temp);
    //             return loopLength;
    //         } 
    //         nodeMap.put(temp, timer);
    //         temp= temp.next;
    //         timer++;
    //     }
    //     return 0;
    // }


     private static int detectLoop(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) return countlooplength(slow);
        }
        return 0;
    }
    private static int countlooplength(Node meetingPoint){
        Node temp = meetingPoint;
        int length =1;
        while(temp.next != meetingPoint){
            temp = temp.next;
            length++;
        }
        return length;
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
        System.out.println(detectLoop(head));
    }
}
