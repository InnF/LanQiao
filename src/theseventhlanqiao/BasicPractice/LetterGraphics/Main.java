package theseventhlanqiao.BasicPractice.LetterGraphics;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int n, m;
        while (in.hasNextInt()) {
            n = in.nextInt();
            m = in.nextInt();

            for (int i = 0; i < n; i++) {

                int t = -1;
                char c = (char) ('A' + i);
                for (int j = 0; j < m; j++) {
                    out.print(c);
                    out.flush();
                    if (c == 'A') {
                        t = 1;
                    }
                    c += t;
                }
                out.println();
                out.flush();

            }
        }
        out.close();
        in.close();
    }
}
    /* int len = 0;
                for (int j = i; j > 0; j--) {
                    out.print((char) ('A' + j));
                    out.flush();
                    len++;
                }
                for (int k = 0; k < m - len; k++) {
                    out.print((char) ('A' + k));
                    out.flush();
                }
                out.println();
                out.flush();*/