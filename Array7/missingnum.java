package Array7;

import java.util.Scanner;

public class missingnum {
    // Brute method

    //  int  missingNum(int[]arr,int n){
    //     for(int i=1;i<=n;i++){
    //         int flag=0;
    //         for(int j=0;j<n-1;j++){
    //             if(arr[j]==i){
    //                 flag=1;
    //                 break;
    //             }
    //         }
    //         if(flag==0){
    //                 return i;
    //             }
    //     }
    //     return -1;
    //  }

    // Better method

    // int missingNum(int []arr,int n){
    //     int [] hash =  new  int[n+1];
    //     for(int i=0;i<n-1;i++){
    //         hash[arr[i]]=1;
    //     }
    //     for(int i=1;i<=n;i++){
    //         if(hash[i]==0) return i;
    //     }
    //     return -1;
    // }

    // Optimal1
    // int missingNum(int []arr,int n){
    //     int sum = (n*(n+1))/2;
    //     int s2=0;
    //     for(int i=0;i<n;i++){
    //       s2 += arr[i];   
    //     }
    //     return sum-s2;
    // }

    // Optimal2  XOR
    int missingNum(int []arr,int n){
       int XOR1 =0;
       int XOR2 = 0;
      for(int i=0;i<n-1;i++){
          XOR2 = XOR2^arr[i];
          XOR1 = XOR1^(i+1);
      }
      XOR1^=n;
      return XOR1^XOR2;

    }
     public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        missingnum obj = new missingnum();
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(obj.missingNum(arr, n));
         
    }
}
