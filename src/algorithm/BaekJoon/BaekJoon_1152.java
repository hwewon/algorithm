package algorithm.BaekJoon;
// 백준 1152번 - 브론즈5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//      내 풀이
//        String[] arr = br.readLine().trim().split(" ");
//
//        System.out.println(arr.length);

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        System.out.println(st.countTokens());


    }
}