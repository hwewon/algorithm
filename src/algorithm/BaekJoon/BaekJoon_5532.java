package algorithm.BaekJoon;
// 백준 5532번 - 브론즈4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_5532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int result = 0;

        int e = a/c;
        int f = b/d;

        if(a%c != 0){
            e++;
        }
        if(b%d != 0) {
            f++;
        }

        if(e > f){
            result = l - e;
        }else {
            result = l - f;
        }

        System.out.println(result);
    }
}
