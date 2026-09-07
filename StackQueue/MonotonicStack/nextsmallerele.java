package StackQueue.MonotonicStack;
import java.util.*;
public class nextsmallerele {
    // public int[] nextsmallerele(int[]arr,int n){
    //     int [] ans = new int[n];
    //     Arrays.fill(ans, -1);
    //     for(int i=0;i<n;i++){
    //         int curr = arr[i];
    //         for(int j=i+1;j<n;j++){
    //             if(arr[j]<curr){
    //                 ans[i] = arr[j];
    //                 break;
    //             }
    //         }
    //     }
    //     return ans;
    // }

    public int[] nextsmallerele(int[]arr,int n){
        Stack<Integer> st = new Stack<>();

        int []ans = new int[n];
        Arrays.fill(ans,-1);
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=arr[i] ){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[]args){
        nextsmallerele obj = new nextsmallerele();
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int [] ans  = obj.nextsmallerele(arr, n);
         System.out.print("The next smaller elements are: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }

    }
}
