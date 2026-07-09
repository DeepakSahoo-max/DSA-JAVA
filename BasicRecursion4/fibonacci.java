package BasicRecursion4;

import java.util.Scanner;

public class fibonacci {
    public int  fibonacci_num(int n ){
        if(n<=1)
            return n;
        int ls = fibonacci_num(n-1);
        int sls = fibonacci_num(n-2);
        return ls + sls;
    }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    fibonacci obj = new fibonacci();
    int n = sc.nextInt();
    int [] arr = new int[n] ;
    for(int i =0;i<n;i++){
      arr[i]=obj.fibonacci_num(i);
    }
    for(int num : arr){
    System.out.println(num);
    }
    
 }   
}
