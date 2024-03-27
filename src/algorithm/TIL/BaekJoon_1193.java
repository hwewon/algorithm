package algorithm.TIL;

import java.io.*;
import java.util.*;

public class BaekJoon_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int cnt = 0;
        int sum = 0;;

        while(a > sum){
            cnt ++;
            sum += cnt;
        }

        int b = sum - cnt + 1;

        if(cnt%2 == 0){
            System.out.println("/" + cnt);
        }else{
            System.out.println(cnt + "/");
        }

    }
}

