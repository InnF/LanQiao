package theseventhlanqiao.BasicPractice.FindInteger;

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
            int n = in.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                list.add(in.nextInt());
            }
            int result = list.indexOf(in.nextInt()) + 1;
            if (result == 0)
                result = -1;
            out.println(result);
            out.flush();
        }
        out.close();
        in.close();
    }
}
