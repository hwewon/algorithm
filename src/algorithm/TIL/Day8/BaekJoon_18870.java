package algorithm.TIL.Day8;

/*
    메모리 272772kb, 시간 2064ms, 시간복잡도  O(n log n)

    정렬, 탐색 문제
    좌표 배열과 정렬된 배열 2개를 만들어 정렬된 배열을
    map에 넣어 좌표를 key로, 순서를 value로 갖게 만들어준다.
    map의 구하고자하는 좌표를 넣었을 때 그것이 갖는 value를 출력해준다.

    시간 초과로 BufferedWriter 사용
*/

import java.io.*;
import java.util.*;

public class BaekJoon_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // 좌표 배열
        int[] arr1 = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        // 좌표를 받은 배열을 clone하여 정렬
        int[] arr2 = arr1.clone();

        Arrays.sort(arr2);

        Map<Integer, Integer> map = new HashMap<>();

        int idx = 0;

        for(int i : arr2){
            if(!map.containsKey(i)){
                map.put(i, idx++);
            }
        }

        for(int i : arr1){
            bw.write(map.get(i) + " ");
        }

        bw.flush();
        bw.close();
    }
}
