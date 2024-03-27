package algorithm.BaekJoon;
// 백준 2525번 - 브론즈3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());

        int result1 = 0;
        int result2 = 0;
        int temp = 0;

        if(b+c >= 60){
            temp = (b+c) / 60;
            result1 = a + temp;
            result2 = (b+c) - temp*60;
            if(result1 >= 24){
                result1 = result1 % 24;
            }
            System.out.printf(result1 + " " + result2);

        }else {
            result1 = a;
            result2 = b+c;
            System.out.printf(result1 + " " + result2);
        }

    }
}
