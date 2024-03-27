package algorithm.programmers;

import java.io.*;
import java.util.*;

public class test2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<a; i++){
            int b = Integer.parseInt(br.readLine());

            if(b == 0){
                stack.pop();
            }else {
                stack.push(b);
            }
        }

        while (!stack.isEmpty()){
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}
