package algorithm.TIL.Day5;

// 메모리 16028kb, 시간 148ms

import java.io.*;
import java.util.*;

public class BaekJoon_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int row = 0;
        int col = 0;

        // 입력받은 수와 최대값을 비교하여 수의 최대값과 해당 행과 열의 값을 저장
        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<9; j++){
                int a = Integer.parseInt(st.nextToken());

                if(a>=max){
                    max = a;
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((row+1) + " " + (col+1));

    }
}

