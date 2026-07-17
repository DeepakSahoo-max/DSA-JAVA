package Array7;

import java.util.Scanner;

public class arr_sort {
    boolean sortCheck(int []arr,int n){
        for(int i=1;i<n;i++){
            if(arr[i]>=arr[i-1]){

            }else{
                return false;
            }
        }
        return true;
    }
     public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        arr_sort obj = new arr_sort();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(obj.sortCheck(arr,n));
         
    }
}
