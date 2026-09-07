package StackQueue;
class Node {
    int data;
    Node next;
    Node (int d){
        data = d;
        next = null;
    }
}
public class queueusingLL {
     private Node start; // Start of the queue
    private Node end; // End of the queue
    private int size; // Size of the queue

    // Constructor
    public queueusingLL() {
        start = end = null;
        size = 0;
    }
    public void push(int x){
        Node element = new Node(x);
        if(start==null){
            start=end=element;
        }
        else{
            end.next = element;
            end = element;
        }
        size++;
    }
    public int pop(){
        if(start==null) return -1;
        int value = start.data;
        Node temp = start;
        start = start.next;
        temp = null;
        size--;
        return value;
    }
    public int peek(){
        if(start==null) return -1;
        return start.data;
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public static void main(String[] args) {
        // Creating a queue
        queueusingLL q = new queueusingLL();

        // Array of commands
        String[] commands = {"queueusingLL", "push", "push", 
                             "peek", "pop", "isEmpty"};
        // Array of inputs
        int[][] inputs = {{}, {3}, {7}, {}, {}, {}};

        for (int i = 0; i < commands.length; ++i) {
            if (commands[i].equals("push")) {
                q.push(inputs[i][0]);
                System.out.print("null ");
            } else if (commands[i].equals("pop")) {
                System.out.print(q.pop() + " ");
            } else if (commands[i].equals("peek")) {
                System.out.print(q.peek() + " ");
            } else if (commands[i].equals("isEmpty")) {
                System.out.print((q.isEmpty() ? "true" : "false") + " ");
            } else if (commands[i].equals("queueusingLL")) {
                System.out.print("null ");
            }
        }
}
}
