package algorithm.TIL.Day14;

import java.io.*;
import java.util.*;

public class BaekJoon_2178 {
    static int n, m;
    static int[][] map;
    static boolean[][] visited;
    static int cnt = 1;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];

        String str;

//        for(int i=0; i<n; i++){
//            str =
//        }

    }
}
