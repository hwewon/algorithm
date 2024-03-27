package algorithm.BaekJoon;
// 백준 10989번 - 브론즈 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];

        for(int i=0; i<a; i++){
            arr[i] += Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int i=0; i<a; i++){
            st.append(arr[i]).append('\n');
        }

        System.out.println(st);
    }
}
