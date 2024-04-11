package algorithm.TIL.Day11;

/*
    메모리 175504kb, 시간 1112ms, 시간복잡도 O(n)

    Stack문제

    오큰수
    배열의 해당 수보다 오른쪽에 있으면서 큰 수 중에 가장 왼쪽에 있는 수
 */

import java.io.*;
import java.util.*;

public class BaekJoon_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];     // 수 저장 배열
        int[] result = new int[n]; // 정답 배열

        Stack<Integer> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<arr.length; i++){
            int a = arr[i]; // 현재 비교하고자하는 수 저장

            if(stack.isEmpty()){    // 스택이 비어있는 경우
                stack.push(i);      // 인덱스 값을 스택에 저장
                continue;
            }

            // 스택이 비어있지않고 스택의 젤 위 값이 현재 수보다 작은 경우
            while(!stack.isEmpty() && arr[stack.peek()] < a){
                result[stack.pop()] = a;        // 스택의 값을 인덱스로 갖는 result배열에 현재 수 저장
            }

            stack.push(i);  // 현재 인덱스 값을 스택에 push
        }

        // 오른쪽에 더 큰 수가 없는 경우 -1 저장
        while(!stack.isEmpty()){
            result[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(result[i] + " ");
        }
        System.out.println(sb);
    }
}
