package StackQueue.MonotonicStack;

import java.util.Stack;

public class largestrectangle {
     public int largestRectangle(int[] heights) {
        int n = heights.length;
        Stack <Integer> st = new Stack<>();

        int maxarea = 0;

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                int element = st.peek();
                st.pop();

                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();

                int area = heights[element] * (nse-pse-1);
                maxarea = Math.max(area,maxarea);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int element = st.peek();
            st.pop();

            int nse = n;
            int pse = st.isEmpty() ? -1 : st.peek();
            
            int area = heights[element] * (nse-pse-1);
            maxarea = Math.max(area,maxarea);
        }
        return maxarea;
    }
    // public int largestRectangle(int[]arr){
    //     int n = arr.length;
    //     int [] pse = findPSE(arr);
    //     int [] nse = findNSE(arr);

    //     int maxarea = 0;  
    //     for(int i=0;i<n;i++){
    //         int width = nse[i]-pse[i]-1;
    //         int area = arr[i] * width;
    //         maxarea = Math.max(maxarea, area);
    //     }
    //     return maxarea;
    // }

    // int [] findNSE(int []arr){
    //     int n = arr.length;

    //     int [] nse = new int[n];

    //     Stack<Integer>  st= new Stack<>();
    //     for(int i=n-1;i>=0;i--){
    //         while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
    //             st.pop();
    //         }
    //         if(st.isEmpty()){
    //             nse[i] = -1;
    //         }else{
    //             nse[i] = st.peek();
    //         }
    //         st.push(i);
    //     }
    //     return nse;
    // }

    // int [] findPSE(int []arr){
    //     int n = arr.length;

    //     int [] pse = new int[n];

    //     Stack<Integer>  st= new Stack<>();
    //     for(int i=0;i<n;i++){
    //         while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
    //             st.pop();
    //         }
    //         if(st.isEmpty()){
    //             pse[i] = -1;
    //         }else{
    //             pse[i] = st.peek();
    //         }
    //         st.push(i);
    //     }
    //     return pse;
    // }

     public static void main(String[] args) {

        int[] arr = {2, 1, 5, 6, 2, 3};

        largestrectangle obj = new largestrectangle();

        int result = obj.largestRectangle(arr);

        System.out.println("Largest Rectangle Area = " + result);
    }
}
