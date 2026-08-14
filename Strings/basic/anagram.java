package Strings.basic;

import java.util.HashMap;
import java.util.Scanner;

import Array7.rotatematrix;

public class anagram {
    // boolean anagramCheck(String s,String t){
    //     if(s.length() != t.length()) return false;

    //     char[] arr = new char[26];

    //     for(int i=0;i<s.length();i++){
    //         arr[s.charAt(i)-'a']++;
    //         arr[t.charAt(i)-'a']--;
    //     }
    //     for(int count : arr){
    //         if(count!=0) return false;
    //     }
    //     return true;
    // }

    // Unicode
    boolean anagramCheck(String s,String t){
        if(s.length() != t.length()) return false;

        HashMap <Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        for(int i=0;i<t.length();i++){
            if(!map.containsKey(t.charAt(i))) return false;

            map.put(t.charAt(i), map.get(t.charAt(i))-1);

            if(map.get(t.charAt(i))==0) map.remove(t.charAt(i));
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        anagram obj = new anagram();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(obj.anagramCheck(s, t));

    }
}
