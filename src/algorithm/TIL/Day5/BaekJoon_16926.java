package algorithm.TIL.Day5;

import java.io.*;
import java.util.*;

public class BaekJoon_16926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[x][y];

        for(int i=0; i<x; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<y; j++){
                int c = Integer.parseInt(st.nextToken());

                arr[i][j] = c;
            }
        }




    }
}
