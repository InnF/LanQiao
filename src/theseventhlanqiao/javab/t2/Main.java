package theseventhlanqiao.javab.t2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by InnF on 2017/2/12.
 * 生日蜡烛
 * <p>
 * 某君从某年开始每年都举办一次生日party，并且每次都要吹熄与年龄相同根数的蜡烛。
 * <p>
 * 现在算起来，他一共吹熄了236根蜡烛。
 * <p>
 * 请问，他从多少岁开始过生日party的？
 * <p>
 * 请填写他开始过生日party的年龄数。Answer : 26
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        final int CANDLES = 236;
        boolean isContinue = true;
        int result = 1, candles;
        while (isContinue) {
            result++;
            candles = 0;
            for (int i = result; ; i++) {
                candles += i;
                if (candles == CANDLES) {
                    isContinue = false;
                    break;
                } else if (candles > CANDLES) {
                    break;
                }
            }
        }
        out.println(result);
        out.flush();
        out.close();
    }
}
