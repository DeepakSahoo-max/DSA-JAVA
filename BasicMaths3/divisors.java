package BasicMaths3;
import java.util.*;

public class divisors {
    // public List<Integer> divisors(int n){
    //     List <Integer> numbers = new ArrayList<>();

    //     for (int i=1;i<=n;i++){
    //         if(n%i==0)
    //             numbers.add(i);
    //             }       
    //     return numbers;
    //  }
       public int[] divisors_1(int n){
        List <Integer> numbers = new ArrayList<>();

        for (int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
               numbers.add(i);
               if((n/i) != i)
                numbers.add(n/i); 
            }
                
                }       
        int [] num = new int[numbers.size()];

        for(int i=0;i<numbers.size();i++){
            num[i]= numbers.get(i);
        }
        Arrays.sort(num);
        return num;
     }
    
    public static void main(String[] args) {
        divisors obj = new divisors();
        System.out.println(Arrays.toString(obj.divisors_1(6)));
    }

}
