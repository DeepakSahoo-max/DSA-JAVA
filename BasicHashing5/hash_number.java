package BasicHashing5;

import java.util.Scanner;

public class hash_number {
    public static void main(String[]args){
        hash_number obj = new hash_number();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int n = sc.nextInt();
        System.out.println("enter the numbers:");
        int []arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //precompute 
        int hash[]=new int[26];
        for(int i =0;i<n;i++){
            hash[arr[i]] += 1;
        }

        System.out.println("enter the query array size:");
        int q = sc.nextInt();
        while(q-->0){
            int num = sc.nextInt();
            System.out.println(hash[num]);
        }
    }
}
