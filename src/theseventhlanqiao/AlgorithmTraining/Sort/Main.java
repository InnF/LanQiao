package theseventhlanqiao.AlgorithmTraining.Sort;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        while (in.hasNextInt()) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(in.nextInt());
            list.add(in.nextInt());
            list.add(in.nextInt());
            Collections.sort(list, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 < o2 ? 1 : o1.equals(o2) ? 0 : -1;
                }
            });
            out.printf("%d %d %d\n", list.get(0), list.get(1), list.get(2));
            out.flush();
        }
        out.close();
        in.close();
    }
}
