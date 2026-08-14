package Strings.basic;

import java.util.Scanner;

public class longestcommonprefix {
    // Brute 
    String longestcommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        String first = strs[0];
        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != ch) {
                    return first.substring(0, i);
                }
            }
        }
        return first;

    }

    // Optimal
    // String longestcommonPrefix(String[]strs){
    // if(strs==null || strs.length==0) return "";

    // String prefix = strs[0];
    // for(int i=1;i<strs.length;i++){
    // while (!strs[i].startsWith(prefix)) {
    // prefix = prefix.substring(0,prefix.length()-1);

    // if(prefix.isEmpty()) return "";
    // }
    // }
    // return prefix;
    // }

    

    public static void main(String[] args) {
        longestcommonprefix obj = new longestcommonprefix();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }
        System.out.println(obj.longestcommonPrefix(strs));

    }
}
