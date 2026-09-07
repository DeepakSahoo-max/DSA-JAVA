package StackQueue.learning;

import java.util.Scanner;
import java.util.Stack;

public class balancedparanthesis {
    boolean isvalidParenthesis(String s){
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' ||ch=='[' || ch=='{'){
                st.push(ch);
            }else{
                if(st.isEmpty()) return false;
                char top = st.pop();
                if(
                    (ch == ')' && top == '(') ||
                    (ch == ']' && top == '[') ||
                    (ch == '}' && top == '{')) continue;
                else 
                    return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[]args){
        balancedparanthesis obj = new balancedparanthesis();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(obj.isvalidParenthesis(s)) {
            System.out.println("True");
        }else {
            System.out.println("false");
        }
    }
}
