package Array7.Hard;

import java.util.HashMap;
import java.util.Scanner;

import Array7.twosum;

public class maxlength {
    int maxLength(int[]arr,int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        int max =0 ;
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                max = i+1;
            }else {
                if(map.get(sum)!= null){
                    max = Math.max(max, i-map.get(sum));
                }else{
                    map.put(sum, i);
                }
            }
        }
        return max;
    }
     public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        maxlength obj = new maxlength();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(obj.maxLength(arr,n));
         
    }
}
