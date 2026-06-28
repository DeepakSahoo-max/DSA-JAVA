import java.util.Arrays;

public class pass_ref {
     public void reverse(int[] arr) {
     int left = 0;
        int right =arr.length-1;

        while(left<right){
            int temp = arr[left];
             arr[left] = arr[right];
             arr[right] = temp;

            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        pass_ref obj = new pass_ref();
        int[] arr = {1,2,3,4,5};
        obj.reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
