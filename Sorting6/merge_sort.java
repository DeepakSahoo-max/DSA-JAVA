package Sorting6;

import java.util.Scanner;

public class merge_sort {
    public void merge(int []arr,int low ,int mid, int high){
        int [] temp = new int[high-low+1];
        int left = low;
        int right =mid+1;
        int k=0;
        while(left<=mid && right<= high){
            if(arr[left]<= arr[right]){
                 temp[k]= arr[left];
                 left++;
                 k++;
            }else{
                temp[k]= arr[right];
                right++;
                k++;
            }
        }

        while(left<=mid){
            temp[k]= arr[left];
            left++;
            k++;
        }
        while (right<=high) {
            temp[k]=arr[right];
            right++;
            k++;
        }
        
        for(int i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }
     
    }

    public void ms(int []arr,int low , int high){
         if(low==high) return;
         int mid=(low+high)/2;
         ms(arr, low,mid);
         ms(arr, mid+1, high);
         merge(arr,low,mid,high);
    }

    public void mergesorting(int []arr,int n){
            ms(arr,0,n-1);
    }
    public static void main (String[]args){
        merge_sort obj = new merge_sort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        obj.mergesorting(arr, n);
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
