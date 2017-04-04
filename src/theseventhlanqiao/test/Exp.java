package theseventhlanqiao.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Inno Fang on 2017/3/22.
 */
public class Exp {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        while (in.hasNextLine()) {
            String exp = in.nextLine();
            String[] token = exp.split(" ");
            char oper = token[1].charAt(0);
            switch (oper) {
                case '+':
                    out.println(Integer.parseInt(token[0]) + Integer.parseInt(token[2]));
                    break;
                case '-':
                    out.println(Integer.parseInt(token[0]) - Integer.parseInt(token[2]));
                    break;
                case '*':
                    out.println(Integer.parseInt(token[0]) * Integer.parseInt(token[2]));
                    break;
                case '/':
                    out.println(Double.parseDouble(token[0]) + Double.parseDouble(token[2]));
                    break;
                default:
                    break;
            }
            out.flush();
        }
        out.close();
        in.close();
    }

}
