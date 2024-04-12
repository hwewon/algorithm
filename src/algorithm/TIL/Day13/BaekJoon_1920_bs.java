package algorithm.TIL.Day13;

/*
    메모리 52960kb, 시간 1304ms, 시간복잡도 O((n + m)logn)

    이분 탐색으로 풀어본 것
 */

import java.io.*;
import java.util.*;

public class BaekJoon_1920_bs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        // 이분 탐색을 위한 정렬
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<m; i++){
            // binarySearch의 리턴값이 0이상일 경우 값이 안에 있는 것이므로 1 출력
            if(binarySearch(arr, Integer.parseInt(st.nextToken())) >= 0){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
    }


    public static int binarySearch(int[] arr, int target){
        int start = 0;              // 시작 인덱스
        int end =  arr.length - 1;  // 마지막 인덱스

        while(start <= end){
            int mid = (start+end) / 2;

            if(target == arr[mid]){
                return mid;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        
        // 타겟이 arr에 없을 경우 -1 출력
        return -1;
    }
}
