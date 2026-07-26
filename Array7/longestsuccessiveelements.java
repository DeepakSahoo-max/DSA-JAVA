package Array7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class longestsuccessiveelements {
    // Better approach
    //  int longestsuccessivElements(int[]arr,int n){
    //    Arrays.sort(arr);
    //    int lastsmaller = Integer.MIN_VALUE;
    //    int count = 0 ;
    //    int longest =1;
    //    for(int i=0;i<n;i++){
    //     if(arr[i]-1 == lastsmaller){
    //         count += 1;
    //         lastsmaller = arr[i];
    //     }
    //     else if(arr[i]!= lastsmaller){
    //         count =1;
    //         lastsmaller = arr[i];
    //     }
    //     longest = Math.max(longest,count);
    //    }
    //    return longest;
    // }

    // Optimal Solution
    int longestsuccessivElements(int []arr,int n){
        if(n==0) return 0;
        int longest = 1;
        HashSet <Integer> ans = new HashSet<>();
        for(int i=0;i<n;i++){
            ans.add(arr[i]);
        }
        for(int num:ans){
            if(!ans.contains(num-1)){
                int count =1;
                int x = num;
                while (ans.contains(x+1)) {
                    x += 1;
                    count += 1;
                }
                longest =Math.max(longest,count);
            }
        }
        return longest;
    }
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        longestsuccessiveelements obj = new longestsuccessiveelements();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(obj.longestsuccessivElements(arr,n));
    }
}
