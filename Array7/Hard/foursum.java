package Array7.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class foursum {
        public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j !=(i+1) && nums[j]==nums[j-1]) continue;
                int k = j+1;
                int l = n-1;
                while(k<l){
                    long sum = nums[i];
                    sum += nums[j];
                    sum+= nums[k];
                    sum+= nums[l];
                    if(sum==target){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.addAll(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        ans.add(temp);
                        k++;l--;
                        while(k<l && nums[k] == nums[k-1]) k++;
                        while(k<l && nums[l]==nums[l+1]) l--;
                    }else if(sum<target){
                        k++;
                    }else{
                        l--;
                    }

                }
            }
        }
        return ans;
    }
      public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        foursum obj = new foursum();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        List<List<Integer>> finalans = obj.fourSum(arr,k);   
        for(List<Integer> x : finalans){
            System.out.println(x);
        }
        sc.close();    
    }
}
