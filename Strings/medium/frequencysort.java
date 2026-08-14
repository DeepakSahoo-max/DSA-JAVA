package Strings.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;

import Strings.basic.rotatestring;

public class frequencysort {
    String frequencySort(String s){
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
         
        List<Character> chars = new ArrayList<>(map.keySet());
        chars.sort((a,b)->map.get(b)-map.get(a));

        StringBuilder ans = new StringBuilder();
        for(char ch:chars){
            ans.append(String.valueOf(ch).repeat(map.get(ch)));
        }
        return ans.toString();
    }
    // String frequencySort(String s){
    //     HashMap<Character,Integer> map = new HashMap<>();

    //     for(char ch:s.toCharArray()){
    //         map.put(ch,map.getOrDefault(ch,0)+1);
    //     }

    //     List<Character>[] buckets = new ArrayList[s.length()+1];

    //     for(char ch:map.keySet()){
    //         int freq = map.get(ch);
    //         if(buckets[freq]==null){
    //             buckets[freq]= new ArrayList<>();
    //         }
    //         buckets[freq].add(ch);
    //     }

    //     StringBuilder ans = new StringBuilder();
    //     for(int freq=s.length();freq>=1;freq--){
    //         if(buckets[freq]==null){
    //             continue;
    //         }
    //         for(char ch:buckets[freq]){
    //             for(int i=0;i<freq;i++){
    //                 ans.append(ch);
    //             }
    //         }
    //     }
    //     return ans.toString();
    // }
    public static void main(String[] args) {
        frequencysort obj = new frequencysort();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(obj.frequencySort(s));

    }
}
