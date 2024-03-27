package algorithm.BaekJoon;
// 백준 2810번 - 실버 5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon_1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int b = Integer.parseInt(br.readLine());

        int[] arr = new int[a-1];

        int count = 0;

        if(a == 1){
            count = 0;
        }else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] += Integer.parseInt(br.readLine());
            }

            while (true) {
                Arrays.sort(arr);

                if (b <= arr[arr.length - 1]) {
                    b++;
                    arr[arr.length - 1]--;
                    count++;
                } else {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}