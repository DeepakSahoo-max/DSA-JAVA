package BinarySearch.Binary1D;

import java.util.Scanner;

public class findpeakelement {
    int findPeakelement(int[] arr){
        int n = arr.length;
        if(n==1) return arr[0];
        if(arr[0]>arr[1]) return arr[0];
        if(arr[n-1]>arr[n-2]) return arr[n-1];
        int low =1;int high =n-2;
        while (low<=high) {
           int mid = (low+high)/2;
       
         if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return arr[mid];
         else if (arr[mid]>arr[mid-1]){
            low = mid+1;
         }else if(arr[mid]>arr[mid+1]){
            high = mid-1;
         }else{
            low = mid+1;
         }
    }
    return -1;
    }
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        findpeakelement obj = new findpeakelement();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // int k = sc.nextInt();
        System.out.println(obj.findPeakelement(arr));
    }
}
