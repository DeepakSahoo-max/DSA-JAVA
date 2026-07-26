package Array7;

import java.util.HashMap;
import java.util.Scanner;

public class majorityelement {
    // Hashing 
//     int majorityElement(int[]arr,int n){
//     HashMap <Integer,Integer> map = new HashMap<>();
//     for(int i=0;i<n;i++){
//         map.put(arr[i],map.getOrDefault(arr[i],0 )+1);
//       }
//     for(Integer key : map.keySet()){
//         if(map.get(key)>n/2){
//             return key;
//         }
//     }
//     return -1;
//    }
//   Moore's Voting
    int majorityElement(int[]arr){
      int count =0;
      int ele=0;
      for(int i=0;i<arr.length;i++){
        if(count==0){
            count=1;
            ele = arr[i];
        }else if (arr[i]== ele) count++;
         else count--;
      }
      int count1=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]== ele){
            count1++;
        }
      }
      if(count1>arr.length/2){
        return ele;
      }
      return -1;
    }
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        majorityelement obj = new majorityelement();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(obj.majorityElement(arr));
    }
}
