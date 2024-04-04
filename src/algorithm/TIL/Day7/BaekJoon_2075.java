package algorithm.TIL.Day7;

/*
    메모리 277180kb, 시간 936ms, 시간복잡도 O(n^2 * log n)
    PriorityQueue 문제

    PriorityQueue는 우선순위에 따라 정렬해주는 queue
    큰 수 정렬이므로 우선순위를 반대로 바꿔줘야함
    구하고자하는 순서의 수 직전만큼 빼놓기
 */

import java.io.*;
import java.util.*;

public class BaekJoon_2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 수 정렬을 위해 PriorityQueue 생성 => 정렬 역순으로 만들기((a, b) -> b-a)
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);

        // 입력받은 수를 pq에 담기
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<n; j++){
                int a = Integer.parseInt(st.nextToken());
                pq.offer(a);
            }
        }

        // n-1번째까지 삭제
        for(int i=0; i<n-1; i++){
            pq.poll();
        }

        // 구하고자하는 n번째 출력
        System.out.println(pq.poll());
    }
}
