package algorithm.TIL.Day13;

/*
    메모리 14240kb, 시간 132ms, 시간복잡도 O(nlogn)

    PriorityQueue문제 (보물)

    두 개의 오름차순, 내림차순의 queue생성 후 하나씩 꺼내서 곱한 수의 총 합
 */

import java.io.*;
import java.util.*;

public class BaekJoon_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 오름차순으로 정렬
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n; i++){
            pq1.offer(Integer.parseInt(st.nextToken()));

        }

        // 내림차순으로 정렬
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());

        st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<n; i++){
            pq2.offer(Integer.parseInt(st.nextToken()));
        }

        int sum = 0;
        int result = 0;

        // 한 개의 큐라도 비어있을 때까지
       while(!pq1.isEmpty()){
            int a = pq1.poll();
            int b = pq2.poll();

            // 둘이 곱한 값을 저장
            sum = a*b;
            // 곱한 값의 총 합
            result += sum;
        }

        System.out.println(result);

    }
}
