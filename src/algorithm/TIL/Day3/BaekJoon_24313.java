package algorithm.TIL.Day3;

import java.io.*;
import java.util.*;

public class BaekJoon_24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 문제 변수대로 입력 받기
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());

        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        // f(n)과 g(n) 만들기
        int Fn = a1 * n0 + a0;
        int Gn = c * n0;

        // 반례로 7 -2 6 1을 넣었을 경우
        // f(n)=7n-2, g(n)=6n 되면서 n이 1인 경우 5와 6인 반환되면서
        // f(n) < g(n)이 성립됨 => 1이 출력 ==> a1이 c보다 작거나 같아야함
        if(Fn <= Gn && a1 <= c){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}