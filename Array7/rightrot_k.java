package Array7;

import java.util.Scanner;

public class rightrot_k {
    void reverse(int[]arr,int start , int end){
        while(start<end){
              int temp=arr[start];
              arr[start]=arr[end];
              arr[end]=temp;
              start++;
              end--;
        }
    }
     void rightRotate(int[]arr,int n, int k){
        k=k%n;

        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
     }
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        rightrot_k obj = new rightrot_k();
        int n = sc.nextInt();
        System.out.println("enter k:");
        int k = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.rightRotate(arr, n,k);
         for(int i =0;i<n;i++){
           System.out.print(arr[i] + " ");
        }
    }
}
