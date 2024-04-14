package algorithm.TIL.Day14;

/*
    메모리 14228kb, 시간 124ms, 시간 복잡도 O(n)

    dp문제(Dynamic Programming) - 동적 계획법 문제


 */

import java.io.*;
import java.util.*;

public class BaekJoon_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        while(true){
            // n이 5로 나눠지면 몫을 cnt에 추가하고 출력
            if(n%5 == 0){
                cnt += n/5;
                System.out.println(cnt);
                break;
            // 5로 나눠지지 않으면 3을 한번씩 빼주기    
            }else{
                n -= 3;
                cnt++;
            }

            // 3을 빼는 와중에 음수가 되면 -1 출력
            if(n < 0){
                System.out.println(-1);
                break;
            }
        }
    }
}
