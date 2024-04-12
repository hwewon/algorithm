package algorithm.TIL.Day13;

import java.io.*;
import java.util.Stack;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int current = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());

            // 입력한 숫자가 스택의 맨 위의 숫자보다 클 때
            // push 해주기
            if (a > current) {
                for (int j = current + 1; j <= a; j++) {
                    stack.push(j);
                    sb.append("+\n");
                }
                current = a;
            }

            // 입력한 숫자가 스택의 맨 위의 숫자와 같을 때
            // pop 해주기
            if (a == stack.peek()) {
                stack.pop();
                sb.append("-\n");
            } else if (a < stack.peek()) {
                // 입력한 숫자가 스택의 맨 위의 숫자보다 작을 때
                // 스택에서 pop하여 입력한 숫자가 나올 때까지
                // pop 해주기
                while (!stack.isEmpty() && a < stack.peek()) {
                    stack.pop();
                    sb.append("-\n");
                }
                // 스택이 비어있거나 입력한 숫자가 스택의 맨 위의 숫자와 다른 경우
                // 주어진 수열을 만들 수 없음
                if (stack.isEmpty() || a != stack.peek()) {
                    bw.write("NO");
                    return;
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
    }
}
