package theseventhlanqiao.BasicPractice.introductory.CircleArea;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(new BufferedInputStream(System.in));
    static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        double r;
        while (in.hasNextDouble()) {
            r = in.nextDouble();
            out.printf("%.7f\n", Math.PI * r * r);
            out.flush();
        }
        out.close();
    }
}
