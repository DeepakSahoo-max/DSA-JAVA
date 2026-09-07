package StackQueue.MonotonicStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class asteroidcollision {
    int[] asteroidCollision (int[]arr){
        int n = arr.length;
        List<Integer> st = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                st.add(arr[i]);
            }else{
                while((!st.isEmpty() && st.get(st.size()-1)>0) && st.get(st.size()-1) < Math.abs(arr[i])){
                    st.remove(st.size()-1);
                }

                if(!st.isEmpty() && st.get(st.size()-1) == Math.abs(arr[i])){
                    st.remove(st.size()-1);
                }
                else if(st.isEmpty() || st.get(st.size()-1)<0){
                    st.add(arr[i]);
                }
            }
        }
        int[]result = new int[st.size()];
        for(int i=0;i<st.size();i++){
            result[i]=st.get(i);
        }
        return result;
    }
    public static void main(String[]args){
        asteroidcollision obj = new asteroidcollision();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =  sc.nextInt();
         }
        int []ans = obj.asteroidCollision(arr);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
