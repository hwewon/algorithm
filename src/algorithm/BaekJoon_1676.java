package algorithm;

import java.io.*;
import java.util.*;

public class BaekJoon_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int count = 0;

        while(a >= 5) {
            count += a/5;
            a /= 5;
        }
        System.out.println(count);

    }
}
