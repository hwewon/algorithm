package algorithm.TIL.Day12_plus;

/*
    메모리 29172kb, 시간 1132ms, 시간복잡도 O(NlogN)

    최소힙 문제

    PriorityQueue를 이용한 문제
 */

import java.io.*;
import java.util.*;

public class BaekJoon_1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<n; i++){
            int x = Integer.parseInt(br.readLine());

            // x가 0일 경우
            // pq가 비어있을 경우 0출력, 비어있지 않을 경우 최솟값 제일 앞에 있는 수 출력
            if(x == 0){
                if(pq.size() == 0){
                    System.out.println("0");
                }else{
                    System.out.println(pq.poll());
                }
            // x가 0이 아닐 경우
            // pq에 x의 값을 추가
            }else{
                pq.offer(x);
            }
        }

    }
}
