package BasicHashing5;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class hash_num_map {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        //pre-compute
        HashMap<Integer,Integer> map  = new HashMap<>();
        for(int i =0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for( var entry : map.entrySet()){
          System.out.println(entry.getKey()+"-> "+entry.getValue());
        }
        int max=0;
        int element=-1;
        for(int i=0;i<n;i++){
          int m = map.getOrDefault(arr[i],0 );
            if(m>max){
                max=m;
                element = arr[i];
            }
        }
         System.out.println("most frequent:"+ element+"frequency: "+max);
        int q = sc.nextInt();
        while(q-->0){
            int num = sc.nextInt();
            //fetch
            System.out.println(map.get(num));
            
        }
    }
}
