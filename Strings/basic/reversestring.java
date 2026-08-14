package Strings.basic;

import java.util.Scanner;

public class reversestring {
    // Optimal two-Pointers
    // String reverseString(String s){
    // StringBuilder ans = new StringBuilder();
    // int i = s.length()-1;

    // while (i>=0) {
    // while(i>=0 && s.charAt(i)==' ') i--;

    // if(i<0) break;

    // int j=i;
    // while(j>=0 && s.charAt(j)!=' ') j--;
    // ans.append(s.substring(j+1,i+1));
    // if(j>0) ans.append(" ");

    // i=j;
    // }
    // return ans.toString().trim();
    // }

    // Brute
    String reverseString(String s) {
        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].equals("")) {
                ans.append(words[i]);
                if(i!=0) ans.append(" ");

            }
        }
        return ans.toString().trim();
    }

    public static void main(String[] args) {
        reversestring obj = new reversestring();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(obj.reverseString(s));

    }
}
