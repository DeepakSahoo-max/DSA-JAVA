package Array7.Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import Array7.majorityelement;

public class majorityElement2 {
    // Brute Force
    // List<Integer> majorityelement2(int[]arr){
    //     ArrayList<Integer> ans = new ArrayList<>();
    // for(int i=0;i<arr.length;i++){
    //       if(ans.size()==0 || ans.get(0) != arr[i] ){
    //         int count=0;
    //         for(int j=0;j<arr.length;j++){
    //             if(arr[j]==arr[i]){
    //                 count++;
    //             }
    //         }
    //         if(count>arr.length/3){
    //             ans.add(arr[i]);
    //         }
    //       }
    // }
    // return ans;
    // }

    // Better 
    // ArrayList<Integer> majorityelement2(int[]arr){
    //     int min = arr.length/3 +1;
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     HashMap <Integer,Integer> map = new HashMap<>();

    //     for(int i=0;i<arr.length;i++){
    //          map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
    //          if(map.get(arr[i]) == min){
    //             ans.add(arr[i]);
    //          }
    //     }
    //     return ans;
    // }
    // Optimal
    ArrayList<Integer> majorityelement2(int[]arr){
        int count1=0;
        int count2=0;
        int ele1 = Integer.MAX_VALUE;
        int ele2 = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(count1 == 0 && arr[i]!=ele2){
                count1=1;
                ele1 = arr[i];
            }
            else if (count2==0 && arr[i]!=ele1){
                count2 = 2;
                ele2 =arr[i];
            }
            else if(arr[i]==ele1) count1++;
            else if (arr[i]==ele2) count2++;
            else {
                count1--;
                count2--;
            }
        }
        ArrayList <Integer> ans = new ArrayList<>();
        count1=0;count2=0;
        for(int i=0;i<arr.length;i++){
            if(ele1==arr[i]) count1++;
            if(ele2==arr[i]) count2++;
        } 
        int mini = (int) (arr.length/3) +1;
        if(count1>=mini) ans.add(ele1);
        if(count2>=mini) ans.add(ele2);
        return ans;
    }

    

     public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        majorityElement2 obj = new majorityElement2();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       List<Integer>answer= obj.majorityelement2(arr);
        for(int num:answer){
            System.out.print(num+" ");
        }
    }
}
