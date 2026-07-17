package Array7;

import java.util.Scanner;

public class leftRot_one {
    void leftRotateOne(int[]arr,int n ){
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        leftRot_one obj = new leftRot_one();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.leftRotateOne(arr, n);
         for(int i =0;i<n;i++){
           System.out.print(arr[i] + " ");
        }
        
         
    }
}
