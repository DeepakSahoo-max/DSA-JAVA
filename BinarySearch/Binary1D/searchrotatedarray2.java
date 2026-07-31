package BinarySearch.Binary1D;

import java.util.Scanner;

public class searchrotatedarray2 {
     boolean searchrotatedArray2(int[] arr,int k){
        int low =0;
        int high = arr.length-1;
        while (low<=high) {
            int mid = (low+high) / 2;
            if(arr[mid]==k) return true;
            if(arr[mid]==arr[low] && arr[mid]==arr[high]){
                low++;
                high--;
                continue;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=k && k<=arr[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(arr[mid]<=k && k<=arr[high]){
                    low = mid+1;
                }else{
                    high =mid-1;
                }
            }
        } 
        return false;
     }
     public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        searchrotatedarray2 obj = new searchrotatedarray2();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(obj.searchrotatedArray2(arr, k));
    }
}
