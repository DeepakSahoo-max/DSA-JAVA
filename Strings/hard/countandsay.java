package Strings.hard;

import java.util.Scanner;

import Strings.medium.longestpalindrome;

public class countandsay {
    String countAndsay(int n){
        if(n==1) return "1";
        return encode (countAndsay(n-1));
    }
    String encode(String s){
        StringBuilder ans = new StringBuilder();

        int i=0;
        while(i<s.length()){
            char ch = s.charAt(i);
            int count =0;
            while(i<s.length() && s.charAt(i)==ch){
                count++;
                i++;
            }
            ans.append(count).append(ch);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        countandsay obj = new countandsay();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(obj.countAndsay(n));

    }
}
