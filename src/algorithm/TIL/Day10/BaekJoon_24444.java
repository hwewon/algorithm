package algorithm.TIL.Day10;

/*
    메모리 102616kb, 시간 2020ms, 시간복잡도 O(n log n)

    BFS 문제
 */

import java.io.*;
import java.util.*;

public class BaekJoon_24444 {
    static int count = 1; // 방문 순서 기록
    static ArrayList<ArrayList<Integer>> graph  = new ArrayList<>(); // 인접리스트 생성
    static boolean[] visited;   // 방문 여부 boolean 배열
    static int[] result;    // 방문 순서 기록 배열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());   // 정점
        int m = Integer.parseInt(st.nextToken());   // 간선
        int r = Integer.parseInt(st.nextToken());   // 시작 정점

        result = new int[n + 1];
        visited = new boolean[n + 1];

        // 인접 리스트 초기화하기
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }

        // 입력받고 무방향 그래프이므로 두 정점을 연결시켜주기
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 무방향 그래프이므로 두 정점에 다 추가
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        //BFS 실행
        bfs(r);

        for (int i = 1; i <= n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;      // 현재 방문한 정점을 true로 바꿔주기

        while (!q.isEmpty()) {
            int current = q.poll();
            result[current] = count++;  // count를 통해 방문 순서를 기록해주기

            Collections.sort(graph.get(current));

            for (int next : graph.get(current)) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.offer(next);
                }
            }
        }
    }
}
