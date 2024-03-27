package algorithm.BaekJoon;
// 백준 2475번 - 새싹

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int[] arr = new int[5];

        int sum = 0;
        int result = 0;

        for(int i=0; i<5; i++){
            arr[i] += Integer.parseInt(st.nextToken());

            sum += Math.pow(arr[i], 2);
        }

        result = sum%10;

        System.out.println(result);


    }
}
