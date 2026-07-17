package Array7;

import java.util.Scanner;

public class largest_num {
    //optimal approach
    int largestnum(int []arr,int n){
        int largest = arr[0];
        for (int i=0;i<n;i++){
            if(arr[i]> largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        largest_num obj = new largest_num();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(obj.largestnum(arr,n));
    }
}
