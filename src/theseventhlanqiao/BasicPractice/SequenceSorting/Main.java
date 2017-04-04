package theseventhlanqiao.BasicPractice.SequenceSorting;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    static Scanner in = new Scanner(new BufferedInputStream(System.in));
    static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int nums;
        List<Integer> list = null;
        while (in.hasNextInt()) {
            list = new ArrayList<>();
            nums = in.nextInt();
            for (int i = 0; i < nums; i++) {
                list.add(in.nextInt());
            }
            Collections.sort(list);
            for (int i = 0; i < nums; i++) {
                out.print(list.get(i));
                if (i < nums - 1) {
                    out.print(" ");
                }
            }
            out.println();
            out.flush();
        }
        out.close();
        in.close();
    }
}
