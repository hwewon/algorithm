package algorithm;
// 백준 3003번 - 브론즈5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = 1;
        int q = 1;
        int r = 2;
        int b = 2;
        int kni = 2;
        int p = 8;

        int k2 = k - (Integer.parseInt(st.nextToken()));
        int q2 = q - (Integer.parseInt(st.nextToken()));
        int r2 = r - (Integer.parseInt(st.nextToken()));
        int b2 = b - (Integer.parseInt(st.nextToken()));
        int kni2 = kni - (Integer.parseInt(st.nextToken()));
        int p2 = p - (Integer.parseInt(st.nextToken()));

        System.out.printf(k2 + " " + q2 + " " + r2 + " " + b2 + " " + kni2 + " " + p2);
    }
}
