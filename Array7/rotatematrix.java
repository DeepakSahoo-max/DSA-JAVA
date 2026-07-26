package Array7;

import java.util.Scanner;

public class rotatematrix {
    int[] reverse(int[]row,int start,int end){
        while (start<end) {
            int temp = row[start];
            row[start]= row[end];
            row[end]=temp;
            start++;
            end--;
        }
        return row;

    }
    int[][] rotateMatrix(int [][]matrix) {
        int n = matrix.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp= matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;
            }
        }
        for(int i=0;i<n;i++){
            int start=0;
            int end = n-1;
            reverse(matrix[i], start, end);
        }
        return matrix;
    }
    public static void main (String[]args){
        rotatematrix obj = new rotatematrix();
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

        obj.rotateMatrix(matrix);
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

 
    }
}
