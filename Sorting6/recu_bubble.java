package Sorting6;

import java.util.Scanner;

public class recu_bubble {
    public void recur_bubble(int[]arr,int n){
        if (n==1) return;

        boolean swap=false;

        for(int j=0;j<=n-2;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1]=temp;
                swap = true;
            }
       
            }
            if(swap=false) return;

            recur_bubble(arr, n-1);
        }
    public static void main (String[]args){
        recu_bubble obj = new recu_bubble();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        obj.recur_bubble(arr,n);

        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
