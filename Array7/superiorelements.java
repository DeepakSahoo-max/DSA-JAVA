package Array7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class superiorelements {
      void superiorElements(int []arr,int n){
        int max = Integer.MIN_VALUE;
        ArrayList <Integer> ans = new ArrayList<>();
        for(int i=n-1; i>=0;i--){
            if(arr[i]>max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        // Collections.sort(ans);
        for(int i=ans.size()-1;i>=0;i--){
            System.out.print(ans.get(i)+" ");
        }
      }
      public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        superiorelements obj = new superiorelements();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.superiorElements(arr,n);
    }
}
