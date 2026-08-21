package Linkedlist.MediumonLL;
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
public class oddevennode {
     private static Node arraytoLL(int []arr){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1;i<arr.length;i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }
    private static Node oddEvenLL(Node head){
        if(head == null || head.next==null) return head;
        Node odd = head;
        Node even = head.next;
        Node evenhead = head.next;
        while(even!=null && even.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenhead;
        return head;
    }
      public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        Node head = arraytoLL(arr);
        head = oddEvenLL(head);
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
