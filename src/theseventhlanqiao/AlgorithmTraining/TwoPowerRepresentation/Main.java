package theseventhlanqiao.AlgorithmTraining.TwoPowerRepresentation;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static int[] tp = new int[]{
            1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384
    };

    private static HashMap<Integer, String> power = new HashMap<Integer, String>();

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        power.put(1, "2(0)");
        power.put(2, "2");
        power.put(4, "2(2)");
        power.put(8, "2(3)");
        power.put(16, "2(4)");
        power.put(32, "2(5)");
        power.put(64, "2(6)");
        power.put(128, "2(7)");
        power.put(256, "2(8)");
        power.put(512, "2(9)");
        power.put(1024, "2(10)");
        power.put(2048, "2(11)");
        power.put(4096, "2(12)");
        power.put(8192, "2(13)");
        power.put(16384, "2(14)");

        while (in.hasNextInt()) {
            int num = in.nextInt();
            StringBuilder tpp = formatTwoPower(num);

            for (int i = 0; i < tpp.toString().length(); i++) {
                if (tpp.charAt(i) == '1' && tpp.charAt(i + 1) >= '0' && tpp.charAt(i + 1) <= '5') {
                    tpp.replace(i, i + 2, String.valueOf(formatTwoPower(Integer.parseInt(tpp.substring(i,i+2)))));
                } else if (tpp.charAt(i) > '2' && tpp.charAt(i) <= '9') {
                    tpp.replace(i, i + 1, String.valueOf(formatTwoPower(Integer.parseInt(String.valueOf(tpp.charAt(i))))));
                }
            }
            out.println(tpp.toString());
            out.flush();
        }
        out.close();
        in.close();
    }

    private static StringBuilder formatTwoPower(int num) {
        StringBuilder sb = new StringBuilder("");
        for (int i = tp.length - 1; i >= 0 && num != 0; i--) {
            if (num >= tp[i]) {
                sb.append(power.get(tp[i]));
                num -= tp[i];
                if (num != 0)
                    sb.append("+");
            }
        }
        return sb;
    }
}
