package BasicRecursion4;

import java.util.*;

public class reverseArray {
    // public void reverse_arr(int i,int [] arr , int n ){
    //     if(i>=n)
    //         return ;
    //     int temp = arr[i];
    //     arr[i] = arr[n];
    //     arr[n]= temp;
    //     reverse_arr(i+1, arr, n-1);

    // }
    public void reverse_arr(int i , int []arr, int n ){
        if(i>=n/2)
            return;
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        reverse_arr(i+1, arr, n);
    }
    public static void main (String[]args){
        reverseArray obj = new reverseArray();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i =0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        obj.reverse_arr(0, arr, n);
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
