package theseventhlanqiao.AlgorithmTraining.Recursive;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    static int combination(int k, int n) {
        if (k > n) {
            return 0;
        }
        if (k == 0 || k == n) {
            return 1;
        } else if (k > 0 || k < n) {
            return combination(k, n - 1) + combination(k - 1, n - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        while (in.hasNextInt()) {
            out.print(combination(in.nextInt(), in.nextInt()));
            out.flush();
        }
        out.close();
        in.close();
    }
}
