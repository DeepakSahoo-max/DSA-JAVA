package Array7;

import java.util.Scanner;

import BasicRecursion4.reverseArray;

public class leftRot_k {
    // void leftrotate_k(int[]arr,int n, int k){
    //     k=k%n;
    //     int []temp = new int[k];
    //     for(int i=0;i<k;i++){
    //         temp[i]=arr[i];
    //     }
    //     for(int i=k;i<n;i++){
    //         arr[i-k]=arr[i];
    //     }
    //     for(int i=n-k;i<n;i++){
    //         arr[i]= temp[i-(n-k)];
    //     }
    // }
    void reverse(int[]arr,int start , int end){
        while(start<end){
              int temp=arr[start];
              arr[start]=arr[end];
              arr[end]=temp;
              start++;
              end--;
        }
    }
     void leftrotate_k(int[]arr,int n, int k){
        k=k%n;

        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);

    }
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        leftRot_k obj = new leftRot_k();
        int n = sc.nextInt();
        System.out.println("enter k:");
        int k = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.leftrotate_k(arr, n,k);
         for(int i =0;i<n;i++){
           System.out.print(arr[i] + " ");
        }
    }
}
