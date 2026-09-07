package StackQueue;

public class queueusingarr {
    int[]arr;
    int start,end;
    int currsize,maxsize;

    public queueusingarr(){
        arr = new int[10];
        start = -1;
        end =-1;
        currsize = 0;
        maxsize = 10;
    }

    public void push(int x){
        if(currsize==maxsize){
            System.out.println("full");
        }
        if(end==-1){
            start = 0;
            end = 0;
        }
        else{
            end = (end+1) % maxsize;
        }
        arr[end]= x;
        currsize++;
    }
    
    public int pop(){
        if(start==-1){
            System.out.println("empty");
        }
        int popped = arr[start];
        if(currsize==1){
            start = -1;
            end = -1;
        }
        else{
            start = (start+1)%maxsize;
        }
        currsize--;
        return popped;
    }
     public int peek() {
        // Check if the queue is empty
        if (start == -1) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        return arr[start];
    }
     public boolean isEmpty() {
        return (currsize == 0);
    }

    public static void main(String[] args) {
        queueusingarr queue = new queueusingarr();

        String[] commands = {"queueusingarr", "push", "push", 
                             "peek", "pop", "isEmpty"};
        int[][] inputs = {{}, {5}, {10}, {}, {}, {}};

        for (int i = 0; i < commands.length; ++i) {
            switch (commands[i]) {
                case "push":
                    queue.push(inputs[i][0]);
                    System.out.print("null ");
                    break;
                case "pop":
                    System.out.print(queue.pop() + " ");
                    break;
                case "peek":
                    System.out.print(queue.peek() + " ");
                    break;
                case "isEmpty":
                    System.out.print(queue.isEmpty() ? "true " : "false ");
                    break;
                case "queueusingarr":
                    System.out.print("null ");
                    break;
            }
        }
}
}