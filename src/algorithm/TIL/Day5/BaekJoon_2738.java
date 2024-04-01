package algorithm.TIL.Day5;

// 메모리 18764kb, 시간 388ms

import java.io.*;
import java.util.*;

public class BaekJoon_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        int[][] result = new int[n][m];

        // 첫번째 배열에 값 넣기
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<m; j++){
                int a = Integer.parseInt(st.nextToken());

                arr1[i][j] = a;
            }
        }

        // 두번째 배열에 값 넣기
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<m; j++){
                int a = Integer.parseInt(st.nextToken());

                arr2[i][j] = a;
            }
        }

        // 2개의 배열의 합을 새로운 배열에 저장하고 출력
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){

                result[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
