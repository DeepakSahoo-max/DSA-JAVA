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
public class middlenode {
    private static Node arraytoLL(int []arr){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1;i<arr.length;i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    // private static Node findmiddle(Node head){
    //     int count =0;
    //     Node temp = head;
    //     while (temp!=null) {
    //         count++;
    //         temp = temp.next;
    //     }
    //     int midnode = (count/2)+1;
    //     temp = head;
    //     while(temp!=null){
    //         midnode -= 1;
    //         if(midnode==0){
    //             break;
    //         }
    //         temp = temp.next;
    //     }
    //     return temp;
    // }
    private static Node findmiddle(Node head){
        Node slow =head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        Node head = arraytoLL(arr);

        Node middle = findmiddle(head);

        System.out.println(middle.data);
    }
}
