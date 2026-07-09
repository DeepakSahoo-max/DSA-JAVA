package BasicMaths3;

public class armstrong_num {
    public boolean isArmstrong(int n ){
        int num = n;
        int an = 0;
        int count =0;
        int temp = n;
        while (temp>0) {
            count++;
            temp /= 10;
        }
        while(n>0){
            int ld = n%10;
            an =(int) ( an +  Math.pow(ld,count));
            n = n/10;
        } return an == num;
    }
    public static void main(String[] args) {
        armstrong_num obj = new armstrong_num();
        System.out.println(obj.isArmstrong(370));
    }
}
