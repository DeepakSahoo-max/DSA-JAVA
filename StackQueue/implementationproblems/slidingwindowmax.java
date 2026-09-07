package StackQueue.implementationproblems;

import java.util.*;

public class slidingwindowmax {
    // int[] slidingWindowmax(int[] arr, int k) {
    //     List<Integer> list = new ArrayList<>();
    //     for (int i = 0; i <=arr.length-k; i++) {
    //         int max = arr[i];
    //         for (int j = i; j < i + k ; j++) {
    //             max = Math.max(max, arr[j]);
    //         }
    //         list.add(max);

    //     }
    //     int[] result = new int[list.size()];

    //     for (int i = 0; i < list.size(); i++) {
    //         result[i] = list.get(i);
    //     }
    //     ;
    //     return result;
    // }

    int[] slidingWindowmax(int[]arr,int k){
          List<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=0;i<arr.length;i++){
            if(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty()&& arr[dq.peekLast()]<= arr[i]){
                dq.pollLast();
            }
            dq.add(i);

            if(i>=k-1){
                ans.add(arr[dq.peekFirst()]);
            }
        } 
        int [] result = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i] = ans.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        slidingwindowmax obj = new slidingwindowmax();
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        int[] ans = obj.slidingWindowmax(arr, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
}
