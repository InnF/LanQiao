package theseventhlanqiao.AlgorithmTraining.ComplexArithmetic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        while (in.hasNext()) {
            char opera = in.next().charAt(0);
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();
            double d = in.nextDouble();
            double real = 0;
            double img = 0;
            switch (opera) {
                default:
                case '+':
                    real = a + c;
                    img = b + d;
                    break;
                case '-':
                    real = a - c;
                    img = b - d;
                    break;
                case '*':
                    real = a * c - b * d;
                    img = b * c + a * d;
                    break;
                case '/':
                    real = (a * c + b * d) / (c * c + d * d);
                    img = (b * c - a * d) / (c * c + d * d);
                    break;
            }
            out.printf("%.2f+%.2fi", real, img);
            out.flush();
        }
        out.close();
        in.close();
    }
}
