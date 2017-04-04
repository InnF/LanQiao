package theseventhlanqiao.AlgorithmTraining.StringStatistics;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/*
use KMP
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        while (in.hasNextInt()) {
            int len = in.nextInt();
            in.nextLine();
            StringBuilder str = new StringBuilder(in.nextLine());
            HashMap<String, Integer> storage = new HashMap<String, Integer>();
            for (int i = 0; i < str.length(); i++) {
                String sub = str.substring(i, i + len);
                if (!storage.containsKey(sub)) {
                    storage.put(sub, 1);
                } else {
                    storage.put(sub, storage.get(sub) + 1);
                }
            }
        }
    }
}
