package theseventhlanqiao.BasicPractice.YangHuiTriangle;

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
            int[][] yh = new int[n][n];
            for (int i = 0; i < n; i++) {
                yh[i][0] = 1;
                yh[i][i] = 1;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    if (j == 0) {
                        out.print(yh[i][j]);
                        out.flush();
                    } else if (i == j) {
                        out.print(yh[i][j]);
                        out.flush();
                    } else {
                        yh[i][j] = yh[i - 1][j - 1] + yh[i - 1][j];
                        out.print(yh[i][j]);
                        out.flush();
                    }
                    out.print(" ");
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
