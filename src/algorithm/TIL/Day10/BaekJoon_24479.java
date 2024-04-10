package algorithm.TIL.Day10;

/*
    메모리 117936kb, 시간 2124ms, 시간복잡도 O(n log n)

    DFS 문제 (무방향 그래프) - 다른 풀이 참조

    입력 받은 노드들의 연결 관계를 통해 인접 리스트를 생성하고
    인접 리스트를 통해 각 노드의 방문여부를 확인하여 결과값을 나타냄
    시작 정점 r의 각 노드들의 연결을 DFS로 풀이하고(정점 번호를 오름차순으로 방문) 방문할 수 없는 경우 0을 출력
 */

import java.io.*;
import java.util.*;

public class BaekJoon_24479 {
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

        result = new int[n+1];
        visited = new boolean[n+1];

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

        // DFS 실행
        dfs(r);

        // 결과 출력
        for(int i=1; i<=n; i++){
            System.out.print(result[i] + " ");
        }
    }

    static void dfs(int current) {
        visited[current] = true;        // 현재 방문한 정점을 true로 바꿔주기
        result[current] = count++;      // count를 통해 방문 순서를 기록해주기
        Collections.sort(graph.get(current));   // 오름차순으로 정렬

        for(int value : graph.get(current)){
            if(!visited[value]){    // 방문하지 않은 정점이 없을때까지 재귀
                dfs(value);
            }
        }
        return; // 종료
    }
}
