package algorithm.TIL.Day12_plus;

/*
    메모리 162868kb, 시간 3168ms, 시간 복잡도 O(n+m)

    값 비교하기

    숫자 카드 중복된 것이 있으면 1 출력 아니면 0 출력

 */

import java.io.*;
import java.util.*;

public class BaekJoon_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashSet<Integer> set = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<m; i++){
            int num = Integer.parseInt(st.nextToken());

            if(set.contains(num)){
                System.out.print("1 ");
            }else{
                System.out.print("0 ");
            }
        }

    }
}
