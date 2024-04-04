package algorithm.TIL.Day7;

/*
    메모리 15340kb, 시간 172ms, 시간복잡도 O((n + m) * log n)

    PriorityQueue 문제 (최소힙, long타입)

    PriorityQueue를 사용하여 숫자를 정렬해준 뒤
    2개의 낮은 숫자를 더한 수를 2번 추가(더했던 두 수에 덮어씌워줘야한다) => (m번 반복)
    m번 반복한 뒤 전체 수의 합 구하기
*/

import java.io.*;
import java.util.*;

public class BaekJoon_15903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // long타입으로 받아줘야함 (범위가 1,000,000까지)
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        // 우선순위에 맞게 정렬
        PriorityQueue<Long> pq = new PriorityQueue<>();

        st = new StringTokenizer(br.readLine());

        // n개의 수 저장
        for(int i=0; i<n; i++){
            long num = Long.parseLong(st.nextToken());
            pq.offer(num);
        }

        // a와 b에 젤 낮은 수 2개를 넣어준 뒤
        // 2개의 합을 구하여 pq에 넣어준다 => 2개의 수에 덮어줘야하므로 2번 추가
        for(int i=0; i<m; i++){
            long a = pq.poll();
            long b = pq.poll();

            long sum = a+b;

            pq.offer(sum);
            pq.offer(sum);
        }

        long result = 0;

        // pq의 전체 합 구하기
        while(!pq.isEmpty()){
            result += pq.poll();
        }

        System.out.println(result);
    }
}
