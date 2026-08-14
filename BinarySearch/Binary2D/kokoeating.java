package BinarySearch.Binary2D;

import java.util.Scanner;

public class kokoeating {
     int maxelement(int []arr){
        int max_ele = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max_ele = Math.max(max_ele, arr[i]);
        }
        return max_ele;
     }
     int time(int []arr,int hourly){
        int totalhours = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            totalhours += (int)Math.ceil((double)arr[i]/hourly);
        }
        return totalhours;
     }
     int noofbananaperHour(int[]arr,int h){
        int low =1;int high= maxelement(arr);
        while (low<=high) {
            int mid = (low+high)/2;
            int totalhours = time(arr,mid);
            if(totalhours<=h){
               high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
     }
     public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        kokoeating obj = new kokoeating();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int h = sc.nextInt();
        System.out.println(obj.noofbananaperHour(arr, h));
    }
}
