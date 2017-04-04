package theseventhlanqiao.AlgorithmTraining.CaseConversion;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        while (in.hasNextLine()) {
            char[] chars = in.nextLine().toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] >= 'A' && chars[i] <= 'Z') {
                    chars[i] = (char) (chars[i] + 32);
                } else {
                    chars[i] = (char) (chars[i] - 32);
                }
            }
            out.println(chars);
            out.flush();
        }
        out.close();
        in.close();
    }
}
