package Array7;

import java.util.Scanner;

 

public class nextgreaterpermutation {

    void nextgreaterPermutation(int[]arr){
        int index = -1;
        int n = arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(arr, 0, n-1);
        }
        for(int i=n-1; i>=index;i--){
            if(arr[i]>arr[index]){
            swap(arr, i, index);
            break;
            }
        }
        reverse(arr, index+1, n-1);  
    }
       private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
         private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


     public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        nextgreaterpermutation obj = new nextgreaterpermutation();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.nextgreaterPermutation(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
