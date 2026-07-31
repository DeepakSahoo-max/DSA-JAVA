package BinarySearch.Binary1D;
import java.util.*;

public class searchnum {
    // Iterative 
    //  int seachArr(int[]arr,int k){
    //     int n = arr.length;
    //     int low = 0;
    //     int high = n-1;
    //     while (low<=high) {
    //         int mid = (low+high)/2;
    //         if(arr[mid]==k) return mid;
    //         else if(k>arr[mid]) low = mid+1;
    //         else high = mid-1;
    //     }
    //     return -1;
    //  }

    // Recursive 
    int seachArr(int[]arr,int low , int high, int k){
        if(low>high) return -1;
        int mid= (low+high)/2;

        if(k==arr[mid]) return mid;
        else if(k>arr[mid]) return seachArr(arr,mid+1 , high, k);
        else return seachArr(arr, low, mid-1, k);
    }
     public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        searchnum obj = new searchnum();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k =sc.nextInt();
        System.out.println(obj.seachArr(arr,0,n-1,k));
    }
}
