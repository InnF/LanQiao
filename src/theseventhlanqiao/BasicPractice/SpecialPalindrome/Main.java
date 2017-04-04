package theseventhlanqiao.BasicPractice.SpecialPalindrome;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        while (in.hasNextInt()) {
            int m = in.nextInt();
            int n = 9;
            if (n > m) {
                n = m;
            }
            List<Integer> results = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    for (int k = 0; k <= n; k++) {
                        if (i + j + k > m) {
                            break;
                        }
                        if ((i * 2 + j * 2 + k * 2) == m) {
                            results.add(i * 100000 + j * 10000 + k * 1000 + k * 100 + j * 10 + i);
                        }
                        if ((i *2 + j * 2 + k) == m) {
                            results.add(i *10000 + j * 1000 + k * 100 + j * 10 + i);
                        }
                    }
                }
            }
            if (!results.isEmpty()) {
                Collections.sort(results);
                for (Integer result : results) {
                    out.println(result);
                }
                out.flush();
            }
        }
        out.close();
        in.close();
    }
}
