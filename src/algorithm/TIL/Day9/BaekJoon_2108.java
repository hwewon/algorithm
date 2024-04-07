package algorithm.TIL.Day9;

/*
    메모리 65596kb, 시간 652ms, 시간복잡도 O(n log n)

    통계 문제
    1. 산술평균 : N개의 수들의 합을 N으로 나눈 값
    2. 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
    3. 최빈값 : N개의 수들 중 가장 많이 나타나는 값
    4. 범위 : N개의 수들 중 최댓값과 최솟값의 차이

    산술평균, 중앙값과 범위는 배열과 변수를 통해 구하기
    최빈값은 map에 key와 value값을 넣고
    PriorityQueue를 통해 comparator를 커스텀하여 map의 value으로 정렬하여 출력하기
*/

import java.io.*;
import java.util.*;

public class BaekJoon_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();

        // 총 합 저장
        int sum = 0;

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            // 산술평균에 쓰일 총합
            sum += num;
            // 중앙값과 수들의 범위에 쓰일 배열에 저장
            arr[i] = num;
            // 최빈값에 쓰일 map 저장(value)
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 중앙값과 수들의 범위를 구하기 위해 배열 정렬
        Arrays.sort(arr);

        // 1. 산술평균(소수 첫째자리 반올림을 위해 Math.round를 사용
        System.out.println(Math.round((double)sum / n));

        // 2. 배열의 중앙값
        System.out.println(arr[n/2]);

        // 최빈값을 구하기 위해 PriorityQueue 사용
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                // HashMap에서 각 수의 value값으로 정렬하기
                // value값이 같을 경우에는 수의 크기대로 정렬
                int Compare = map.get(b).compareTo(map.get(a));
                if (Compare == 0)
                    return a - b;
                return Compare;
            }
        });

        // pq에 모든 값 넣기
        pq.addAll(map.keySet());

        // 하나만 입력될 경우
        if(map.size() == 1){
            System.out.println(pq.poll());
        // 하나 이상일 경우 & 최빈값이 여러 개 있을 경우
        } else {
            // 정렬되어있는 pq에서 첫번째랑 두번째를 꺼내서 비교하기
            // 두 개의 value값이 같을 경우는 두 번째로 작은 값을 출력해야하므로 second를 출력
            // 같지 않을 경우에는 최빈값 출력하게 설정
            int first = pq.poll();
            int second = pq.poll();
            if (map.get(first) == map.get(second)) {
                System.out.println(second);
            } else {
                System.out.println(first);
            }
        }

        // 4. 각 수들의 범위를 출력
        System.out.println(arr[n-1] - arr[0]);
    }
}