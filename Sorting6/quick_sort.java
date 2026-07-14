package Sorting6;

import java.util.Scanner;

public class quick_sort {
    public int partition(int[]arr,int low , int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i<j) {
            while (arr[i]<= pivot && i<=high-1) {
                i++;
            }
            while (arr[j]>pivot && j>=low+1) {
                j--;
            }
            if(i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp1 = arr[low];
        arr[low] = arr[j];
        arr[j]= temp1;
        return j;
    }

    public void qs(int[]arr,int low , int high){
        if(low<high){
            int partindex = partition(arr,low , high);
            qs(arr, low,partindex-1 );
            qs(arr, partindex+1,high);
        }
    }

    public void quicksorting(int []arr){
        qs(arr,0,arr.length-1);
    }
    public static void main (String[]args){
        quick_sort obj = new quick_sort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        obj.quicksorting(arr);

        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
