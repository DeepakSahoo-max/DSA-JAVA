package Strings.medium;

import java.util.Scanner;

public class myAtoi {

    // public int myatoi(String s){
    //     int i=0;
    //     int n=s.length();
    //     while(i<n && s.charAt(i)=='('){
    //         i++;
    //     }

    //     int sign=1;
    //     if(i<n && (s.charAt(i)=='+' || s.charAt(i)=='-')){
    //         if(s.charAt(i)=='-'){
    //             sign=-1;
    //         }
    //         i++;
    //     }

    //     int num=0;
    //     while(i<n && (s.charAt(i)>='0' && s.charAt(i)<='9')){
    //         int digit = s.charAt(i)-'0';
    //         if(num>(Integer.MAX_VALUE-digit)/10){
    //              if(sign==1){
    //                return Integer.MAX_VALUE;
    //             }else return Integer.MIN_VALUE;
    //         }
    //         num=num*10+digit;
    //         i++;
    //     }
    //   return num*sign;
    // }
    // Brute 
     public int myatoi(String s) {

        int i = 0;
        int n = s.length();

        // 1. Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Sign
        int sign = 1;

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {

            if (s.charAt(i) == '-') {
                sign = -1;
            }

            i++;
        }

        // 3. Read digits
        long num = 0;

        while (i < n && Character.isDigit(s.charAt(i))) {

            num = num * 10 + (s.charAt(i) - '0');

            i++;
        }

        num *= sign;

        // 4. Clamp
        if (num > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (num < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) num;
    }

     public static void main(String[] args) {
        myAtoi obj = new myAtoi();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(obj.myatoi(s));

    }
}
