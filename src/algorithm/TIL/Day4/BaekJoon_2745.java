package algorithm.TIL.Day4;

import java.io.*;
import java.util.*;

public class BaekJoon_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String a = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        // 나중에 거꾸로 빼서 계산하기 위해 Stack 생성
        Stack<Object> stack = new Stack();

        for(int i=0; i<a.length(); i++){
            char c = a.charAt(i);   // 각 문자 c에 넣기
            int num = Character.getNumericValue(c); // 각 문자를 숫자로 변환해서 num에 넣기

            stack.push(num);    // 변환된 값을 Stack에 넣기
        }

        int result = 0;
        int n = 1;  // b의 0제곱(초기값)

        // Stack에서 차례대로 꺼내서 b의 제곱으로 곱하여 result값에 더해주기
        while(!stack.isEmpty()){
            result += ((Integer)stack.pop() * n);
            n *= b; // b를 곱하여 b의 제곱수로 만들어주기
        }

        System.out.println(result);
    }
}
