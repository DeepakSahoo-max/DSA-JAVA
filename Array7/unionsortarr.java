package Array7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class unionsortarr {
        // void unionSortedarr(int []arr1,int []arr2){
        //     HashSet <Integer> uniarr = new HashSet<>();
        //     for(int i=0;i<arr1.length;i++){
        //         uniarr.add(arr1[i]);
        //     }
        //      for(int i=0;i<arr2.length;i++){
        //         uniarr.add(arr2[i]);
        //     }
        //     for(int num: uniarr){
        //     System.out.print(num+" ");
        //     }
        // }
        //optimal
        void unionSortedarr(int []arr1,int[]arr2,int n1,int n2){
            int i=0;
            int j=0;
            ArrayList <Integer> uniarr = new ArrayList<>();
            while(i<n1 && j<n2 ){
                if(arr1[i]<=arr2[j]){
                    if(uniarr.size()==0 || !uniarr.contains(arr1[i])){
                        uniarr.add(arr1[i]);
                    }
                    i++;
                }
                else{
                    if(uniarr.size()==0 || !uniarr.contains(arr2[j])){
                        uniarr.add(arr2[j]);
                    }
                    j++;
                }
            }
            while (j<n2) {
                 if(uniarr.size()==0 || !uniarr.contains(arr2[j])){
                        uniarr.add(arr2[j]);
                    }
                    j++;
            }
            while (i<n1) {
                 if(uniarr.size()==0 || !uniarr.contains(arr1[i])){
                        uniarr.add(arr1[i]);
                    }
                    i++;
            }
           for(int num: uniarr){
            System.out.print(num+" ");
           }
        }

        public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        unionsortarr obj = new unionsortarr();
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
        obj.unionSortedarr(arr1, arr2, n1, n2);
    }
}
