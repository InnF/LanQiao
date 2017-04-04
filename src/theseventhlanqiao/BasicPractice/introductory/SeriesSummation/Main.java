package theseventhlanqiao.BasicPractice.introductory.SeriesSummation;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(new BufferedInputStream(System.in));
    static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        long n, result;
        while (in.hasNextLong()) {
            n = in.nextLong();
            result = (n * (n + 1)) >> 1;
            out.print(result);
            out.println();
            out.flush();
        }
        out.close();
        in.close();
    }
}
