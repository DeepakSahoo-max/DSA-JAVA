public class while_loop {
     public int whileLoop(int d) {
        int num =1;int m =1;
        int sum = 0;
         while( m<51){
            if( num>0 && num%10 == d){
                System.out.println(num);
                m++;
                sum += num;
            }
             num++;
             }
             return sum;

        }
        
    public static void main(String[] args) {
        while_loop obj = new while_loop();
       System.out.println( obj.whileLoop(1));
    }
}
