package algorithm.TIL;

import java.io.*;
import java.util.*;

public class BaekJoon_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int result;

        if(a==b && b==c){                       // 오든 값이 같을 때
            result = 10000 + (a*1000);
        }else if(a == b || b == c || a == c){   // 2개의 수만 같을 떼
            if(a==b){
                result = 1000 + (a * 100);
            }else if(b==c){
                result = 1000 + (b * 100);
            }else{
                result = 1000 + (c * 100);
            }
        }else {                                 // 그 외의 경우 (다 다를 때)
            result = Math.max(a, Math.max(b,c)) * 100;
        }

        System.out.println(result);
    }
}
