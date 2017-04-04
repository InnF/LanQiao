package theseventhlanqiao.BasicPractice.Palindrome;

import java.io.BufferedOutputStream;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if (i == l && j == k) {
                            out.printf("%d%d%d%d\n", i, j, k, l);
                        }
                        out.flush();
                    }
                }
            }
        }
        out.close();
    }
}
