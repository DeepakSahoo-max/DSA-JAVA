package BinarySearch.Binary1D;

import java.util.Scanner;

public class findkrotations {
    int findkRotations(int []arr){
        int low = 0;
        int high = arr.length-1;
        int ans = Integer.MAX_VALUE;
        int index=-1;
        while (low<=high) {
             if (arr[low] <= arr[high]) {
             if(arr[low]<ans){
                index = low;
                ans = arr[low];

             }
            break;
        }
        int mid = (low+high)/2;
         if(arr[mid]==arr[low] && arr[mid]==arr[high]){
                low++;
                high--;
                continue;
            }
        if(arr[low]<=arr[mid]){
            if(arr[low]<ans){
                index=low;
                ans = arr[low];
            }   
            low = mid+1;

        }else
            {
            high = mid-1;
            if(arr[mid]<ans){
                index = mid;
                ans =  arr[mid];
            }
        }
    }
    return index;
    }
    
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        findkrotations obj = new findkrotations();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // int k = sc.nextInt();
        System.out.println(obj.findkRotations(arr));
    }
}
