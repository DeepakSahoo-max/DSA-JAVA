package Array7;

import java.util.Scanner;

public class stockBuySell {
     int stockbuySell (int[]arr){
        int mini = arr[0];
        int profit = 0;
        for(int i=1;i<arr.length;i++){
            int cost = arr[i] - mini;
            profit = Math.max(profit, cost);
            mini = Math.min(mini, arr[i]);

        }
        return profit;
     }
     public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        stockBuySell obj = new stockBuySell();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(obj.stockbuySell(arr));
    }
}
