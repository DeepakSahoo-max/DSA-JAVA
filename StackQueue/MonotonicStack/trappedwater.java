package StackQueue.MonotonicStack;

import java.util.ArrayList;

public class trappedwater {
    // public int trappedWater(int [] height){
    //     int  n = height.length;
    //     int total = 0;
    //     int [] max_left = prefix_max(height);
    //      int [] max_right =suffix_max(height);

    //     for(int i=0;i<n;i++){
    //         total += Math.min(max_left[i], max_right[i]) - height[i];
    //     }
    //     return total;
    // }

    // int[] prefix_max(int []height){
    //      int [] leftMax = new int[height.length];
    //      leftMax[0] = height[0];
    //      for(int i=1;i<height.length;i++){
    //         leftMax[i]= Math.max(leftMax[i-1], height[i]);
    //      }
    //      return leftMax;
    // }

    // int[] suffix_max(int []height){
    //      int [] rightmax = new int[height.length];
    //      rightmax[height.length-1] = height[height.length-1];
    //      for(int i=height.length-2;i>=0;i--){
    //         rightmax[i]= Math.max(rightmax[i+1], height[i]);
    //      }
    //      return rightmax;
    // }

    // optimal
    public int trappedWater(int[] height) {
        int leftmax = 0;
        int rightmax = 0;
        int total = 0;

        int l = 0;
        int r = height.length-1;

        while(l<r){
            if(height[l]<=height[r]){
                if(leftmax>height[l]) {
                    total += leftmax - height[l];
                }else{
                    leftmax = height[l];
                }
                l = l+1;
            }else{
                if(rightmax>height[r]){
                    total += rightmax - height[r];
                }else{
                    rightmax = height[r];
                }
                r = r-1;
            }
        }
        return total;
    }
    public static void main(String[]args){
        int [] height = {4,2,0,3,2,5};

        trappedwater obj = new trappedwater();
        int result = obj.trappedWater(height);

        System.out.println(result);
    }
}
