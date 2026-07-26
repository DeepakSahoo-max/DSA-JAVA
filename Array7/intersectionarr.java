package Array7;

import java.util.ArrayList;
import java.util.Scanner;

public class intersectionarr {
    // Brute method
    // void  interSectionarr(int[]arr1,int[]arr2,int n1,int n2){
    //     ArrayList <Integer> interarr = new ArrayList<>();
    //     int [] vis = new int[n2];
    //     for(int i=0;i<n1;i++){
    //         for(int j=0;j<n2;j++){
    //             if(arr1[i]==arr2[j] && vis[j]==0){
    //                 interarr.add(arr1[i]);
    //                 vis[j]=1;
    //             }
    //             if(arr2[j]>arr1[i]) break;
    //         }
    //     }
    //     for(int num:interarr){
    //         System.out.print(num+" ");
    //     }
    // }
    // Optimal approach
    void  interSectionarr(int[]arr1,int []arr2,int n1,int n2){
        int i=0;
        int j=0;
        ArrayList <Integer> interarr = new ArrayList<>();
        while (i<n1 && j<n2) {
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }else{
                interarr.add(arr1[i]);
                i++;
                j++;
            }
        }
        for(int num: interarr){
            System.out.print(num+" ");
        }
    }
      public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        intersectionarr obj = new intersectionarr();
        int n1 = sc.nextInt();
        int []arr1 = new int [n1];
        for(int i =0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        int n2 = sc.nextInt();
        int []arr2 = new int [n1];
        for(int i =0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        obj.interSectionarr(arr1, arr2, n1, n2);
    }

}
