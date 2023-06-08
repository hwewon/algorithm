package algorithm;
// 백준 4153번 - 브론즈 3

import java.io.*;
import java.util.*;

public class BaekJoon_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a==0 && b==0 && c==0){
                break;
            }

            if(a*a + b*b == c*c){
                System.out.println("right");
            }else if(b*b + c*c == a*a){
                System.out.println("right");
            }else if(c*c + a*a == b*b){
                System.out.println("right");
            }else {
                System.out.println("wrong");
            }


        }
    }
}
