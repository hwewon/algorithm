package algorithm.TIL.SecondTest;

// 작은 수부터 더하면 최솟값

/*
    메모리 281120kb, 시간 3164ms, 시간복잡도  O(NlogN)

    PriorityQueue 문제

    ArrayList로 했다가 시간초과...
 */

import java.io.*;
import java.util.*;

public class BaekJoon_13975 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            int k = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            PriorityQueue<Long> pq = new PriorityQueue<>();

            for(int j=0; j<k; j++){
                pq.offer(Long.parseLong(st.nextToken()));
            }

            long result = 0;

            while(pq.size() > 1){
                long first = pq.poll();
                long second = pq.poll();

                // 가장 작은 수 2개
                long sum = first + second;

                result += sum;

                // 리스트에 더한 값 추가
                pq.offer(sum);
            }
            System.out.println(result);
        }
    }
}
