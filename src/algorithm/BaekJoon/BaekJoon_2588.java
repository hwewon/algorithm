package algorithm.BaekJoon;
// 백준 2588번 - 브론즈3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int c = a * (b%10);
        int d = a * (b%100/10);
        int e = a * (b%1000/100);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a*b);

    }
}
