package theseventhlanqiao.AlgorithmTraining.IntervalKLargeNumberQuery;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        while (in.hasNextInt()) {
            int n = in.nextInt();
            List<Integer> nums = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                nums.add(in.nextInt());
            }
            int m = in.nextInt();
            List<Integer> interval;
            for (int i = 0; i < m; i++) {
                int l = in.nextInt();
                int r = in.nextInt();
                int k = in.nextInt();
                interval = new ArrayList<>();
                for (int j = l - 1; j < r; j++) {
                    interval.add(nums.get(j));
                }
                Collections.sort(interval);
                Collections.reverse(interval);
                out.println(interval.get(k - 1));
                out.flush();
            }
        }
        out.close();
        in.close();
    }
}