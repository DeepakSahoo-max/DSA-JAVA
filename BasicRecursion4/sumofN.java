package BasicRecursion4;
import java.util.*;

public class sumofN {
    public void sum_Numbers(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sum_Numbers(i-1,sum+i);
    }
    public static void main (String[]args){
        sumofN obj = new sumofN();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int sum = 0;
        obj.sum_Numbers(i, sum);

    }
}
