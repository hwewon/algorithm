package algorithm.TIL.Day5;

// 메모리 14320kb, 시간 124ms

import java.io.*;
import java.util.*;

public class BaekJoon_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[][] matrix = new boolean[50][50];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for(int j=0; j<m; j++){
                matrix[i][j] = (str.charAt(j) == 'W');  // 'W'는 true, 'B'는 false
            }
        }

        // 체스판 검증하기 위한 변수
        int chessRow = n-7;
        int chessCol = m-7;

        int answer = 64;        // 최악의 수

        for(int i=0; i<chessRow; i++){
            for(int j=0; j<chessCol; j++){

                answer = Math.min(answer, solve(matrix, i, j));
            }
        }
        System.out.println(answer);
    }

    public static int solve(boolean[][] matrix, int x, int y){
        int chessX = x+8;       // 8*8 체스판으로만 검사해야돼서 +8
        int chessY = y+8;

        int count = 0;

        boolean curColor = matrix[x][y];

        // 색상이 다를 경우 count를 1개 올리고
        // 다음 색상과 비교하기 위해 true -> false로 바꿔줌
        for(int i=x; i<chessX; i++){
            for(int j=y; j<chessY; j++){
                if(matrix[i][j] != curColor){
                    count++;
                }
                curColor = (!curColor);
            }
            curColor = (!curColor);     // 행이 끝나고 다음 행의 색상을 바꿔줌
        }

        // 색상을 효율적으로 바꾸기 위해 count와 최악의 경우의 수 - count를 비교하여 최소값을 반환
        return Math.min(count, 64-count);
    }
}