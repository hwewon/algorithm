package algorithm.TIL.Day6;

/*
    메모리 17680kb, 시간 3688ms

    Stack문제

    탑의 높이를 스택에 넣고 peek로 조회하기 -> 비교하여 값 출력
*/
import java.io.*;
import java.util.*;

public class BaekJoon_2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 탑의 번호와 높이를 저장할 스택
        Stack<int[]> stack = new Stack<>();

        for(int i=1; i<=n; i++){
            // 현재 탑의 높이
            int top = Integer.parseInt(st.nextToken());

            // 스택이 비어있지 않을 경우
            while(!stack.isEmpty()){
                // 스택의 가장 위의 탑의 높이가 현재의 탑보다 높은 경우
                // 그 해당 탑의 번호를 출력하고 종료
                if(stack.peek()[1] >= top) {
                    System.out.print(stack.peek()[0] + " ");
                    break;
                }
                // 해당 탑의 번호를 꺼내고 다음 탑의 높이 비교
                stack.pop();
            }
            // 스택이 비어있으면 탑이 없으므로 0 출력
            if(stack.isEmpty()){
                System.out.print("0 ");
            }
            // 현재 탑의 번호와 높이를 스택에 저장
            stack.push(new int[] {i, top});
        }
    }
}
