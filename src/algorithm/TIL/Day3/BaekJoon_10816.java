package algorithm.TIL.Day3;

import java.io.*;
import java.util.*;

public class BaekJoon_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 들어온 숫자 중복 시 value값 증가
        for(int i=0; i<n; i++){
            int key1 = Integer.parseInt(st.nextToken());

            map.put(key1, map.getOrDefault(key1, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());

        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");

        // 비교할 숫자들 입력받은 후 해당 키 값이 있는 경우 value 값 출력, 없는 경우 0 출력
        for(int i=0; i<m; i++){
            int key2 = Integer.parseInt(st2.nextToken());

            bw.write(map.getOrDefault(key2, 0) + " ");
        }

        bw.flush();
        bw.close();
    }
}

