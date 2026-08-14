package BinarySearch.Binary2D;

import java.util.Arrays;
import java.util.Scanner;

public class findpages {
    int countStudents(int[]arr,int pages){
        int students =1;
        int pageStudent =0;
        for(int i=0;i<arr.length;i++){
            if(pageStudent  + arr[i] <= pages){
                pageStudent += arr[i];
            }else {
                students++;
                pageStudent = arr[i];
            }
        }
        return students;
    }
    int maxelement (int[]weights){
        int max = Integer.MIN_VALUE;
        for(int x:weights) max = Math.max(max,x);
        return max;
    }

    int sum(int[]weights){
        int sum =0;
        for(int x:weights) sum += x;
        return sum;
    }
    int findPages(int[]arr,int n,int m){
        if(m>n) return -1;
        int low = maxelement(arr);
        int high = sum(arr);
        while(low<=high){
            int mid = (low+high)/2;
            int students = countStudents(arr, mid);
            if(students>m){
                low = mid+1;
            }else high = mid-1;
        }
        return low;
    }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        findpages obj = new findpages();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int h = sc.nextInt();
        System.out.println(obj.findPages(arr, n, h));
    }
}

// It works for allocation of books , splitarrays largest sum , painters partition   