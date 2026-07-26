package Array7;

import java.util.Scanner;

public class maxsubarraysum {
    long maxsubarraySum(int[]arr,int n){
        long sum=0;
        long max = Long.MIN_VALUE;
        int start =0;
        int ansstart =-1;
        int ansend =-1;

        for(int i=0;i<n;i++){
            if(sum==0) 
                 {
                   start = i;
                 } 
            sum += arr[i];

            if(sum>max){
                max = sum;
                ansstart = start;
                ansend =i;
            }

            if(sum<0){
                sum = 0;
            }
        }
        System.out.println("Max Subarray:");
        for(int i=ansstart;i<=ansend;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return max;
        
    }
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        maxsubarraysum obj = new maxsubarraysum();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.maxsubarraySum(arr, n);
    }
}
