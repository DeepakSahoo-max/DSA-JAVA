package Array7;

import java.util.ArrayList;
import java.util.Scanner;

public class movezeros {
    //    void moveZeros(int[]arr,int n){
    //     ArrayList<Integer> temp = new ArrayList<>();
    //     for(int i=0;i<n;i++){
    //         if(arr[i]!=0){
    //             temp.add(arr[i]);
    //         }
    //     }
    //     for(int i=0;i<temp.size();i++){
    //         arr[i]= temp.get(i);
    //     }
    //     int k=temp.size();
    //     for(int i=k;i<n;i++){
    //         arr[i]=0;
    //     }
    //    }

       void moveZeros(int []arr,int n){
        int j = -1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j = i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
       }
       public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        movezeros obj = new movezeros();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.moveZeros(arr, n);
         for(int i =0;i<n;i++){
           System.out.print(arr[i] + " ");
        }
    }
}
