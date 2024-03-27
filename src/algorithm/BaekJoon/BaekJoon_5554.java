package algorithm.BaekJoon;
// 백준 5554번 - 브론즈4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_5554 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        int result1 = (a+b+c+d)/60;
        int result2 = (a+b+c+d)%60;

        System.out.println(result1);
        System.out.println(result2);

    }
}
