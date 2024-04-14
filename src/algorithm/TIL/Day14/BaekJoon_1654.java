package algorithm.TIL.Day14;

/*
     메모리 17280kb, 시간 192ms, 시간복잡도 O(nlogn)
     
     이진 탐색 문제

     long 타입을 사용해서 정수 오버플로우를 방지해줘야함
 */

import java.io.*;
import java.util.*;

public class BaekJoon_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[k];

        for(int i=0; i<k; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 최댓값 저장
        int max = Arrays.stream(arr).max().getAsInt();

        long start = 1;
        long end = max;

        while(start <= end){
            long mid = (start + end) / 2;
            long sum = 0;

            for(int i=0; i<k; i++){
                sum += (arr[i] / mid);
            }

            if(sum >= n){
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }

        System.out.println(end);

    }
}
