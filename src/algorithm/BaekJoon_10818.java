package algorithm;
// 백준 10818번 - 브론즈3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());



        int[] b = new int[a];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<a; i++){
            b[i] += Integer.parseInt(st.nextToken());

        }
        Arrays.sort(b);

        System.out.printf(b[0] + " " + b[a-1]);

    }
}
