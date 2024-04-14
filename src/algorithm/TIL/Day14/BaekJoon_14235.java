package algorithm.TIL.Day14;

/*
    메모리 35264kb, 시간 452ms, 시간 복잡도 O(nlogn)
    
    PriorityQueue문제
    
    가장 큰 선물부터 아이들에게 주므로 내림차순으로 정렬
 */

import java.io.*;
import java.util.*;

public class BaekJoon_14235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 아이를 만나면 가장 큰 선물을 주기위해 PriorityQueue 생성
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        StringTokenizer st;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());

            // 0일 경우 줄 선물이 없다면 -1 출력, 아니면 가장 큰 선물을 poll
            if(a == 0){
                if(pq.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(pq.poll());
                }
            // 0이 아닐 경우 입력받은 선물의 가치를 pq에 넣기
            }else{
                for(int j=0; j<a; j++){
                    int b = Integer.parseInt(st.nextToken());
                    pq.offer(b);
                }
            }
        }

    }
}
