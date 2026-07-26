package Array7;

import java.util.ArrayList;
import java.util.Scanner;

public class spiralorder {
    void spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right = m - 1;
        int top = 0;
        int bottom = n - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }

        }
        for(int num:ans){
            System.out.print(num+" ");
        }

    }

    public static void main(String[] args) {
        spiralorder obj = new spiralorder();
        Scanner sc = new Scanner(System.in);
        System.out.println("rows:");
        int m = sc.nextInt();
        System.out.println("col:");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        obj.spiralOrder(matrix);

    }
}
