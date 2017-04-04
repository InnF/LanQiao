package theseventhlanqiao.BasicPractice.SequenceCharacteristics;

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
            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0, num;
            for (int i = 0; i < n; i++) {
                num = in.nextInt();
                if (max < num) {
                    max = num;
                }
                if (min > num) {
                    min = num;
                }
                sum += num;
            }
            out.println(max);
            out.println(min);
            out.println(sum);
            out.flush();
        }
        out.close();
        in.close();
    }
}
