package Strings.basic;

import java.util.HashMap;
import java.util.Scanner;

public class isomorphic {
    // Brute force
    boolean isIsomorphic (String s,String t){
         if(s.length() != t.length()) return false;

         for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) && t.charAt(i)!=t.charAt(j)) return false;
                if(s.charAt(i)!=s.charAt(j)&& t.charAt(i)==t.charAt(j)) return false;
            }
         }
         return true;
    }

    // Two Hashmap
    // boolean isIsomorphic (String s,String t){
    //     if(s.length() != t.length()) return false;

    //     HashMap<Character,Character> map1 = new HashMap<>();
    //     HashMap<Character,Character> map2 = new HashMap<>();

    //     for(int i=0;i<s.length();i++){
    //         char ch1 =s.charAt(i);
    //         char ch2 =t.charAt(i);

    //         if(map1.containsKey(ch1)){
    //             if(map1.get(ch1) != ch2) return false;
    //         }else{
    //             map1.put(ch1, ch2);
    //         }

    //          if(map2.containsKey(ch1)){
    //             if(map2.get(ch2) != ch1) return false;
    //         }else{
    //             map2.put(ch2, ch1);
    //         }
            
    //     }
    //     return true;
    // }

    // Most optimal if ASCII only is given
    //  public boolean isIsomorphic(String s, String t) {
    //     if(s.length() != t.length()) return false;

    //     int[]arr1 = new int[256];
    //     int[]arr2 = new int[256];

    //     for(int i=0;i<s.length();i++){
    //         char ch1 =s.charAt(i);
    //         char ch2 =t.charAt(i);
    //         if(arr1[ch1] != arr2[ch2])  return false;

    //         arr1[ch1]=i+1;
    //         arr2[ch2]=i+1;

    //     }
    //     return true;
    // }
     public static void main(String[] args) {
        isomorphic obj = new isomorphic();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(obj.isIsomorphic(s, t));

    }
}
