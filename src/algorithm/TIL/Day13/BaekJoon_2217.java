package algorithm.TIL.Day13;

/*
    메모리 25200kb, 시간 340ms, 시간복잡도 O(nlogn)

    모든 로프를 안써도 되는 문장을 보지 못해서 오래 걸림..

    낮은 숫자부터 최대 수량으로 곱하여 곱한 수들 중에 최댓값

 */

import java.io.*;
import java.util.*;

public class BaekJoon_2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            int a = Integer.parseInt(br.readLine());

            arr[i] = a;
        }

        Arrays.sort(arr);

        int result = 0;

        // 젤 낮은 값일 경우 모든 로프를 사용하게 되므로 최댓값 설정
        int start = arr.length;

        for(int i=0; i<n; i++){

            // 젤 낮은 중량의 로프부터 젤 높은 중량의 로프까지 돌리기
            arr[i] = arr[i] * start;
            if(result < arr[i]){
                result = arr[i];
            }

            // 젤 높은 중량의 로프일 경우 로프 한 개만 쓰이므로 점점 사용되는 로프의 수를 줄여주기
            start --;
        }

        System.out.println(result);
    }
}
