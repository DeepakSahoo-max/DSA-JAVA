package BinarySearch.Binary1D;

import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

public class searchinrotatedarray1 {
     int searchinrotatedArray1(int[] arr,int k){
        int low =0;
        int high = arr.length-1;
        while (low<=high) {
            int mid = (low+high) / 2;
            if(arr[mid]==k) return mid;
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
        return -1;
     }
     public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        searchinrotatedarray1 obj = new searchinrotatedarray1();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(obj.searchinrotatedArray1(arr, k));
    }
}
