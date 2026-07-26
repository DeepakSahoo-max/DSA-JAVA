package Array7;

import java.util.Scanner;

public class setzeros {
    // Better Approach
    // int[][] setZeros(int[][]matrix,int m,int n){
    //     int []row = new int[m];
    //     int []col = new int[n];
    //      for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             if(matrix[i][j]==0){
    //                 row[i]=1;
    //                 col[j]=1;
    //             }
    //         }
    //      }
    //      for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             if(row[i]==1 || col[j]==1 ){
    //                 matrix[i][j]=0;
    //             }
    //         }
    //      }
    //      return matrix;

    // }

    // Optimal approach
    int[][] setZeros(int[][]matrix,int m,int n){
        int col0=-1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;

                    if(j!=0){
                        matrix[0][j]=0;
                    }else{
                         col0=0;
                    }
                }

            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]!=0){
                    if(matrix[0][j] ==0 || matrix[i][0]==0){
                        matrix[i][j]=0;
                    }
                }
            }
        }
        if(matrix[0][0]==0){
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }
        if(col0==0){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
        return matrix;
    }

    public static void main (String[]args){
        setzeros obj = new setzeros();
        Scanner sc = new Scanner(System.in);
        System.out.println("rows:");
        int m = sc.nextInt();
        System.out.println("col:");
        int n = sc.nextInt();
        int [][] matrix = new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        obj.setZeros(matrix, m, n);
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

 
    }
}
