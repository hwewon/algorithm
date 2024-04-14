package algorithm.TIL.Day14;

/*
    메모리 24816kb, 시간 384ms, 시간복잡도 O(n)

    dfs, bfs 문제

    기본적인 템플릿...
 */
import java.io.*;
import java.util.*;

public class BaekJoon_1260 {
    static int n, m, v;
    static int[][] arr;
    static boolean visited[];
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        arr= new int[n+1][n+1];     // 방문 배열
        visited = new boolean[n+1]; // 방문 여부 배열

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;  // 서로 연결
        }

        dfs(v);
        
        System.out.println();

        // 방문여부 배열 다 false로 초기화
        Arrays.fill(visited, false);

        bfs(v);

    }

    // 재귀
    public static void dfs(int start){
        visited[start] = true;
        System.out.print(start + " ");

        for(int i=1; i<=n; i++){
            if(arr[start][i] == 1 && visited[i] == false){
                dfs(i);
            }
        }
    }

    // queue
    public static void bfs(int start){
        q.offer(start);
        visited[start] = true;
        System.out.print(start + " ");

        while(!q.isEmpty()){
            int tmp = q.poll();

            for(int i=1; i<arr.length; i++){
                if(arr[tmp][i] == 1 && visited[i] == false){
                    q.offer(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}
