package theseventhlanqiao.BasicPractice.Dec2Hex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        while (in.hasNextInt()) {
            int dec = in.nextInt();
            out.println(Integer.toHexString(dec).toUpperCase());
            out.flush();
        }
        out.close();
        in.close();
    }

}
/*
注意将生成的小写字母转换成大写的
 */
