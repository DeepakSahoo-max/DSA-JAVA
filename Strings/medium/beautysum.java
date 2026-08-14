package Strings.medium;

import java.util.Scanner;

public class beautysum {
     public int beautySum(String s) {
        int n = s.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                int[] freq = new int[26];

                for (int k = i; k <= j; k++) {
                    freq[s.charAt(k) - 'a']++;
                }

                int max = 0;
                int min = Integer.MAX_VALUE;

                for (int f : freq) {

                    if (f > 0) {
                        max = Math.max(max, f);
                        min = Math.min(min, f);
                    }
                }

                ans += max - min;
            }
        }

        return ans;
    }
    // Optimal
    // int beautySum(String s){
    //     int n=s.length();
    //     int sum=0;
    //     for(int i=0;i<n;i++){
    //        int []freq = new int[26];
    //         for(int j=i;j<n;j++){
    //             freq[s.charAt(j)-'a']++;
    //             int max = Integer.MIN_VALUE;
    //             int min = Integer.MAX_VALUE;
    //             for(int val:freq){
    //                 if(val>0){
    //                     max=Math.max(max, val);
    //                     min=Math.min(min,val);
    //                 }
    //             }
    //             sum += max-min;
    //         }
    //     }
    //     return sum;
    // }
    public static void main(String[] args) {
        beautysum obj = new beautysum();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(obj.beautySum(s));

    }
}
