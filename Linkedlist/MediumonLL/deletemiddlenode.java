package Linkedlist.MediumonLL;
 class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        Node(int data , Node next){
            this.data = data;
            this.next = next;
        }
     } 
public class deletemiddlenode {
    private static Node arraytoLL(int []arr){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1;i<arr.length;i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }
    // private static Node deleteMiddleNode(Node head){
    //     Node temp = head;
    //     int n=0;
    //     while(temp!=null){
    //         n++;
    //         temp = temp.next;
    //     }
    //     int res = n/2;
    //     temp = head;
    //     while(temp!=null){
    //         res--;
    //         if(res==0){
    //             Node middle =temp.next;
    //             temp.next = temp.next.next;
    //             break;
    //         }
    //         temp = temp.next;
    //     }
    //     return head;
    // }
    private static Node deleteMiddleNode(Node head){
        if (head == null || head.next==null) return null;

        Node slow = head;
        Node fast = head.next.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

     public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        Node head = arraytoLL(arr);
        head = deleteMiddleNode(head);
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
