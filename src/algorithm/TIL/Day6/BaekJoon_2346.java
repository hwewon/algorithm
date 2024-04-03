package algorithm.TIL.Day6;

/*
    메모리 15116kb, 시간 180ms, 시간 복잡도 O(N^2)
    Deque(덱) 문제
    양방향으로 추가, 삭제가 가능한 Deque 특징으로 푸는 문제
 */

import java.io.*;
import java.util.*;

public class BaekJoon_2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 풍선의 순서와 풍선의 숫자를 저장할 덱 생성 -> 배열도 타입에 넣을 수 있음
        Deque<int[]> q = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 풍선의 순서와 풍선의 숫자를 덱에 저장
        for(int i=0; i<n; i++){
            int[] arr = {i+1, Integer.parseInt(st.nextToken())};
            q.add(arr);
        }

        StringBuilder sb = new StringBuilder();


        while(q.size()>1){
            // 덱에서 첫번째 풍선을 꺼내서 풍선의 순서를 넣어줌
            int[] arr = q.pollFirst();
            sb.append(arr[0]).append(" ");
            // 풍선에 적힌 숫자를 넣기
            int a = arr[1];
            // 풍선의 숫자가 양수일 경우 => 풍선의 숫자만큼 앞의 덱 값을 뒤로 이동시킴
            if(a>0){
                for(int j=1; j<a; j++){
                    q.offerLast(q.pollFirst());
                }
            // 풍선의 숫자가 음수일 경우 => 풍선의 숫자만큼 뒤의 덱 값을 앞으로 이동시킴
            }else{
                for(int j=a; j<0; j++){
                    q.offerFirst(q.pollLast());
                }
            }
        }
        // 마지막 남은 풍선의 번호 추가
        sb.append(q.poll()[0]);
        System.out.print(sb + "\n");

    }
}
