package BasicRecursion4;
import java.util.*;
public class print1toN {
    // public void print1toN_num(int i , int n){
    //     if(i>n)
    //         return;
    //     System.out.println(i);
    //     print1toN_num(i+1, n);
    // }

    // public void printNto1(int i , int n){
    //     if(i<1)
    //         return;
    //     System.out.println(i);
    //     printNto1(i-1, n);
    // }
    public void print1toN_back(int i , int n){
        if(i<n)
            return;
        print1toN_back(i-1, n);
        System.out.println(i);
    }
    public void printNto1_back(int i , int n){
        if(i>n)
            return;
        printNto1_back(i+1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        print1toN obj = new print1toN();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int n = sc.nextInt();
        obj.printNto1_back(i,n);
    }
}
