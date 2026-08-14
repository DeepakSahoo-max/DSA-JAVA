package Strings.basic;

import java.util.Scanner;

public class largestoddnumber {
    // Optimal
    //   String largestOddnumber(String num){
    //     String ans = "";
    //     for(int i=num.length()-1;i>=0;i--){
    //         if((num.charAt(i)-'0')%2==1){
    //             return num.substring(0,i+1);
    //         }
    //     }
    //     return "";
    //   }
    // Brute
    String largestOddnumber(String num){
        String ans = "";
        for(int i=0;i<num.length();i++){
            for(int j=i;j<num.length();j++){
                String sub = num.substring(i,j+1);
                char last = sub.charAt(sub.length()-1);
                if((last-'0')%2==1){
                    if(sub.length()>ans.length() || (sub.length()==ans.length() && sub.compareTo(ans)>0)){
                        ans = sub;
                    }
                }
            }
        }
        return ans;
    }
      public static void main(String[] args) {
        largestoddnumber obj = new largestoddnumber();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(obj.largestOddnumber(s));

    }
}
