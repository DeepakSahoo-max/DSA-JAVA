package Array7;

import java.util.HashMap;
import java.util.Scanner;
    public class singlenumber{
    // int singleNumber(int[] arr,int n) {
    // for(int i=0;i<n;i++){
    //     int num = arr[i];
    //     int count=0;
    //     for(int j=0;j<n;j++){
    //         if(arr[j]==num) count++;
    //     }
    
    //     if(count==1) return num;
    // } 
    // return -1;
    // }
    // HashMap
    // int singleNumber(int[] arr,int n) {
    //    HashMap<Integer,Integer> map = new HashMap<>();
    //    for(int num:arr){
    //     map.put(num,map.getOrDefault(num,0)+1);
    //    }
    //    for(int num:arr){
    //     if(map.get(num)==1){
    //         return num;
    //     }
    //    }
    //    return -1;
    // }
    int singleNumber(int[] arr,int n) {
        int XOR=0;
        for(int num:arr){
            XOR^=num;
        }
        return XOR;
    }
     public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        singlenumber obj = new singlenumber();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(obj.singleNumber(arr, n));
         
    }
}
