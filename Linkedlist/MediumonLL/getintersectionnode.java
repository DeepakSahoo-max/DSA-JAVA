package Linkedlist.MediumonLL;
class Node {
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
}
public class getintersectionnode {
    // private static Node intersectionPresent(Node head1, Node head2){
    //     while(head2!=null){
    //         Node temp = head1;
    //         while(temp!=null){
    //             if(temp == head2) return head2;
    //             temp = temp.next;
    //         }
    //         head2  = head2.next;
    //     }
    //     return null;
    // }

    // Optimal
    private static Node intersectionPresent(Node head1, Node head2){
        if(head1==null || head2==null) return null;
        Node temp1= head1;
        Node temp2 = head2;
        while (temp1!=temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
            
            if(temp1==temp2) return temp1;
            
            if(temp1==null) temp1 = head2;
            if(temp2==null) temp2 = head1;
        }
        return temp1;
    }
    
    public static void main(String[] args) {
    // Common part
    Node common = new Node(8);
    common.next = new Node(5);
    common.next.next = new Node(9);

    // First list
    Node head1 = new Node(1);
    head1.next = new Node(2);
    head1.next.next = new Node(3);
    head1.next.next.next = common;

    // Second list
    Node head2 = new Node(6);
    head2.next = new Node(7);
    head2.next = common;

    Node head = intersectionPresent(head1, head2);

    if (head != null)
        System.out.println(head.data);
    else
        System.out.println("No intersection");
    }
}
 
