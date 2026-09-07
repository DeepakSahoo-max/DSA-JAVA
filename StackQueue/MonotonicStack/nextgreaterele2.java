package StackQueue.MonotonicStack;

public class nextgreaterele2 {
    import java.util.*;

class Solution {

    // public int[] nextGreaterElements(int[] nums) {

    //     int n = nums.length;
    //     int[] nge = new int[n];

    //     // For every element
    //     for (int i = 0; i < n; i++) {

    //         // Initially, assume no greater element
    //         nge[i] = -1;

    //         // Check next n-1 elements circularly
    //         for (int j = i + 1; j < i + n; j++) {

    //             int index = j % n;

    //             // Found the first greater element
    //             if (nums[index] > nums[i]) {
    //                 nge[i] = nums[index];
    //                 break;
    //             }
    //         }
    //     }

    //     return nge;
    // }

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int [] nge = new int[n];

        Stack<Integer> st  = new Stack<>();

        for(int i=2*n-1;i>=0;i--){
            int index = i%n;
            while(!st.isEmpty() && st.peek()<=nums[index]){
                st.pop();
            }
            if(i<n){
                nge[index] = st.isEmpty() ? -1 : st.peek();
            }
            st.push(nums[index]);
        }
        return nge;
    }

    public static void main(String[] args) {

        int[] nums = {2, 10, 12, 1, 11};

        Solution obj = new Solution();

        int[] result = obj.nextGreaterElements(nums);

        System.out.println(Arrays.toString(result));
    }
}
}
