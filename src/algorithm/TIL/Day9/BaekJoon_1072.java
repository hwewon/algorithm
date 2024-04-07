package algorithm.TIL.Day9;

/*
    메모리 14216kb, 시간 124ms, 시간복잡도 O(logN)

    이분 탐색 문제

    현재 승률에서 승률이 바뀌는 최소 판 수 구하기
    99%일 경우에는 절대 100%로 될 수 없으므로 99%이상은 -1 출력해줘야함
    (y/x) * 100로 하면 소수점 이하를 버리게 되므로 y에 먼저 100을 곱해줘야함
 */

import java.io.*;
import java.util.*;

public class BaekJoon_1072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());

        // 맨 처음 승률
        // y/x부터 하게되면 소수점을 다 버리므로 100을 먼저 곱해줌
        long z = (y * 100) / x;

        // 최소와 최댓값 저장
        long start = 0;
        long end = 1000000000;


        // 99%이상일 경우 100%될 가능성이 없으므로 -1 출력
        if(z >= 99){
            System.out.println("-1");
        }else{
            while(start < end){

                // 이분 탐색에 사용될 중간값
                long mid = (start+end) / 2;
                // 바뀐 승률 계산
                long z2 = ((y + mid) * 100) / (x + mid);

                // 바뀐 승률이 높을 경우 end값을 당김
                if(z2 > z){
                    end = mid;
                // 낮을 경우 start값을 뒤로 당김
                }else{
                    start = mid + 1;
                }
            }
            System.out.println(end);
        }
    }
}
