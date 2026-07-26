package Array7;

import java.util.HashMap;
import java.util.Scanner;

import Sorting6.selection_sort;

public class twosum {
    // HashMap
    // String twoSum(int[]arr,int n , int k){
    //     HashMap <Integer,Integer> map = new HashMap<>();
    //     for(int i=0;i<n;i++){
    //          int a = arr[i];
    //     int rest = k - a;
    //     if(map.containsKey(rest)) return "yes";
    //     map.put(a,i);
    // }
    // return "no";
    // }

    // Two pointer
    String twoSum (int[]arr,int n , int k){
         //sorting
        for(int i=0;i<=n-2;i++){
        int mini =i;
        for(int j=i;j<= n-1;j++){
            if(arr[j]< arr[mini])
                mini = j;
        }
        int temp=arr[mini];
        arr[mini] = arr[i];
        arr[i]= temp;
       }

       int le =0; int re =n-1;
       while(le<re){
        int sum = arr[le] + arr[re];
        if(sum==k){
            return "yes";
        }
        else if (sum<k) le++;
        else re++;
       }
       return "No";
    }
     public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        twosum obj = new twosum();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(obj.twoSum(arr, n,k));
         
    }
}
