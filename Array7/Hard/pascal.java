package Array7.Hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascal {
    long nCr(long n, long r) {
        long res = 1;
        for (long i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    List<List<Integer>> pascalTriangle(int N) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            int ans = 1;
            ArrayList<Integer> ansrow = new ArrayList<>();
            ansrow.add(ans);
            for (int j = 1; j < i; j++) {
                ans = ans * (i - j);
                ans = ans / j;
                ansrow.add(ans);
            }
            triangle.add(ansrow);
        }
        return triangle;
    }

    public static void main(String[] args) {
        pascal obj = new pascal();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        obj.pascalTriangle(n);
        List<List<Integer>> triangle = obj.pascalTriangle(n);

        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
