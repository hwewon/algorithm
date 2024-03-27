package algorithm.BaekJoon;
// 백준 2839번 - 실버4

import java.io.*;
import java.util.*;

public class BaekJoon_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int count = 0;

        while(true){
            if(a%5 == 0){
                count += a/5;
                System.out.println(count);
                break;
            }else{
                a -= 3;
                count++;
            }
            if(a <0){
                System.out.println("-1");
                break;
            }
        }

    }
}
