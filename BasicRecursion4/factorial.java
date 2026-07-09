package BasicRecursion4;
import java.util.Scanner;

public class factorial {
    public int  factorialofN(int n ){
        if(n==0) 
            return 0;
        return n*factorialofN(n-1);
    }
    public static void main(String[] args) {
        factorial obj =  new factorial();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(obj.factorialofN(n));
    }
}
