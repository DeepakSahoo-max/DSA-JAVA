package Array7;

import java.util.Scanner;

public class rearrangearray {
    void rearrangeArray(int[]arr){
        int n = arr.length;
        int [] ans = new int[n];
        int posIndex = 0;
        int negIndex = 1;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                ans[negIndex] = arr[i];
                negIndex += 2;
            }
            else {
                ans[posIndex] = arr[i];
                posIndex += 2;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        rearrangearray obj = new rearrangearray();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.rearrangeArray(arr);
    }
}
