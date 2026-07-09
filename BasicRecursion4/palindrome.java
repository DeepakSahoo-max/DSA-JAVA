package BasicRecursion4;
import java.util.*;

public class palindrome {
    public boolean palindrome_che(int i , String str){
        if(i>=str.length()/2) return true;
        if(str.charAt(i) != str.charAt((str.length())-i-1)) return false;
        return palindrome_che(i+1, str);
    }
    public static void main (String[]args){
        palindrome obj = new palindrome();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(obj.palindrome_che(0,str));
    }
}
