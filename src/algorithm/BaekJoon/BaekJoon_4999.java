package algorithm.BaekJoon;
// 백준 4999번 - 브론즈5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_4999 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        if (a.length() >= b.length()) {
            System.out.println("go");
        }else {
            System.out.println("no");
        }


    }
}
