package theseventhlanqiao.AlgorithmTraining.PrefixExpression;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        while (in.hasNextLine()) {
            String exp = in.nextLine();
            String[] token = exp.split(" ");
            char c = token[0].charAt(0);
            int a = Integer.parseInt(token[1]);
            int b = Integer.parseInt(token[2]);
            switch (c) {
                case '+':
                    out.println(a + b);
                    out.flush();
                    break;
                case '-':
                    out.println(a - b);
                    out.flush();
                    break;
                case '*':
                    out.println(a * b);
                    out.flush();
                    break;
                case '/':
                    out.println(a / b);
                    out.flush();
                    break;
                default:
                    break;
            }
        }
        out.close();
        in.close();
    }
}