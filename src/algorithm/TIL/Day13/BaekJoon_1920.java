package algorithm.TIL.Day13;

/*
    메모리 56452kb, 시간 1384ms, 시간복잡도 O(n + m)
 */

import java.io.*;
import java.util.*;

public class BaekJoon_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr1 = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());

        int[] arr2 = new int[m];

        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<m; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        // HashMap에 첫번쨰 배열의 수들을 저장
        for(int num : arr1){
            map.put(num, 1);
        }

        for(int num : arr2){
            // HashMap에 있는 수중에 두번째 배열의 수랑 같은 값이 있다면 1 출력, 아니면 0 출력
            if(map.containsKey(num)){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
    }
}
