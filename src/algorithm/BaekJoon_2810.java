package algorithm;
// 백준 2810번 - 브론즈1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        String s = br.readLine();

        int count = 1;

        for(int i=0; i<a; i++){
            if(s.charAt(i) == 'S'){
                count += 1;
            }else if(s.charAt(i) == 'L'){
                i++;
                count += 1;
            }
        }
        System.out.println(Math.min(a, count));

    }
}