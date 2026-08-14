package Strings.medium;

import java.util.Scanner;

import BasicRecursion4.palindrome;

public class longestpalindrome {
    // Brute force
     boolean isPalindrome(String s, int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s,i,j)){
                    if(j-i+1>ans.length()){
                      ans = s.substring(i,j+1);
                    }
                }
            }
        }
        return ans;
    }
    // Optimal
    // int expand(String s, int left, int right) {
    //     while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
    //         left--;right++;
    //     }
    //     return right-left-1;
    // }

    // String longestPalindrome(String s) {
    //     int start = 0;
    //     int end = 0;
    //     for (int i = 0; i < s.length(); i++) {
    //         int len1 = expand(s, i, i);
    //         int len2 = expand(s, i, i + 1);
    //         int len = Math.max(len1, len2);
    //         if (len > end - start + 1) {
    //             start = i - (len - 1) / 2;
    //             end = i + len / 2;
    //         }
    //     }
    //     return s.substring(start, end + 1);
    // }

    public static void main(String[] args) {
        longestpalindrome obj = new longestpalindrome();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(obj.longestPalindrome(s));

    }
}
