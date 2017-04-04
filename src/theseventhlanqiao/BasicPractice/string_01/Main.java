package theseventhlanqiao.BasicPractice.string_01;

import java.io.BufferedOutputStream;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        for (int i = 0; i < 32; i++) {
            String binary = Integer.toBinaryString(i);
            if (binary.length() == 1) {
                binary = new StringBuilder(binary).insert(0, "0000").toString();
            } else if (binary.length() == 2) {
                binary = new StringBuilder(binary).insert(0, "000").toString();
            } else if (binary.length() == 3) {
                binary = new StringBuilder(binary).insert(0, "00").toString();
            } else if (binary.length() == 4) {
                binary = new StringBuilder(binary).insert(0, "0").toString();
            }
            out.println(binary);
        }
        out.flush();
        out.close();
    }
}
