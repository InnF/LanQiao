package theseventhlanqiao.AlgorithmTraining.ExpressionCalculation;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        while (in.hasNext()) {
            String ex = in.nextLine();
            String[] n = ex.split("\\+|-|\\*|/|\\(|\\)");
            String[] t = ex.split("\\w");
            ArrayList<Integer> nums = new ArrayList<Integer>();
            ArrayList<Character> token = new ArrayList<Character>();
            for (String s : n) {
                if (s.length() >= 1)
                    nums.add(Integer.parseInt(s));
            }

            for (String s : t) {
                if (s.length() > 1) {
                    for (int i = 0; i < s.length(); i++) {
                        token.add(s.charAt(i));
                    }
                } else if (s.length() == 1) {
                    token.add(s.charAt(0));
                }
            }

            Stack<Integer> integer = new Stack<Integer>();
            Stack<Character> oper = new Stack<Character>();
            for (int i = 0, c = 0; nums.size() + token.size() > i + c; i++, c++) {
                integer.push(nums.get(i));
                if (integer.size() > 2) {
                    if (prior(token.get(c), oper.peek()) >= 0) {
                        integer.push(calc(integer.pop(), integer.pop(), oper.pop()));
                    }
                }
                oper.push(token.get(c));
            }
            out.println(integer.pop());
            out.flush();
            /*----------test----------------*/
            while (!nums.isEmpty()) {
                System.out.print(nums.remove(0));
            }
            /*----------test----------------*/

            System.out.println();

            /*----------test----------------*/
            System.out.println(token.size());
            while (!token.isEmpty()) {
                System.out.print(token.remove(0));
            }
            /*----------test----------------*/

        }
        out.close();
        in.close();
    }

    private static Integer calc(Integer a, Integer b, Character c) {
        switch (c) {
            default:
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '\\':
                return a / b;
        }
    }

    public static int prior(char a, char b) {
        if ((a == '*') || ((a == '\\') && b == '*' || b == '\\')) {
            return 0;
        } else if ((a == '*') || ((a == '\\') && b == '+' || b == '-')) {
            return 1;
        } else if ((a == '+') || ((a == '-') && b == '+' || b == '-')) {
            return 0;
        } else if ((a == '+') || ((a == '-') && b == '*' || b == '\\')) {
            return -1;
        }
        return 0;
    }
}
