package algorithm.TIL.Day6;

/*
    메모리 16112kb, 시간 172ms

    Queue문제
    인덱스의 값을 저장하는 queue
    중요도를 저장하는 queue 두 개의 queue 생성
    두 개의 queue를 비교하여 찾고자하는 인덱스의 프린트 순서 찾기
 */

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for(int i=0; i<a; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Queue<Integer> index = new LinkedList<>();          // 인덱스 번호 저장 queue 생성
            Queue<Integer> Documents = new LinkedList<>();      // 중요도 저장하는 queue 생성

            st = new StringTokenizer(br.readLine(), " ");

            for(int j=0; j<n; j++){
                index.offer(j);                                    // 인덱스 번호 저장
                Documents.offer(Integer.parseInt(st.nextToken())); // 중요도 저장
            }

            int count = 0;

            while(!index.isEmpty()){
                int max = Collections.max(Documents); // 가장 중요도가 높은 값 구하기

                // 중요도 높은 값과 큐에서 젤 처음에 있는 숫자가 같은 경우
                if(max == Documents.peek()) {
                    // 젤 처음의 숫자가 같고 내가 찾고자하는 인덱스의 값도 같을 경우 -> 문제의 답
                    // 순번을 하나 늘리고 반복문 종료
                    if(index.poll() == m){
                        count++;
                        break;
                        // 젤 처음과 중요도 높은 숫자가 같지만 내가 찾고자 하는 인덱스의 값과 다른 경우
                        // 중요도 queue만 보내버리고 프린트 숫자를 늘리고 구하고자하는 인덱스 값 찾기 (중요도가 같은 경우)
                    }else{
                        Documents.poll();
                        count++;
                    }
                }
                // 중요도가 높은 값과 다른 경우
                // 두 개의 queue의 앞부분을 뒤에 이어붙이기 ****
                else {
                    index.offer(index.poll());
                    Documents.offer(Documents.poll());
                }
            }
            System.out.println(count);

        }
    }
}