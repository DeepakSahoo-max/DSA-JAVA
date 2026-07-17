package Sorting6;

import java.util.Scanner;

public class insertion_sort {
    // public void insertion_sorting(int []arr,int n){
    //     for(int i=0;i<=n-1;i++){
    //        int j = i;
    //        while(j>0 && arr[j-1]>arr[j]){
    //          int temp = arr[j-1];
    //          arr[j-1]= arr[j];
    //          arr[j] = temp;

    //          j--;
    //          System.out.println("sort");
    //        }
    //     }
    // }
    
    // Recursive approach
     public void insertion_sorting(int []arr,int n , int i){
           if (i==n) return;
           int j = i;
           while(j>0 && arr[j-1]>arr[j]){
             int temp = arr[j-1];
             arr[j-1]= arr[j];
             arr[j] = temp;

             j--;
             System.out.println("sort");
           }
           insertion_sorting(arr, n, i+1);
        
    }
     public static void main (String[]args){
        insertion_sort obj = new insertion_sort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        obj.insertion_sorting(arr, n,0);

        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
 