package algorithm.TIL.Day12_plus;

/*
    메모리 19044kb, 시간 364ms, 시간복잡도 O(n)

    Stack문제

    각 명령어를 String으로 받고 그거에 맞게 수행하게 만들기
 */

import java.io.*;
import java.util.*;

public class BaekJoon_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();

            if(str.equals("push")){
                stack.push(Integer.parseInt(st.nextToken()));
            }

            if(str.equals("top")){
                if(stack.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(stack.peek());
                }
            }

            if(str.equals("size")){
                System.out.println(stack.size());
            }

            if(str.equals("empty")){
                if(stack.isEmpty()){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }

            if(str.equals("pop")){
                if(stack.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(stack.pop());
                }

            }
        }

    }
}
