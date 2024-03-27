package algorithm.BaekJoon;
// 백준 5543번 - 브론즈4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());

        int f = 0;

        if(a<b){
            if(a<c){
                f = a;
            }else{
                f = c;
            }
        }else{
            if(b<c){
                f = b;
            }else{
                f = c;
            }
        }

        int g = Math.min(d, e);

        int result = (f+g) - 50;

        System.out.println(result);
    }
}
