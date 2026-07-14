package Sorting6;

import java.util.Scanner;

public class selection_sort {
    public void selection(int[]arr,int n){
        for(int i=0;i<=n-2;i++){
        int mini =i;
        for(int j=i;j<= n-1;j++){
            if(arr[j]< arr[mini])
                mini = j;
        }
        int temp=arr[mini];
        arr[mini] = arr[i];
        arr[i]= temp;
       }
    } 
   

    public static void main (String[]args){
        selection_sort obj = new selection_sort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        obj.selection(arr, n);
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
