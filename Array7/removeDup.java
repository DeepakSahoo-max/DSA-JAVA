package Array7;

import java.util.HashSet;
import java.util.Scanner;

public class removeDup {
    //bruteforce
    //  public int  removeduplicate(int[]arr,int n){
    //      HashSet<Integer> set = new HashSet<>();
    //      for(int i=0;i<n;i++){
    //         set.add(arr[i]);
    //      }
    //      int index =0;
    //      for(int num: set){
    //         arr[index]=num;
    //         index++;
    //      }
    //     return index;
    // }

    //optimal
    public int removeduplicate(int[]arr,int n){
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[j] != arr[i]){
                arr[i+1]= arr[j];
                i++;
            }            
        }
        return i+1;
    }
     public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        removeDup obj = new removeDup();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int size = obj.removeduplicate(arr, n);
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        sc.close();
         
    }
}
