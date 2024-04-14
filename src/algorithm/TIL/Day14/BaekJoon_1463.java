package algorithm.TIL.Day14;

/*
    메모리 18180kb, 시간 148ms, 시간복잡도 O(n)

    다이나믹 프로그래밍 문제

 */

import java.io.*;
import java.util.*;

public class BaekJoon_1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[1000001];
        dp[2] = 1;
        dp[3] = 1;

        // 2와 3을 쓰기위해 dp[2]와 dp[3]을 이용
        // 1로 만들기 위해서 뒤에 +1을 해준다.
        // 이해하기 어렵다...
        for(int i=4; i<=n; i++){
            if (i % 6 == 0) {
                dp[i] = Math.min(dp[i/3], Math.min(dp[i/2], dp[i-1])) + 1;
            }else if(i % 3 == 0){
                dp[i] = Math.min(dp[i/3], dp[i-1]) + 1;
            }else if(i % 2 == 0){
                dp[i] = Math.min(dp[i/2], dp[i-1]) + 1;
            }else{
                dp[i] = dp[i-1] + 1;
            }
        }

        //
        System.out.println(dp[n]);
    }
}