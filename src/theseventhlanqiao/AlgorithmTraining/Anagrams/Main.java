package theseventhlanqiao.AlgorithmTraining.Anagrams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        while (in.hasNextLine()) {
            char[] word1 = in.nextLine().toLowerCase().toCharArray();
            char[] word2 = in.nextLine().toLowerCase().toCharArray();
            Arrays.sort(word1);
            Arrays.sort(word2);
            if (Arrays.equals(word1, word2)) {
                out.println("Y");
            } else {
                out.println("N");
            }
            out.flush();
        }
        out.close();
        in.close();
    }
}
