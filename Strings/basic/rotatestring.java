package Strings.basic;

import java.util.Scanner;

public class rotatestring {
    // boolean rotatestring(String s , String goal){
    //     if(s.length() != goal.length()) return false;
    //     String current = s;
    //     for(int i=0;i<s.length();i++){
    //         if(current.equals(goal)) return true;
    //         current = current.substring(1)+current.charAt(0);
    //     }
    //     return false;
    // }

    // Better
    boolean rotatestring(String s , String goal){
        if(s.length() != goal.length()) return false;
        return (s+s).contains(goal);
    }
    public static void main(String[] args) {
        rotatestring obj = new rotatestring();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String goal = sc.next();
        System.out.print(obj.rotatestring(s,goal));

    }
}
