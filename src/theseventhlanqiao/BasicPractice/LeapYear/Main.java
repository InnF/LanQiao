package theseventhlanqiao.BasicPractice.LeapYear;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        while(in.hasNextInt()) {
            int year = in.nextInt();
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                out.println("yes");
            } else {
                out.println("no");
            }
            out.flush();
        }
        out.close();
        in.close();
    }
}
