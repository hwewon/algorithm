package algorithm.TIL.Day13;

/*
    메모리 44712kb, 시간 560ms, 시간복잡도 O(nlogn)


 */

import java.io.*;
import java.util.*;

public class BaekJoon_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] time = new int[n][2];   // 시작 시간과 끝나는 시간 배열 만들기

        StringTokenizer st;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            time[i][0] = Integer.parseInt(st.nextToken());  // 시작 시간
            time[i][1] = Integer.parseInt(st.nextToken());  // 끝나는 시간
        }

        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                // 끝나는 시간이 같을 경우 시작 시간이 빠른 순으로 정렬
                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                
                // 끝나는 시간 빠른 순 정렬
                return o1[1] - o2[1];
            }
        });
        
        // 회의 가능한 횟수
        int cnt = 0;
        // 전 강의 끝나는 시간
        int end = 0;

        for(int i=0; i<n; i++){
            // 강의 끝나는 시간이 다음 강의 시작시간과 같거나 더 이른 경우
            if(end <= time[i][0]){
                // 해당 강의의 끝나는 시간을 전 강의 끝나는 시간으로 넣고 회의 횟수 증가
                end = time[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
