package Linkedlist;

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

public class arraytolinkedlist {
    private  static Node arraytoLinkedlist(int[]arr){
       Node head = new Node(arr[0]);
       Node mover = head;
       for(int i=1;i<arr.length;i++){
        Node temp = new Node(arr[i]);
        mover.next = temp;
        mover = temp;
       }
    return head;
    }
    private static int lengthofLL(Node head){
        int count=0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    public boolean searchValue(Node head , int val){
        Node temp = head;
        while(temp != null){
            if(temp.data==val){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    private static Node removesHead(Node head){
        if(head==null) return head;
        head = head.next;
        return head;
    }
    private static Node removeTail(Node head){
        if(head==null || head.next==null) return null;
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    private  static Node removek(Node head,int k){
        if(head==null) return head;
    if(k==1){
        Node temp = head;
        head = head.next;
    }
    int count =0;
    Node temp = head;
    Node prev = null;
    while(temp!=null){
        count++;
        if(count==k){
            prev.next = prev.next.next;
            break;
        }
        prev = temp;
        temp = temp.next;
    }
        return head;
    }
      private  static Node removeEle(Node head,int ele){
        if(head==null) return head;
    if(head.data==ele){
        Node temp = head;
        head = head.next;
    }
    Node temp = head;
    Node prev = null;
    while(temp!=null){   
        if(temp.data == ele){
            prev.next = prev.next.next;
            break;
        }
        prev = temp;
        temp = temp.next;
    }
        return head;
    }
   private static Node insertHead(Node head, int val){
        Node temp = new Node(val,head);
        return temp;
    }
    private static Node insertTail(Node head,int val){
        if(head==null) return new Node(val);
        Node temp= head;
        while(temp.next!=null){
            temp= temp.next;
        }
        Node newnode  = new Node(val);
        temp.next = newnode;
        return head;
    }
    private static Node insertAtk(Node head,int ele,int k){
        if(head==null){
            if(k==1){
                return new Node(ele);
            }else return head;
        }
        if(k==1){
            return new Node(ele,head);
        }
        int count=1;
        Node temp = head;
        while (temp!=null) {
            if(count==k-1){
                Node x = new Node(ele,temp.next);
                temp.next=x;
                break;
            }
            count++;
            temp = temp.next;
        }
        return head;
    }
    private static Node insertbeforeval(Node head,int ele,int val){
        if(head==null){
            return null;
        }
        if(head.data==val){
            return new Node(ele,head);
        }
        Node temp = head;
        while (temp.next!=null) {
            if(temp.next.data==val){
                Node x = new Node(ele,temp.next);
                temp.next=x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[]args){
        int [] arr = {1,2,7,3};
        arraytolinkedlist obj = new arraytolinkedlist();
        Node head  = arraytoLinkedlist(arr);
        head = insertbeforeval(head,88,2);
        // Traverse the array
        Node temp = head;
        while (temp!=null) {
                System.out.print(temp.data);
                temp  =  temp.next;
        }
        System.out.println();
        // length of LL
        System.out.println(lengthofLL(head));
        System.out.println(obj.searchValue(head, 3));
    }
}
