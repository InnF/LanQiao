package theseventhlanqiao.BasicPractice.Hex2Dec;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(new BufferedInputStream(System.in));
    static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        while (in.hasNextLine()) {
            String hex = in.nextLine();
            /*不超过8位的正的十六进制数,转化为10进制可能超过int的范围，应当用long保存*/
            long dec = 0;
            for (int i = hex.length() - 1, j = 0; i >= 0; i--, j++) {
                char c = hex.charAt(i);
                if (c >= 'A' && c <= 'F'){
                    dec += (c - 'A' + 10) * Math.pow(16, j);
                } else if (c >= '0' && c <= '9') {
                    dec += (c - '0') * Math.pow(16, j);
                }
            }
            out.print(dec);
            out.println();
            out.flush();
        }
        out.close();
    }
}
