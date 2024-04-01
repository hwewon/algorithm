package algorithm.TIL.Day5;

// 메모리 16100kb, 시간 148ms

import java.io.*;
import java.util.*;

public class BaekJoon_1652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        boolean[][] condo = new boolean[101][101];

        // .일경우 true 다를경우 false
        for(int i=0; i<a; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            for(int j=0; j<a; j++){
                char c = str.charAt(j);
                if(c == '.'){
                    condo[i][j] = true;
                }else{
                    condo[i][j] = false;
                }
            }
        }

        int xCount = 0;
        int seat = 0;       // 좌리 수 저장
        for(int i=0; i<a; i++){
            seat = 0;
            // 연속된 경우 좌석을 더하고 좌석이 2개일 경우 ++하고
            // x를 만나면 seat값을 다시 초기화
            for(int j=0; j<a; j++){
                if(condo[i][j]){
                    seat++;
                }else{
                    if(seat>=2){
                        xCount++;
                    }
                    seat = 0;
                }
            }
            // 배열을 마지막까지 돌았을 경우의 수
            if(seat >= 2){
                xCount++;
            }
        }

        int yCount = 0;
        for(int j=0; j<a; j++){
            seat = 0;
            for(int i=0; i<a; i++){
                if(condo[i][j]){
                    seat++;
                }else{
                    if(seat>=2){
                        yCount++;
                    }
                    seat = 0;
                }
            }
            if(seat >= 2){
                yCount++;
            }
        }
        System.out.println(xCount + " " + yCount);
    }
}

