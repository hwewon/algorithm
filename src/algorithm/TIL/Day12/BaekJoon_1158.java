package algorithm.TIL.Day12;

/*
    메모리 296132kb, 속도 712ms, 시간복잡도 O(nk)
    
    Queue문제

    1 2 3 4 5 6 7에서 3번째를 큐에서 빼서 출력
    3 -> 1 2 4 5 6 7에서 4 5 6 3번째 출력 6출력
    이런 방식으로 출력해주기
 */

import java.io.*;
import java.util.*;

public class BaekJoon_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        // 큐에 값을 1부터 넣어줘야함
        for(int i=1; i<=n; i++){
            queue.offer(i);
        }

        System.out.print("<");

        // 큐의 사이즈가 1일때까지 돌려서 출력
        while(queue.size() != 1){
            for(int i=0; i<k-1; i++){
                queue.offer(queue.poll());
            }
            System.out.print(queue.poll() + ", ");
        }

        // 마지막 값 출력
        System.out.print(queue.poll() + ">");
    }
}
