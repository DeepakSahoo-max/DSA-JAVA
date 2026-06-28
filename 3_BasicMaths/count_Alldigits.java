package KnowBasicMaths;

/**
 * count_Alldigits
 */
public class count_Alldigits {
    public int count_digit(int n){
        int count=0;
        while(n>0){
           int  ld =n%10;
            count +=1;
            n=n/10;
        }
        return count;
    }
    
    public static void main(String[] args) {
        count_Alldigits obj = new count_Alldigits();
        System.out.println(obj.count_digit(212));
    }
}