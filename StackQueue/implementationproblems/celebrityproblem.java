package StackQueue.implementationproblems;

public class celebrityproblem {
    // public int celebrity(int[][] M){
    //     int n = M.length;
    //     int[] knowMe = new int[n];
    //     int[] Iknow = new int[n];
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<n; j++){
    //             if(M[i][j] == 1){
    //                 knowMe[j]++;
    //                 Iknow[i]++;
    //             }
    //         }
    //     }
    //     for(int i=0;i<n;i++){
    //         if(knowMe[i] == n-1 && Iknow[i] == 0){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    public int celebrity(int[][]M){
        int top = 0;
        int down = M.length-1;
        while (top<down) {
            if(M[top][down]==1){
                top = top+1;
            }else if(M[down][top]==1){
                down = down-1;
            }
            else{
                top = top+1;
                down = down-1;
            }
        }
        int candidate = top;

        for(int i=0;i<M.length;i++){
            if(i==candidate){
                continue;
            }
            if(M[candidate][i]==1 || M[i][candidate]==0){
                return  -1;
            }
        }
        return  candidate;
    }

     public static void main(String[] args) {
        // Matrix representing who knows whom
        int[][] M = {
            {0, 1, 1, 0}, 
            {0, 0, 0, 0}, 
            {1, 1, 0, 0}, 
            {0, 1, 1, 0}
        };
        
        // Create an instance of Solution class
        celebrityproblem sol = new celebrityproblem(); 
        
        // Call function to find the index of celebrity
        int ans = sol.celebrity(M);
        
        // Print the result (index of the celebrity)
        System.out.println("The index of the celebrity is: " + ans);
    }
}
