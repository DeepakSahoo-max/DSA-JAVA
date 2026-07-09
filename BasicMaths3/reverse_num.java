package BasicMaths3;

public class reverse_num {
    public int reverse_number(int n){
        int rev = 0;
        while (n>0) {
            int ld = n%10;
            rev = (rev*10)+ld;
            n = n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        reverse_num obj = new reverse_num();
        System.out.println(obj.reverse_number(52));
    }
}
