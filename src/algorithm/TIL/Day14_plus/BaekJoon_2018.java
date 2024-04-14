package algorithm.TIL.Day14_plus;

/*
    메모리 14268kb, 시간 164ms, 시간 복잡도 O(n)
    
    투 포인터 문제
 */

import java.io.*;
import java.util.*;

public class BaekJoon_2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        // 투포인터

        int start = 1;
        int end = 1;
        int sum = 1;

        while(start <= end){
            if(sum == n){
                cnt++;
            }

            if(sum < n){
                end++;
                sum += end;
            }else if(sum >= n){
                sum -= start;
                start++;
            }
        }
        System.out.println(cnt);




    // 이중 for문
//        for(int i=1; i<=n; i++){
//            int sum = 0;
//            for(int j=i; j<=n; j++){
//                sum += j;
//                if(sum > n){
//                    break;
//                }else if(sum == n){
//                    cnt++;
//                    break;
//                }
//            }
//        }
//
//        System.out.println(cnt);
    }
}
