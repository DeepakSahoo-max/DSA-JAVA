package Array7.Hard;

import java.util.HashMap;
import java.util.Scanner;

import Array7.twosum;

public class subarraywithxork {
    int subarraywithXor(int []arr,int k){
        int xr=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;
        map.put(0,map.getOrDefault(0, 0)+1);
        for(int i=0;i<arr.length;i++){
            xr = xr ^ arr[i];
            int x = xr ^ k;
            count += map.getOrDefault(x,0);
            map.put(xr, map.getOrDefault(xr, 0)+1);
        }
        return count;    
    }
     public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        subarraywithxork obj = new subarraywithxork();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(obj.subarraywithXor(arr,k));
         
    }
}
