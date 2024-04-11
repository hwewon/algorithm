package algorithm.TIL.Day12_plus;

/*
    메모리 32180kb, 시간 1072ms, 시간복잡도 O(NlogN)
    
    최대힙 문제(PriorityQueue문제)
    
    Comparator에 Collections.reverseOrder를 넣어줘서 내림차순으로 만들어 최댓값 출력
 */

import java.io.*;
import java.util.*;

public class BaekJoon_11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // Comparator에 reverseOrder로 내림차순으로 만들기
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<n; i++){
            int x = Integer.parseInt(br.readLine());

            // x가 0일 경우
            // pq가 비어있을 경우 0출력, 비어있지 않을 경우 최댓값 제일 앞에 있는 수 출력
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
