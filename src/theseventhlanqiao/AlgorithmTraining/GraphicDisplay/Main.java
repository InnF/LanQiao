package theseventhlanqiao.AlgorithmTraining.GraphicDisplay;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        while(in.hasNextInt()) {
            int n = in.nextInt();
            for (int i = n; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    out.print("*");
                    if (j + 1 != i)
                        out.print(" ");
                    out.flush();
                }
                out.println();
                out.flush();
            }
        }
        out.close();
        in.close();
    }
}
