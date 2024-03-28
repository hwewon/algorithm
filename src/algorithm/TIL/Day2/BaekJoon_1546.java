package algorithm.TIL.Day2;

import java.io.*;
import java.util.*;

public class BaekJoon_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int max = 0;
        int sum1 = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 최대값 및 입력 받은 수의 총합 구하기
        for(int i=0; i<a; i++){
            int b = Integer.parseInt(st.nextToken());

            max = Math.max(max, b);     // 입력 받은 수와의 최대값 비교
            sum1 += b;
        }

        double sum2 = (sum1 / (double) max) * 100;   // 문제에서의 수식으로 문제에 맞는 총합 구하기
        double result = sum2/a;                     // 평균

        System.out.println(result);

    }
}
