package BinarySearch.Binary2D;

import java.util.Scanner;

public class shipwithindays {
    
      int time(int []weights,int capacity){
        int totaldays = 1;
        int load =0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>capacity){
                totaldays += 1;
                load = weights[i];
            }else {
                load += weights[i];
            }
        }
        return totaldays;
    }
    int maxelement (int[]weights){
        int max = Integer.MIN_VALUE;
        for(int x:weights) max = Math.max(max,x);
        return max;
    }

    int sum(int[]weights){
        int sum =0;
        for(int x:weights) sum += x;
        return sum;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = maxelement(weights);
        int high= sum(weights);
        while(low<=high){
            int mid = (low+high)/2;
            int totaldays = time(weights,mid);
                if(totaldays<=days){
                    high = mid-1;
                }else {
                    low = mid+1;
                }
            }
            return low;
        }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        shipwithindays obj = new shipwithindays();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int h = sc.nextInt();
        System.out.println(obj.shipWithinDays(arr, h));
    }
}
