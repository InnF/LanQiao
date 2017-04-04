package theseventhlanqiao.AlgorithmTraining.CH008;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        while (in.hasNextInt()) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();

            boolean result = (a * 1.0 / b) < (c * 0.1 / d);

            out.printf("zrf is:%d/%d; ssh is:%d/%d\n", a, b, c, d);
            out.printf("(zrf==ssh) is:0; (zrf<ssh) is:1\n"
                    , !result ? 1 : 0
                    , result ? 1 : 0);
            out.flush();
        }
        out.close();
        in.close();
    }
}
