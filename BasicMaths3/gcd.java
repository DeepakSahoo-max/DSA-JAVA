package BasicMaths3;


public class gcd {
    // public int GCD(int n1,int n2){
    //     int gcdno = 1;
    //     for(int i =1;i<=Math.min(n1,n2);i++)
    //         {
    //         if(n1%i==0 && n2%i==0)
    //             gcdno = i;
    //     }
    //     return gcdno;
    //  }
    //  public int GCD(int n1,int n2){
    //     int gcdno = 1;
    //     for(int i =Math.min(n1,n2);i>=1;i--)
    //         {
    //         if(n1%i==0 && n2%i==0){
    //             gcdno = i;
    //             break;
    //         }
    //     }
    //     return gcdno;
    //  }
     public int GCD(int n1,int n2){
        int gcd=1;
        while(n1>0 && n2>0){
            if(n1>n2){
                n1=n1%n2;
            }else{
                n2=n2%n1;
            }
        }
        if(n1==0){
           return n2;
        }else{
            return n1;
        }
     }
     

    public static void main(String[] args) {
        gcd obj = new gcd();
        System.out.println(obj.GCD(6,9));
    } 
}
