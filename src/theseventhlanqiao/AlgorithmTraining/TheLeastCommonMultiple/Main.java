package theseventhlanqiao.AlgorithmTraining.TheLeastCommonMultiple;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        while (in.hasNextLong()) {
            long n = in.nextLong();
            long m = in.nextLong();

            for (long i = n > m ? n : m; i <= n * m; i++) {
                if (i % n == 0 && i % m == 0){
                    out.println(i);
                    out.flush();
                    break;
                }
            }
        }
        out.close();
        in.close();
    }
}
