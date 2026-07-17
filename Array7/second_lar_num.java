package Array7;

import java.util.Scanner;

public class second_lar_num {
    int secondLargest(int[]arr,int n){
        int largest = arr[0];
        int slargest =-1;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            }
            else if (arr[i]<largest &&  arr[i]>slargest){
                slargest= arr[i];
            }
        }
        return slargest;
    }
    int secondSmallest(int[]arr, int n){
        int smallest = arr[0];
        int ssmallest = -1;
        for(int i =0;i<n;i++){
            if(arr[i]<smallest){
                ssmallest=smallest;
                smallest = arr[i];
            }else if (arr[i]>smallest && arr[i]<ssmallest){
               ssmallest = arr[i];
            }
        }
        return ssmallest;
    }
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        second_lar_num obj = new second_lar_num();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(obj.secondLargest(arr,n));
        System.out.println(obj.secondSmallest(arr, n));
    }
}
