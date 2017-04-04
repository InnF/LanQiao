package theseventhlanqiao.javab.t1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by InnF on 2017/2/12.
 * 煤球数目
 * <p>
 * 有一堆煤球，堆成三角棱锥形。具体：
 * 第一层放1个，
 * 第二层3个（排列成三角形），
 * 第三层6个（排列成三角形），
 * 第四层10个（排列成三角形），
 * ....
 * 如果一共有100层，共有多少个煤球？
 * <p>
 * 请填表示煤球总数目的数字。
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int increase, result, input;
        while (in.hasNext()) {
            increase = 1;
            result = 0;
            input = in.nextInt();
            for (int i = 1; i <= input; i++) {
                result += increase;
                increase++;
            }
            out.println(result);
            out.flush();
        }
        out.close();
    }

}
