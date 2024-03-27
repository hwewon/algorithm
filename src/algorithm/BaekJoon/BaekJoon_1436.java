package algorithm.BaekJoon;

import java.io.*;
import java.util.*;

public class BaekJoon_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        int b = 666;
        int count = 1;

        while(count != a) {
            b++;
            if(String.valueOf(b).contains("666")) {
                count++;
            }
        }
        System.out.println(b);
    }
}
