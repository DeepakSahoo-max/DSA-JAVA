package Array7.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

 

class threesum {
    // brute force
    // HashSet<List<Integer>> triple (int [] arr,int n){
    //     HashSet<List<Integer>> ans = new HashSet<>();
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             for(int k=j+1;k<n;k++){
    //                 if(arr[i]+arr[j]+arr[k] ==0){
    //                     List<Integer> temp = new ArrayList<>();
    //                     temp.add(arr[i]);
    //                     temp.add(arr[j]);
    //                     temp.add(arr[k]);
    //                     Collections.sort(temp);
    //                     ans.add(temp);
    //                 }
    //             }
    //         }
    //     }
    //      for(List<Integer> X : ans)
    //         System.out.println(X);
    //     return  ans;
    // }

    // Better
    HashSet<List<Integer>> triple (int[]arr,int n){
        HashSet<List<Integer>> ans = new HashSet<>();
        for(int i=0;i<n;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third = -(arr[i] + arr[j]);
                if(set.contains(third)){
                    List<Integer> temp = Arrays.asList(arr[i],arr[j],third);
                    Collections.sort(temp);
                    ans.add(temp);
                }
                set.add(arr[j]);
            }
        }
        for(List<Integer> X :ans){
            System.out.println(X);
        }
        return ans;
        }
    
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        threesum obj = new threesum();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.triple(arr, n);   
        sc.close();    
    }
}