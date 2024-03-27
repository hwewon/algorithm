package algorithm.BaekJoon;
// 백준 11720번 - 브론즈4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split("");

        int sum = 0;
        for(int i=0; i<a; i++){

            sum += Integer.parseInt(arr[i]);
        }

        System.out.println(sum);
    }
}