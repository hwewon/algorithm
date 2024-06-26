package algorithm.BaekJoon;
// 백준 15552번 - 새싹

import java.io.*;
import java.util.*;

public class BaekJoon_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        for(int i=0; i<a; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
