package algorithm.TIL.Day8;

/*
    메모리 119436kb, 시간 552ms, 시간복잡도 O(n log m)

    이분 탐색(Binary Search) 문제

    랜선 자르기 문제는 자른 랜선을 가져가지만 나무 자르기 문제는 자르고 난 뒤의 위의 나무를 가져가는 방식
    적어도 M미터의 나무를 가져아야하는데 자르고 난 뒤의 위의 나무를 가져가게 되니
    고려해서 문제를 풀어야함
 */

import java.io.*;
import java.util.*;

public class BaekJoon_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 나무의 수와 나무의 길이 저장
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 가장 높은 나무의 높이
        int max = Arrays.stream(arr).max().orElseThrow();

        int start = 0;
        int end = max;

        while(start <= end){
            // 나무의 중간 높이
            int mid = (start + end) / 2;

            // 중간 높이로 잘랐을 때의 나무의 길이 총합
            long sum = 0;
            for(int i=0; i<n; i++){
                // 중간높이보다 현재의 높이가 높을때만
                // 잘라서 얻는 위의 부분의 길이를 구해야함
                if (arr[i] > mid) {
                    // 위의 부분을 가져가게 되므로 현재 높이에서 중간 높이를 빼줘야함
                    sum += arr[i] - mid;
                }
            }

           // 잘린 나무의 길이의 총합이 필요한 나무의 길이보다 크거나 같을 경우
           // 중간 높이를 올려주어서 필요한 나무의 길이에 맞게 설정해줘야함
           if(sum >= m){
               // 중간 높이보다 1 높게 잡아서 시작점을 높여주어야함
                start = mid + 1;
           // 잘린 나무의 길이의 총합이 필요한 나무의 길이보다 작을 경우
            }else{
               // end포인트를 더 낮춰서 중간 높이를 다시 설정
                end = mid - 1;
            }
        }

        System.out.println(end);
    }
}

//            long sum = Arrays.stream(arr)
//                    .filter(tree -> tree > mid)
//                    .map(tree -> tree - mid)
//                    .sum();