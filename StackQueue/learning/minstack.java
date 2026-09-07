package StackQueue.learning;

import java.util.Stack;

public class minstack {
    // Stack<Integer> st = new Stack<>();
    // Stack<Integer> minst = new Stack<>();

    // public void Minstack(){

    // }

    // public void push(int value){
    //     st.push(value);
    //     if(minst.isEmpty()){
    //         minst.push(value);
    //     }else{
    //         minst.push(Math.min(value, minst.peek()));
    //     }
    // }

    // public void pop(){
    //     st.pop();
    //     minst.pop();
    // }

    // public int top(){
    //     return st.peek();
    // }

    // public int getMin(){
    //     return minst.peek();
    // }

    Stack<Long> st = new Stack<>();
    long min ;
    
    public minstack(){

    }

    public void push(int value){
        if(st.isEmpty()){
            min = value;
            st.push((long)value);
        }
        else if (value>min){
            st.push((long)value);
        }else{
            st.push(2L*value - min);
            min = value;
        }
    }

    public void pop(){
        if(st.isEmpty()) return ;
        
        long x = st.pop();

        if(x<min){
            min = 2L*min - x;
        }
    }

    public int top(){
        if(st.isEmpty()) return -1;
        long x = st.peek();

        if(x<min){
            return (int)min;
        }
        return (int)x;
    }

    public int getMin(){
        if(st.isEmpty()) return -1;
        return (int)min;
    }
    
    public static void main(String[] args) {
        minstack s = new minstack();

        // Function calls
        s.push(-2);
        s.push(0);
        s.push(-3);
        System.out.print(s.getMin() + " ");
        s.pop();
        System.out.print(s.top() + " ");
        s.pop();
        System.out.print(s.getMin());
    }

}
