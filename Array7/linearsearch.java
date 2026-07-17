package Array7;

import java.util.Scanner;

public class linearsearch {
    int linearSearch(int[]arr,int n,int num){
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                return i;
                    }
        }
        return -1;
    }
     public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        linearsearch obj = new linearsearch();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int num = sc.nextInt();
        System.out.println(obj.linearSearch(arr, n, num));
         
    }
}
