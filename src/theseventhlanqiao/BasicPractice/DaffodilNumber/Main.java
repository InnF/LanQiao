package theseventhlanqiao.BasicPractice.DaffodilNumber;

import java.io.BufferedOutputStream;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        for (int i = 100; i < 999; i++) {
            int g = i % 10;
            int s = (i / 10) % 10;
            int b = i / 100;
            if ((g * g * g + s * s * s + b * b * b) == i) {
                out.println(i);
            }
            out.flush();
        }
        out.close();
    }
}
