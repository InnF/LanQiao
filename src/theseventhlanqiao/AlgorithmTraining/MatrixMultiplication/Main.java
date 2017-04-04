package theseventhlanqiao.AlgorithmTraining.MatrixMultiplication;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        while (in.hasNextInt()) {
            int m = in.nextInt();
            int s = in.nextInt();
            int n = in.nextInt();
            int[][] mat1 = new int[m][s];
            int[][] mat2 = new int[s][n];
            int[][] mat3 = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < s; j++) {
                    mat1[i][j] = in.nextInt();
                }
            }
            for (int i = 0; i < s; i++) {
                for (int j = 0; j < n; j++) {
                    mat2[i][j] = in.nextInt();
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < s; k++) {
                        mat3[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    out.print(mat3[i][j]);
                    if (j + 1 != n) {
                        out.print(" ");
                    }
                    out.flush();
                }
                out.println();
                out.flush();
            }
        }
        out.close();
        in.close();
    }
}