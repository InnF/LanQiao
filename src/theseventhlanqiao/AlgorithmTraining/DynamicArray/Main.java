package theseventhlanqiao.AlgorithmTraining.DynamicArray;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        while (in.hasNextInt()) {
            int len = in.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < len; i++) {
                list.add(in.nextInt());
            }
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            out.print(sum + " ");
            out.println(sum/len);
            out.flush();
        }
        out.close();
        in.close();
    }
}
