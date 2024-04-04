package algorithm.TIL.Day7;

/*
    메모리 14124kb, 시간 128ms, 시간복잡도 O(n*m)

    HashMap문제

    옷의 종류가 다른 경우에 나오는 전체 경우의 수 = (n+1) * (m+1)
    아무것도 안입었을 경우의 수도 포함되어있어 전체 경우의 수에서 1을 빼줘야한다.
    무슨 옷을 입었는지보다 무슨 종류의 옷을 입었는지가 중요

    HashMap을 통해 옷의 종류를 넣고 같은 종류일 경우 value값을 올려준다.
 */

import java.io.*;
import java.util.*;

public class BaekJoon_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 케이스 몇 번 도는지 입력 받기
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            int m = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();

            for(int j=0; j<m; j++){
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                // 무슨 옷인지는 중요하지 않으므로 쓰레기로 보내버린다.
                String trash = st.nextToken();
                // 옷의 종류를 wear에 저장
                String wear = st.nextToken();
                // 같은 종류의 옷이 있을 경우 value값을 +1 시켜줌
                map.put(wear, map.getOrDefault(wear, 0) + 1);
            }

            // 경우의 수 저장 공간
            int result = 1;

            // 가지고 있는 종류의 조합 가능한 전체의 경우의 수
            // a, b가 있을 경우 (a+1) * (b+1)이 전체 경우의 수
            for(int count : map.values()){
                count++;
                result *= count;
            }

            // 알몸인 경우는 제외시켜야하므로 -1
            System.out.println(result - 1);
        }
    }
}
