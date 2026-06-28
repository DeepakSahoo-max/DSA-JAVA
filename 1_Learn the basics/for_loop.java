class for_loop {
    public int forLoop(int low, int high) {
        // Your code goes here
        int sum = 0;
        for(int i = low;i<= high;i++){
            sum += i;
        };
        System.out.println(sum);
    return sum;   
    }
    public static void main(String[] args) {
         for_loop object = new for_loop();
         object.forLoop(1,5);
    }

}
