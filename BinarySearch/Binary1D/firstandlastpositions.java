package BinarySearch.Binary1D;

import java.util.Scanner;

public class firstandlastpositions {
    // public   int lowerBound(int[]arr,int k){
    //    int low =0;
    //    int high=arr.length-1;
    //    int ans = arr.length;
    //    while(low<=high){
    //     int mid = (low+high)/2;
    //     if(arr[mid]>=k) {
    //         ans = mid;
    //         high = mid-1;
    //     }else{
    //         low = mid+1;
    //     }
    //    }
    //    return ans;
    // }
    // int higherBound(int[]arr,int k){
    //    int low =0;
    //    int high=arr.length-1;
    //    int ans = arr.length;
    //    while(low<=high){
    //     int mid = (low+high)/2;
    //     if(arr[mid]>k) {
    //         ans = mid;
    //         high = mid-1;
    //     }else{
    //         low = mid+1;
    //     }
    //    }
    //    return ans;
    // }
    // int[] firstandlastPositions(int[] arr,int k){
    //       int  lb = lowerBound(arr, k);
    //       if(lb == arr.length || arr[lb] != k) return new int[]{-1,-1};
    //       return  new int[]{lb,higherBound(arr, k)-1};
    //         }

    // Binary Search
    //  int lowerBound(int[]arr,int k){
    //    int low =0;
    //    int high=arr.length-1;
    //    int ans = arr.length;
    //    while(low<=high){
    //     int mid = (low+high)/2;
    //     if(arr[mid]>=k) {
    //         ans = mid;
    //         high = mid-1;
    //     }else{
    //         low = mid+1;
    //     }
    //    }
    //    return ans;
    // }
     int firstOccurence(int[]arr,int k){
       int low =0;
       int high=arr.length-1;
       int ans = -1;
       while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid]==k) {
            ans = mid;
            high = mid-1;
        }else if (arr[mid]<k) low = mid+1;
        else{
            high = mid-1;
            }
       }
       return ans;
    }
    int lastOccurence(int[]arr,int k){
       int low =0;
       int high=arr.length-1;
       int ans = -1;
       while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid]==k) {
            ans = mid;
            low = mid+1;
        }else if (arr[mid]<k) low = mid+1;
        else{
            high = mid-1;
            }
       }
       return ans;
    }
      int [] firstandlastPositions(int[]arr,int k){
          int first=firstOccurence(arr, k);
          if(first ==-1){
            return new int[]{-1,-1};
          }
          int last= lastOccurence(arr, k);
          return new int[]{first,last};
      }
      public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        firstandlastpositions obj = new firstandlastpositions();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        int[] ans = obj.firstandlastPositions(arr, k);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
