package Array7;

import java.util.Scanner;

public class consecutiveone {
    int consecutiveOnes(int[]arr,int n){
        int max = 0;
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                max = Math.max(max,count);
            }else{
                count =0;
            }
        }
        return max;
    }
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        consecutiveone obj = new consecutiveone();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(obj.consecutiveOnes(arr, n));
         
    }
}
