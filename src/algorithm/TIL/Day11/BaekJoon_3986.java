package algorithm.TIL.Day11;

/*
    메모리 22124kb, 시간 328ms, 시간복잡도 O(n*m)

    Stack 문제 (좋은 단어)

    ABAB x
    AABB ㅇ
    ABBA ㅇ

    풀이 - 각 문자를 스택에 넣고 스택의 문자와 다음 문자를 비교한다.
    만약 같은 문자라면 pop을 시킨다.
    스택이 비어있다면 문자를 push해준다
    ex) ABAB인 경우
            처음 A는 스택이 비어있으므로 push
            다음 B 입력시 스택이 비어있지 않고 스택의 문자가 A이므로 둘이 다른 문자 -> 아무것도 안함 -> 스택에 A만 남아있음
            다음 A 입력시 스택이 비어있지 않고 스택의 문자가 A이므로 둘이 같은 문자 -> 스택에 있는 A를 pop 시킴 -> 스택에 아무것도 없음
            다음 B 입력시 스택이 비어있으므로 B를 스택에 push
            결론 -> 스택에 B가 남아있으므로 좋은 단어가 아님
        AABB인 경우
            처음 A는 스택이 비어있으므로 push
            다음 A 입력시 스택이 비어있지 않고 스택의 문자가 A이므로 둘이 같은 문자 -> 스택에 있는 A를 pop 시킴 -> 스택에 아무것도 없음
            다음 B 입력시 스택이 비어있으므로 B를 스택에 push
            다음 A 입력시 스택이 비어있지 않고 스택의 문자가 B이므로 둘이 같은 문자 -> 스택에 있는 B를 pop 시킴 -> 스택에 아무것도 없음
            결론 -> 스택에 아무것도 남아있지않으므로 좋은 단어가 맞음
 */

import java.io.*;
import java.util.*;

public class BaekJoon_3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int count = 0;

        for(int i=0; i<n; i++){
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();

            for(int j=0; j<str.length(); j++){
                if(!stack.isEmpty() && stack.peek() == str.charAt(j)) {
                    stack.pop();
                } else {
                    stack.push(str.charAt(j));
                }
            }

            if(stack.isEmpty()){
                count++;
            }

        }
        System.out.println(count);
    }
}
