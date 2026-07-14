package Sorting6;

import java.util.Scanner;

public class bubble_sort {

    public void bubble_sorting(int arr[],int n ){
        for(int i=n-1;i>=0;i--){
            int swap =0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                 int temp = arr[j+1];
                 arr[j+1]= arr[j];
                 arr[j] = temp;
                 swap =1;
                }
            }
            if(swap==0){
                break;
            }
            System.out.println("sort");
        }
    }
    public static void main (String[]args){
        bubble_sort obj = new bubble_sort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        obj.bubble_sorting(arr, n);

        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
