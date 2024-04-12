package algorithm.TIL.Day13;

/*
    다시 풀어볼 것
 */

import java.io.*;
import java.util.*;

public class BaekJoon_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), "-");

        int result = Integer.MAX_VALUE;

        while(st1.hasMoreTokens()){
            int tmp = 0;

            StringTokenizer st2 = new StringTokenizer(st1.nextToken(), "+");

            while(st2.hasMoreTokens()){
                tmp += Integer.parseInt(st2.nextToken());
            }

            if(result == Integer.MAX_VALUE){
                result = tmp;
            }else{
                result -= tmp;
            }
        }

        System.out.println(result);
    }
}
