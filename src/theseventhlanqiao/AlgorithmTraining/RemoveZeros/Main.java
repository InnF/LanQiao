package theseventhlanqiao.AlgorithmTraining.RemoveZeros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        while (in.hasNextInt()) {
            int num = in.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < num; i++) {
                list.add(in.nextInt());
            }
            num = compactIntegers(list, num);
            out.println(num);
            if (!list.isEmpty()){
                for (int i = 0; i < list.size(); i++) {
                    out.print(list.get(i));
                    if (i + 1 != list.size()) {
                        out.print(" ");
                    }
                    out.flush();
                }
                out.println();
            }
            out.flush();
        }
        in.close();
        out.close();
    }

    private static int compactIntegers(List<Integer> list, int num) {
        while (list.contains(0)) {
            list.remove(list.indexOf(0));
        }
        return list.isEmpty() ? 0 : list.size();
    }
}
