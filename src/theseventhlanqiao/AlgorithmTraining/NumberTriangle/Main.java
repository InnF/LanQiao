package theseventhlanqiao.AlgorithmTraining.NumberTriangle;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        while (in.hasNextInt()) {
            int n = in.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    arr[i][j] = in.nextInt();
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    arr[i - 1][j] += Math.max(arr[i][j], arr[i][j + 1]);
                }
            }
            out.println(arr[0][0]);
            out.flush();
        }
        out.close();
        in.close();
    }
}
