package algorithm.TIL.Day7;

/*
    메모리 14320kb, 시간 136ms, 시간복잡도 O(n)

    HashMap or Queue로 푸는 문제
    (HashMap으로 어떻게 문제에 접근해야 하는지 몰라서 Queue로 풀었음..)
    Queue 2개(들어온 순서, 나간 순서)를 만들어서 그 2개를 비교하는 풀이
    나간 차량을 들어온 차량 Queue에서 제거
 */

import java.io.*;
import java.util.*;

public class BaekJoon_2002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 터널 들어온 순서 차량 번호 Queue
        Queue<String> q1 = new LinkedList<>();

        for(int i=0; i<n; i++){
            String InCar = br.readLine();
            q1.offer(InCar);
        }

        // 터널 나간 순서 차량 번호 Queue
        Queue<String> q2 = new LinkedList<>();

        for(int i=0; i<n; i++){
            String OutCar = br.readLine();
            q2.offer(OutCar);
        }

        // 추월 차량 수
        int count = 0;

        // q1과 q2가 모두 비어있지 않을 경우 반복 (하나라도 비어있으면 종료)
        while(!q1.isEmpty() && !q2.isEmpty()){
            // 비교할 가장 앞의 차량 저장
            String in = q1.peek();
            String out = q2.peek();

            // 들어온 차량과 나간 차량이 같을 경우 -> 두 차량 번호 삭제
            if(in.equals(out)){
                q1.poll();
                q2.poll();
            // 같지 않을 경우
            }else{
                // 나간 차량을 q1에서 삭제(q1에 남아있을 경우 count가 증가할 수 있음)
                // 1 2 3 4 5 (들어온 순서)
                // 2 5 4 1 3 (나간 순서)  인 경우
                q1.remove(out);
                // 나간 차량은 삭제
                q2.poll();
                // 추월 차량이므로 count 증가
                count++;
            }
        }
        System.out.println(count);
    }
}
