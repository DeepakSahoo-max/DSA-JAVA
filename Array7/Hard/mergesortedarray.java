package Array7.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class mergesortedarray {
    // List<Integer> mergeSortedarray(int[]arr1,int[]arr2,int n ,int m){
    // List<Integer> arr3 = new ArrayList<>();
    // int left = 0;
    // int right = 0;
    // int index =0;
    // while (left<n && right<m) {
    // if(arr1[left] <= arr2[right]){
    // arr3.add(arr1[left]);
    // left++;
    // index++;
    // }else {
    // arr3.add(arr2[right]);
    // index++;right++;
    // }
    // }
    // while(left<n){
    // arr3.add(arr1[left]);
    // left++;index++;
    // }
    // while (right<m) {
    // arr3.add(arr2[right]);
    // right++;index++;
    // }
    // return arr3;
    // }

    // Better
    // List<Integer> mergeSortedarray(int[]arr1,int[]arr2,int n ,int m){
    // int left = n-1;
    // int right =0;
    // while (left>=0 && right<m) {
    // if(arr1[left]>arr2[right]){
    // int temp = arr1[left];
    // arr1[left] = arr2[right];
    // arr2[right] = temp;
    // left--;right++;
    // }else {
    // break ;
    // }
    // }
    // Arrays.sort(arr1);
    // Arrays.sort(arr2);
    // List<Integer> ans = new ArrayList<>();

    // for (int x : arr1) {
    // ans.add(x);
    // }

    // for (int x : arr2) {
    // ans.add(x);
    // }

    // return ans;
    // }

    // Optimal approach (Shell sorting)
    void swap(int []arr1,int []arr2,int ind1,int ind2){
        if(arr1[ind1]>arr2[ind2]){
            int temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }
    void swap1(int[] arr, int i, int j) {
    if (arr[i] > arr[j]) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
    void mergeOverlapping(int[] arr1, int[] arr2, int n, int m) {
        int len = (n + m);
        int gap = (len / 2) + (len % 2);
        while (gap > 0) {
            int left = 0;
            int right = left + gap;
            while (right < len) {
                if (left < n && right >= n) {
                    swap(arr1,arr2,left,right-n);
                } else if (left >= n) {
                    swap1(arr2,left-n,right-n);
                } else {
                    swap1(arr1,left,right);
                }
                left++;
                right++;
            }
            if(gap==1) break;
            gap = (gap/2) + (gap%2);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mergesortedarray obj = new mergesortedarray();
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        obj.mergeOverlapping(arr1, arr2, n, m); 
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}