import java.net.Socket;

public class pattern1 {
    public void pattern1(int n ){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }    
    public void pattern2(int n ){

        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public void pattern3(int n ){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public void pattern4(int n ){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
    public void pattern5(int n ){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public void pattern6(int n ){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public void pattern7(int n ){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" ");
            }
             for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
             for(int j=1;j<=n-i+1;j++){
                System.out.print(" ");
            }

            System.out.println("");
        }
    }
    public void pattern8(int n ){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
             for(int j=1;j<=2*n-(2*i+1);j++){
                System.out.print("*");
            }
             for(int j=0;j<=i;j++){
                System.out.print(" ");
            }

            System.out.println("");
        }
    }
    public void pattern9(int n ){
        for(int i=1;i<=2*n-1;i++){
            int stars = i;
            if (i>n) stars= 2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public void pattern11(int n ){
        int start=1;
        for(int i=0;i<=n;i++){
            if(i%2==0)
                start=1;
            else 
                start=0;
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println("");
        }
    }
    public void pattern12(int n){
     
        int space=2*n-2;
        for(int i=1;i<=n;i++){
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }

            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            space=space-2;
            System.out.println("");
    }
}
    public void pattern13(int n ){
        int num =1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num=num +1;
            }
            
            System.out.println("");
        }
    }  
    public void pattern14(int n ){
        
        for(int i=0;i<=n;i++){
            for(char j='A';j<='A'+i;j++){
                System.out.print(j);
            
            }
            
            System.out.println("");
        }
    }  
    public void pattern15(int n ){
        
        for(int i=0;i<=n;i++){
            for(char j='A';j<='A'+n-i;j++){
                System.out.print(j);
            
            }
            
            System.out.println("");
        }
    }
    public void pattern16(int n ){
        char le ='A';
        for(int i=0;i<=n;i++){
            for(char j=0;j<=i;j++){
                System.out.print(le);
            }
            le += 1;
            System.out.println("");
        }
    }
    public void pattern17(int n ){
        for(int i=0;i<=n;i++){
            char le = 'A';
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" ");
            }
            
             for(int j=1;j<=2*i+1;j++){
                System.out.print(le);
                if(j<=i)
                    le++;
                 else 
                    le--;
                
            }
             for(int j=1;j<=n-i+1;j++){
                System.out.print(" ");
            }

            System.out.println("");
        }
    }
    public void pattern18(int n ){
        for(int i=0;i<=n;i++){
          for (char le = (char)('E'-i);le <='E';le++){
            System.out.print(le);
          }
            
            System.out.println(" ");
        }
    } 
    public void pattern19(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<=2*i-1;j++){
                System.out.print("6");
            }
            for(int j=0;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int space=2*n-1;
        for(int i=0;i<=n;i++){
            
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<=space;j++){
                System.out.print("6");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            space -=2;
            System.out.println();
        }
    }
    public void pattern20(int n) {
        int spaces=2*n-2;
    for(int i = 1; i <= 2*n - 1; i++) {

        int stars;


        if(i < n)
            stars = i + 1;
        else
            stars = 2*n - i - 1;

        for(int j = 1; j <= stars; j++) {
            System.out.print("*");
        }
        
        for(int j=1;j<=spaces;j++){
            System.out.print("7");
        }
        
        System.out.println();
        if(i<n) spaces -= 2;
        else spaces += 2;
    }

}
    public static void main(String[] args) {
        pattern1 obj = new pattern1();
        obj.pattern20(5);
    }
}