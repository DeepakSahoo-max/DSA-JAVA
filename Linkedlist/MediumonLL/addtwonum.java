package Linkedlist.MediumonLL;
class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}
public class addtwonum {
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

    private static Node addTwoNum(Node head1,Node head2){
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        int carry = 0 ;
        while(head1!=null || head2!=null || carry==1){
            int sum = 0;
            if(head1!=null){
                sum += head1.data;
                head1 = head1.next;
            }
            if(head2!=null){
                sum+=head2.data;
                head2 = head2.next;
            }
            sum += carry;
            carry = sum/10;
            Node newNode = new Node(sum%10);
            temp.next = newNode;
            temp = temp.next;
        }
        return dummyNode.next;
    }
     public static void main(String[] args) {
        int []arr1 = {1,2,3};
        int []arr2 = {5,6};
        Node head1 = arraytoLL(arr1);
        Node head2 = arraytoLL(arr2);
        head1 = reverseLinkedlist(head1);
        head2 = reverseLinkedlist(head2);
        Node head = addTwoNum(head1, head2);
        head = reverseLinkedlist(head);
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}
