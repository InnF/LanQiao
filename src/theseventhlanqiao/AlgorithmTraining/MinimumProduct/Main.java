package theseventhlanqiao.AlgorithmTraining.MinimumProduct;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        while (in.hasNextInt()) {
            int t = in.nextInt();
            for (int i = 0; i < t; i++) {
                int n = in.nextInt();
                List<Integer> nums1 = new ArrayList<Integer>();
                List<Integer> nums2 = new ArrayList<Integer>();
                for (int j = 0; j < n; j++) {
                    nums1.add(in.nextInt());
                }
                for (int j = 0; j < n; j++) {
                    nums2.add(in.nextInt());
                }
                Collections.sort(nums1);
                Collections.sort(nums2, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1 < o2 ? 1 : o1.equals(o2) ? 0 : -1;
                    }
                });
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    sum += nums1.get(j) * nums2.get(j);
                }
                out.println(sum);
                out.flush();
            }
        }
        in.close();
        out.close();
    }
}
