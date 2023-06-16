package algorithm;
// 백준 10871번 - 새싹

import java.io.*;
import java.util.*;

public class BaekJoon_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<a; i++){
            int c = Integer.parseInt(st.nextToken());

            if(c < b){
                System.out.printf(c + " ");
            }
        }

    }
}
