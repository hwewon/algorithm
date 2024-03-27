package algorithm.BaekJoon;
// 백준 2562번 - 브론즈3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        int temp = 0;
        int max = 0;
        int num = 0;

        for(int i=0; i<9; i++){
            int a = Integer.parseInt(br.readLine());
            arr[i] = a;
        }

        for(int i=0; i<9; i++){
            temp = arr[i];

            if(temp > max) {
                max = temp;
                num = i+1;
            }

        }
        System.out.println(max);
        System.out.println(num);
    }
}
