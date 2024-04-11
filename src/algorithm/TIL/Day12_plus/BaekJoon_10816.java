package algorithm.TIL.Day12_plus;

/*
    메모리 173816kb, 시간 1136ms, 시간 복잡도 O(n+m)
    
    HashMap
    
    중복된 수가 있을 경우 map의 value를 증가시켜 
    다음 입력 떼 수들의 중복 수를 구하기
 */

import java.io.*;
import java.util.*;

public class BaekJoon_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> map = new HashMap();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n; i++){
            int a = Integer.parseInt(st.nextToken());

            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<m; i++){
            int num = Integer.parseInt(st.nextToken());

            bw.write(map.getOrDefault(num, 0) + " ");
        }

        bw.flush();
        bw.close();
    }
}
