package algorithm.TIL.SecondTest;

/*
    메모리 23900kb, 시간 192ms, 시간 복잡도 O(1)

    BFS문제
 */

import java.io.*;
import java.util.*;

public class BaekJoon_1697 {
    static int[] result;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        result = new int[100001];
        visited = new boolean[100001];

        bfs(n);

        System.out.println(result[k]);
    }

    static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int current = q.poll();

            int[] move = {current-1, current+1, current*2}; // 이동 경우의 수

            for(int next : move){
                if(next >= 0 && next <= 100000 && !visited[next]){
                    visited[next] = true;   // 방문 표시
                    q.offer(next);
                    result[next] = result[current] + 1; // 현재까지의 이동횟수 + 1 저장
                }
            }
        }
    }
}
