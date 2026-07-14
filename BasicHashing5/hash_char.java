package BasicHashing5;

import java.util.Scanner;

public class hash_char {
 public  static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string:");
    String str = sc.next();
    
    int [] hash = new int[256];
    for (int i=0;i<str.length();i++){
        hash[str.charAt(i)]++ ;
    }
    System.out.println("enter the no. of chars");
    int n  = sc.nextInt();
    System.out.println("enter the chars");
    while(n-->0){
       char c = sc.next().charAt(0);
       System.out.println(hash[c]);
    }
 }
}
