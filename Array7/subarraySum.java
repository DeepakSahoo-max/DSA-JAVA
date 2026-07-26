package Array7;

import java.util.HashMap;
import java.util.Scanner;

public class subarraySum {
    int subarraysum(int[]arr ,int k){
        HashMap <Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int presum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            presum += arr[i];
            int remove = presum - k;
            count += map.getOrDefault(remove,0);
            map.put(presum, map.getOrDefault(presum, 0)+1);

        }
        return count;
    }
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        subarraySum obj = new subarraySum();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k =sc.nextInt();
        System.out.println(obj.subarraysum(arr,k));
    }
}
