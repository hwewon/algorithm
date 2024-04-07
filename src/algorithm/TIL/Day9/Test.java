package algorithm.TIL.Day9;

/*
    메모리 65596kb, 시간 652ms, 시간복잡도 O(n log n)

    통계 문제
    1. 산술평균 : N개의 수들의 합을 N으로 나눈 값
    2. 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
    3. 최빈값 : N개의 수들 중 가장 많이 나타나는 값
    4. 범위 : N개의 수들 중 최댓값과 최솟값의 차이
 */

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            sum += num;
            arr[i] = num;
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Arrays.sort(arr);

        System.out.println(Math.round((double)sum / n));

        System.out.println(arr[n/2]);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.addAll(map.keySet());

        if(map.size() == 1){
            System.out.println(pq.poll());
        } else {
            int first = pq.poll();
            int second = pq.poll();
            if (map.get(first) == map.get(second)) {
                System.out.println(second);
            } else {
                System.out.println(first);
            }
        }

        System.out.println(arr[n-1] - arr[0]);
    }
}
