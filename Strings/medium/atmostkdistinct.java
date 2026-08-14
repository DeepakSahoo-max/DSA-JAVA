package Strings.medium;

import java.util.HashMap;
import java.util.Scanner;

public class atmostkdistinct {
    int atmostKDistinct(String s, int k){
         int left=0;int res=0;
    
    HashMap <Character,Integer> map =new HashMap<>();

    for(int right=0;right<s.length();right++){
        map.put(s.charAt(right),map.getOrDefault(s.charAt(right), 0)+1);
       while(map.size()>k){
        char leftChar = s.charAt(left);
        map.put(leftChar,map.get(leftChar)-1);
        if(map.get(leftChar)==0) map.remove(leftChar);
        left++;
    }
    res += (right-left+1);
    }
    return res;
    }

    int exactkdistinctchar(String s, int k){
        return atmostKDistinct(s, k)- atmostKDistinct(s, k-1);
    }


    public static void main(String[] args) {
        atmostkdistinct obj = new atmostkdistinct();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        System.out.print(obj.exactkdistinctchar(s,n));

    }
}
