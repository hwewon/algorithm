package algorithm.TIL.Day10;

import java.io.*;
import java.util.*;

public class Test {
    static int count = 1;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());   // 정점
        int m = Integer.parseInt(st.nextToken());   // 간선
        int r = Integer.parseInt(st.nextToken());   // 시작 정점

        result = new int[n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 무방향 그래프이므로 두 정점에 다 추가
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        bfs(r);

        for (int i = 1; i <= n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int current = q.poll();
            result[current] = count++;

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
