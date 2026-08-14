package Strings.basic;

import java.util.Scanner;

import Strings.hard.countandsay;

/**
 * removeOuterParentheses
 */
public class removeOuterParentheses {
    String removeouterpar(String s){
        StringBuilder result = new StringBuilder();
        int depth =0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                if(depth>0){
                    result.append(ch);
                }
                depth++;
            }else{
                depth--;
                if(depth>0){
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        removeOuterParentheses obj = new removeOuterParentheses();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(obj.removeouterpar(s));

    }
}