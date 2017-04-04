package theseventhlanqiao.BasicPractice.introductory.Fibonacci;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(new BufferedInputStream(System.in));
    static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int input;
        List<Integer> fibonacci;
        while (in.hasNextInt()) {
            fibonacci = new ArrayList<>();
            input = in.nextInt();
            fibonacci.add(0);
            fibonacci.add(1);
            fibonacci.add(1);
            for (int i = 3; i <= input; i++) {
                int f = (fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2)) % 10007;
                fibonacci.add(f);
            }
            out.println(fibonacci.get(input));
            out.flush();
        }
        out.close();
    }
}
