package theseventhlanqiao.AlgorithmTraining.FindBiggestNumber;

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
            int max = -1;
            int maxIndex = -1;
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                if (num > max) {
                    max = num;
                    maxIndex = i;
                }
            }
            out.println(max + " " + maxIndex);
            out.flush();
        }
    }
}
