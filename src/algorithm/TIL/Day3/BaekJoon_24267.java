package algorithm.TIL.Day3;

import java.io.*;
import java.util.*;

public class BaekJoon_24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        // 해당 알고리즘 돌아가는 횟수 => ex)7 => 7 * 6 * 5 / 3 * 2 * 1
        System.out.println((n * (n-1) * (n-2))/6);
        System.out.println(((n+1) * n * (n-1)));

        // 최고차항은 3 고정
        System.out.println(3);

    }
}
