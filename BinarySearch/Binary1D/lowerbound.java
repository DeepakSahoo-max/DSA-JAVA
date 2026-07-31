package BinarySearch.Binary1D;

import java.util.Scanner;

public class lowerbound {
    int lowerBound(int[]arr,int k){
       int low =0;
       int high=arr.length-1;
       int ans = arr.length;
       while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid]>=k) {
            ans = mid;
            high = mid-1;
        }else{
            low = mid+1;
        }
       }
       return ans;
    }
     int higherBound(int[]arr,int k){
       int low =0;
       int high=arr.length-1;
       int ans = arr.length;
       while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid]>k) {
            ans = mid;
            high = mid-1;
        }else{
            low = mid+1;
        }
       }
       return ans;
    }
    int ceil(int[]arr,int k){
       int low =0;
       int high=arr.length-1;
       int ans = arr.length;
       while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid]>=k) {
            ans = arr[mid];
            high = mid-1;
        }else{
            low = mid+1;
        }
       }
       return ans;
    }
    int floor(int[]arr,int k){
       int low =0;
       int high=arr.length-1;
       int ans = arr.length;
       while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid]<=k) {
            ans = arr[mid];
            low = mid+1;
        }else{
            high = mid-1;
        }
       }
       return ans;
    }
     public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        lowerbound obj = new lowerbound();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(obj.floor(arr,k));
         
    }
}
