package Array7;

import java.util.HashMap;
import java.util.Scanner;

public class Longestsubarr {
    // hashmap
    // int  LongestSubarr(int[]arr, int n,long k){
    //     HashMap<Long,Integer> map = new HashMap<>();
    //     long sum = 0;
    //     int  maxLength =0;
    //     for(int i=0;i<n;i++){
    //        sum += arr[i];
    //        if(sum == k){
    //            maxLength = Math.max(maxLength, i+1);
    //        }
    //        long rem = (sum - k);
    //        if(map.containsKey(rem) ){
    //         int len = i-map.get(rem);
    //         maxLength = Math.max(maxLength,len);
    //        }

    //        if (!map.containsKey(sum)){
    //         map.put(sum,i);
    //        }
    //     }
    //     return maxLength;
    // }
    //

    // Two pointer approach
    int LongestSubarr(int[]arr,int n , long k){
        int le=0;
        int re=0;
        int maxLength=0;
        long sum = arr[0];
        while(re<n){
            while (le<re && sum>k) {
                sum -= arr[le];
                le++;
            }
            if(sum == k){
                maxLength = Math.max(maxLength,re-le+1);
            }
            re++;
            if(re<n) sum += arr[re];
        }
        return maxLength;
    }
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        Longestsubarr obj = new Longestsubarr();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(obj.LongestSubarr(arr, n,k));
         
    }
}
