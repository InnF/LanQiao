package theseventhlanqiao.AlgorithmTraining.UnnameLakeTroubles;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        while (in.hasNextInt()) {
            out.println(fun(in.nextInt(), in.nextInt()));
            out.flush();
        }
        out.close();
        in.close();
    }

    // the program of queue
    private static int fun(int m, int n) {
        if (m < n)
            return 0;
        else if (n == 0)
            return 1;
        else
            return fun(m - 1, n) + fun(m, n - 1);
    }

}
