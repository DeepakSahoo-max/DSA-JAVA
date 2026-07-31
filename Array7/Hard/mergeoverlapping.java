package Array7.Hard;
import java.util.List;

 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class mergeoverlapping {
      List<List<Integer>> mergeOverlapping(int[][]arr){
        int n = arr.length;
        Arrays.sort(arr,(a,b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            int start = arr[i][0];
            int end = arr[i][1];
            if(!ans.isEmpty() && end<=ans.get(ans.size()-1).get(1)) continue;

            for(int j=i+1;j<n;j++){
                if(arr[j][0] <= end){
                    end = Math.max(end,arr[j][1]);
                }else{
                    break;
                }
            }
            ans.add(Arrays.asList(start,end));
        }
        for(List<Integer> x : ans){
            System.out.println(x);
        }
        return ans;
        
      }
       public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        mergeoverlapping obj = new mergeoverlapping();
        int n = sc.nextInt();
        int [][]arr = new int [n][2];
        for(int i =0;i<n;i++){
            for(int j=0;j<2;j++){
            arr[i][j]=sc.nextInt();
            }
        }
        obj.mergeOverlapping(arr);
         
    }
}
