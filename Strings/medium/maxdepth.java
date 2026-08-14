package Strings.medium;

import java.util.Scanner;

public class maxdepth {
     int maxDepth(String s){
        int depth=0;
        int max=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                depth++;
                max=Math.max(max,depth);
            }else if(ch==')'){
                depth--;
            }
        }
        return max;
     }
     public static void main(String[] args) {
        maxdepth obj = new maxdepth();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(obj.maxDepth(s));

    }
}
