package algorithm.BaekJoon;
// 백준 2741번 - 브론즈5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for(int i=0; i<a; i++){
            System.out.println(i+1);
        }
    }
}
