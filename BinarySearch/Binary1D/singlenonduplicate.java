package BinarySearch.Binary1D;

import java.util.Scanner;

public class singlenonduplicate {
    int singleNonduplicate(int []arr){
        int n = arr.length;
        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1] != arr[n-2]) return arr[n-1];
        int low = 0;
        int high = n-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if(arr[mid] != arr[mid+1] && arr[mid]!=arr[mid-1]) return arr[mid];

            if((mid%2 == 1 && arr[mid]==arr[mid-1]) || (mid%2==0 && arr[mid]==arr[mid+1]) ){
                low = mid+1;
            }else{
                high = mid-1;
            }
                }
        return -1;
    }
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        singlenonduplicate obj = new singlenonduplicate();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // int k = sc.nextInt();
        System.out.println(obj.singleNonduplicate(arr));
    }
}
