package algorithm.TIL.Day14_plus;

/*
    메모리 16412kb, 시간 208ms, 시간복잡도 O(n)
    
    투포인터 문제
 */

import java.io.*;
import java.util.*;

public class BaekJoon_1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int i = 0;
        int j = n-1;
        int cnt = 0;

        while(i < j){
            if(arr[i] + arr[j] < m){
                i++;
            }else if(arr[i] + arr[j] > m){
                j--;
            }else{
                cnt++;
                i++;
                j--;
            }
        }

        System.out.println(cnt);

    }
}
