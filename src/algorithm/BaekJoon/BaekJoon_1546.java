package algorithm.BaekJoon;
// 백준 1546번 - 브론즈1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int max = 0;
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<a; i++){
            int b = Integer.parseInt(st.nextToken());
            max = Math.max(max, b);
            sum += b;
        }

        double sum2 = sum/(double)max*100;

        double result = sum2/a;

        System.out.println(result);
    }
}