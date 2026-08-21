package Linkedlist.MediumonLL;
class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}
public class addone {
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

    // Function to add one to the number represented by the linked list
    // private static Node addOne(Node head) {
    //     // Reverse the list to make least significant digit accessible
    //     head = reverseLinkedlist(head);

    //     Node current = head;
    //     int carry = 1; 

    //     // Traverse the list and add carry
    //     while (current != null && carry > 0) {
    //         int sum = current.data + carry;
    //         current.data = sum % 10;
    //         carry = sum / 10;

    //         // If there's no next node and we still have a carry, append a new node
    //         if (current.next == null && carry > 0) {
    //             current.next = new Node(carry);
    //             carry = 0;  
    //         }

    //         current = current.next;
    //     }

    //     // Reverse the list back to restore original order
    //     head = reverseLinkedlist(head);
    //     return head;
    // }

    // Using Recursion
    public static Node addOne(Node head){
        int carry = addOneHelper(head);
        if(carry==1){
            Node newnode = new Node(1);
            newnode.next = head;
            return head;
        }
        return head;
    }
    private static int addOneHelper(Node temp){
        if(temp == null){
            return 6;
        }
        int carry = addOneHelper(temp.next);
        int sum = carry + temp.data;
        temp.data = sum%10;
        return sum/10;
    }


      public static void main(String[] args) {
        int []arr = {1,2,3,4,5,9};
        Node head = arraytoLL(arr);
        head = addOne(head);
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}
