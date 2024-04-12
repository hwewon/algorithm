package algorithm.TIL.Day13;

/*
    메모리 26312kb, 시간 624ms, 시간복잡도 O(nlogn)

    PriorityQueue(절대값 힙)

    절대값 기준으로 정렬하기
 */

import java.io.*;
import java.util.*;

public class BaekJoon_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // Comparator를 절대값 기준으로 정렬
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            int num1 = Math.abs(o1);
            int num2 = Math.abs(o2);

            // 절대값이 같을 경우 작은 수 정렬
            if(num1 == num2) {
                if(o1 > o2){
                    return 1;
                }else{
                    return -1;
                }
            }
            return num1 - num2;
        });

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                if(pq.isEmpty()){
                    System.out.println("0");
                }else{
                    System.out.println(pq.poll());
                }
            }else{
                pq.offer(num);
            }
        }
    }
}