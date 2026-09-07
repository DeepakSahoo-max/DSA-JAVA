package StackQueue.MonotonicStack;
import java.util.*;

public class nextgreaterele {

    // public int[] nextGreaterElement(int[] arr) {

    //     int n = arr.length;
    //     int[] nge = new int[n];

    //     // For every element
    //     for (int i = 0; i < n; i++) {

    //         // Initially, assume no greater element exists
    //         nge[i] = -1;

    //         // Search to the right
    //         for (int j = i + 1; j < n; j++) {

    //             // First greater element
    //             if (arr[j] > arr[i]) {
    //                 nge[i] = arr[j];
    //                 break;
    //             }
    //         }
    //     }

    //     return nge;
    // }

    // Optimal
    public int[] nextGreaterElement(int[] nums) {
        // Stack to store elements
        Stack<Integer> st = new Stack<>();

        // Result array of same size
        int n = nums.length;
        int[] res = new int[n];

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Pop all smaller or equal elements
            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }

            // If stack is empty, no greater element
            if (st.isEmpty()) res[i] = -1;

            // Else top of stack is the answer
            else res[i] = st.peek();

            // Push current element
            st.push(nums[i]);
        }

        // Return the result
        return res;
    }



    public static void main(String[] args) {

        // Input array
        int[] arr = {6, 0, 8, 1, 3};

        // Create object
        nextgreaterele obj = new nextgreaterele();

        // Find Next Greater Elements
        int[] result = obj.nextGreaterElement(arr);

        // Print result
        System.out.println("Next Greater Elements:");

        System.out.println(Arrays.toString(result));
    }
}

