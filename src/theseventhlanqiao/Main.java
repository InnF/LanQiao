package theseventhlanqiao;

import java.io.*;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(new BufferedInputStream(System.in));
    static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {

        int T;
        String str;
        StringBuilder sb = null;
        while(in.hasNextInt()){
            T = in.nextInt();
            in.nextLine();
            for (int i = 0; i < T; i++) {
                sb = new StringBuilder("");
                str = in.nextLine();
                String[] s = str.split(" ");
                for (int j = 0; j < s.length; j++) {
                    sb.append(s[j].toUpperCase().charAt(0));
                }
                out.print(sb.toString());
                out.println();
                out.flush();
            }
        }
        in.close();
        out.close();
    }
}
