package algorithm.TIL.Day12_plus;

/*
    메모리 24332kb, 시간 252ms, 시간 복잡도 O(n)
    
    Stack 문제
    
    0보다 크면 push, 0이면 pop하고 stack안에 있는 수 총 합
 */

import java.io.*;
import java.util.*;

public class BaekJoon_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        int sum = 0;

        for(int i=0; i<k; i++){
            int a = Integer.parseInt(br.readLine());

            if(a > 0){
                stack.push(a);
            }else{
                stack.pop();
            }

        }

        while(!stack.isEmpty()){
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}
