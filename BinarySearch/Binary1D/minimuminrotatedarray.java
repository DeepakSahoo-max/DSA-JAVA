package BinarySearch.Binary1D;

import java.util.Scanner;

class minimuminrotatedarray{
    int minimuminRotatedarray(int []arr,int n){
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;
        while (low<=high) {
             if (arr[low] <= arr[high]) {
            ans = Math.min(ans, arr[low]);
            break;
        }

            int mid = (low+high)/2;
        if(arr[mid]==arr[low] && arr[mid]==arr[high]){
                low++;
                high--;
                continue;
            }
        if(arr[low]<=arr[mid]){
            ans = Math.min(arr[low],ans);
            low = mid+1;
        }else{
            high = mid-1;
            ans = Math.min(ans,arr[mid]);
        }
    }
    return ans;
    }
     public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        minimuminrotatedarray obj = new minimuminrotatedarray();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // int k = sc.nextInt();
        System.out.println(obj.minimuminRotatedarray(arr,n));
    }
}