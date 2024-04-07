package algorithm.TIL.Day8;

/*
    메모리 14452kb, 시간 132ms, 시간복잡도 O(n log n)

    정렬의 시간복잡도는 평균적으로 시간복잡도 O(n log n)

    정렬 문제

    정렬하여 각 사람이 자신의 순서에 돈을 인출할 때까지 필요한 시간(tmp)를 구하고
    그 시간들의 총 합을 구함
    최솟값을 구하기 위해서는 각 사람들의 인출 시간들이 최솟값이 되어야한다.
    그러기 위해서 정렬을 통해 수들을 정렬해줌
 */
import java.io.*;
import java.util.*;

public class BaekJoon_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 각 걸리는 시간 저장
        for(int i=0; i<n; i++){
            int p = Integer.parseInt(st.nextToken());

            arr[i] = p;
        }

        // 정렬
        Arrays.sort(arr);

        // tmp에 각 사람들이 인출할 때 걸리는 총 시간 임시 저장
        int result = 0;
        int tmp = 0;

        // tmp 값을 이용해 각 사람들이 인출하는데 필요한 시간의 총 합 구하기
        for(int i=0; i<arr.length; i++){
            tmp += arr[i];
            result += tmp;
        }

        System.out.println(result);
    }
}
