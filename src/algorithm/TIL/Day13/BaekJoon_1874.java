package algorithm.TIL.Day13;

/*
    메모리 27268kb, 시간 372ms, 시간복잡도 O(n)

    Stack문제


 */

import java.io.*;
import java.util.*;

public class BaekJoon_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int current = 0;

        for(int i=0; i<n; i++){
            int a = Integer.parseInt(br.readLine());

            // 입력한 숫자가 스택의 맨 위의 숫자보다 클 때
            // push 해주기
            if(a > current){
                for(int j=current + 1; j<=a; j++){
                    stack.push(j);
                    sb.append("+\n");
                }
                current = a;
            // 입력한 숫자가 스택의 맨 위의 숫자보다 작을 때
            // pop 해주기
            } else{
                if(stack.peek() != a){
                    System.out.println("NO");
                    return;
                }
            }
            stack.pop();
            sb.append("-\n");
        }


        System.out.println(sb);

    }
}
