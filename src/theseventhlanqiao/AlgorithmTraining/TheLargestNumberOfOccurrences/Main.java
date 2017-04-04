package theseventhlanqiao.AlgorithmTraining.TheLargestNumberOfOccurrences;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        while (in.hasNextInt()) {
            HashMap<Integer, Integer> storage = new HashMap<Integer, Integer>();
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                if (!storage.containsKey(num)) {
                    storage.put(num, 1);
                } else {
                    storage.put(num, storage.get(num) + 1);
                }
            }
            Iterator it = storage.entrySet().iterator();
            int occurTimes = 0, num = Integer.MIN_VALUE;
            while (it.hasNext()) {

                Map.Entry entry = (Map.Entry) it.next();
                if (occurTimes < (int) entry.getValue()
                        || (occurTimes == (int) entry.getValue() && num > (int) entry.getKey())) {
                    occurTimes = (int) entry.getValue();
                    num = (int) entry.getKey();
                }
            }
            if (!storage.isEmpty()){ // *** 这是个坑
                out.println(num);
                out.flush();
            }
        }
        out.close();
        in.close();
    }
}
