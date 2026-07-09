package BasicMaths3;

public class palindrome_num {
    public boolean isPalindrome(int n){
         int rev = 0;
        int dp = n;
        while (n>0) {
            int ld = n%10;
            rev = (rev*10)+ld;
            n = n/10;
        }
        if (rev==dp) 
            return true;
        else return false;
    }
    public static void main(String[] args) {
        palindrome_num obj = new palindrome_num();
        System.out.println(obj.isPalindrome(121));
    }
}