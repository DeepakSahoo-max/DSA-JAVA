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

public class remvoenthnode {
  private static Node arraytoLL(int []arr){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1;i<arr.length;i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    // private static Node removeNthnode(Node head,int k){

    //     int count =0; Node temp = head;
    //     while(temp != null){
    //         count++;
    //         temp = temp.next;
    //     }      

    //     if(k==count) return head.next;
    //     int pos = count-k;
    //     temp = head;
    //     while(temp!=null){
    //         pos--;
    //         if(pos==0) {
    //             Node delnode = temp.next;
    //             temp.next = temp.next.next;
    //         }
    //         temp = temp.next;
    //     }
    
    //     return head;
    // }

    private static Node removeNthnode(Node head,int k){
        Node slow = head;
        Node fast = head;
        for(int i=0;i<k;i++) fast = fast.next;
        if(fast== null) return head.next;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {1,2,3,4,5};
        Node head = arraytoLL(arr);
        int k = sc.nextInt();
        head = removeNthnode(head,k);
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
