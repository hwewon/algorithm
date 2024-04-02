package algorithm.TIL.Day6;

import java.io.*;
import java.util.*;

public class BaekJoon_2615 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[19][19];

        int Bcount = 0;
        int Wcount = 0;

        for(int i=0; i<19; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<19; j++){
                int n = Integer.parseInt(st.nextToken());

                arr[i][j] = n;
            }
        }

        for(int i=0; i<19; i++){
            for(int j=0; j<19; j++){


            }
        }



    }
}
