package theseventhlanqiao.BasicPractice.Hex2Oct;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(new BufferedInputStream(System.in));
    static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        HashMap<String, String> HEX = new HashMap<String, String>();
        HashMap<String, String> OCT = new HashMap<String, String>();
        HEX.put("0", "0000");
        HEX.put("1", "0001");
        HEX.put("2", "0010");
        HEX.put("3", "0011");
        HEX.put("4", "0100");
        HEX.put("5", "0101");
        HEX.put("6", "0110");
        HEX.put("7", "0111");
        HEX.put("8", "1000");
        HEX.put("9", "1001");
        HEX.put("A", "1010");
        HEX.put("B", "1011");
        HEX.put("C", "1100");
        HEX.put("D", "1101");
        HEX.put("E", "1110");
        HEX.put("F", "1111");

        OCT.put("000", "0");
        OCT.put("001", "1");
        OCT.put("010", "2");
        OCT.put("011", "3");
        OCT.put("100", "4");
        OCT.put("101", "5");
        OCT.put("110", "6");
        OCT.put("111", "7");

        int n;
        while (in.hasNextInt()) {
            n = in.nextInt();
            in.nextLine();
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder("");
                String hex = in.nextLine();
                StringBuilder oct = new StringBuilder("");
                for (int j = 0; j < hex.length(); j++) {
                    sb.append(HEX.get(hex.substring(j, j + 1)));
                }
                sb = new StringBuilder(sb.substring(sb.indexOf("1")));
                if (sb.length() % 3 == 1)
                    sb.insert(0, "00");
                else if (sb.length() % 3 == 2)
                    sb.insert(0, "0");
                for (int j = 0; j < sb.length(); j += 3) {
                    oct.append(OCT.get(sb.substring(j, j + 3)));
                }
                out.print(oct.toString());
                out.println();
                out.flush();
            }
        }
        out.close();
        in.close();
    }
}
