package algorithm.TIL.Day6;

// 메모리 14376kb, 시간 136ms

/*
    VPS(올바른 괄호 문자열) - stack문제
    '('일 경우 스택에 넣고 ')'일 경우 pop을 하여
    스택이 비어있는지 여부에 따라 true, false로 반환
    ')',')' 연속으로 나올 케이스도 따로 생각해서 처리 -> 스택안에 '('가 더이상 없을 경우 false를 반환시킨다.
 */

import java.io.*;
import java.util.*;

public class BaekJoon_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n;i++){
            Stack<Character> stack = new Stack();

            String str = br.readLine();

            // vps인지 검증
            boolean vps = true;

            // 입력받은 문자열길이만큼 반복문 실행
            for(int j=0; j<str.length(); j++){
                // 문자열을 문자로 쪼개 해당 문자가 '('일 경우 스택에 넣어준다
                if(str.charAt(j) == '('){
                    stack.push(str.charAt(j));
                // 문자열이 ')'일 경우 스택에 있는 '('를 빼주기
                }else{
                    // 스택에 '('의 문자가 없을 경우 vps의 조건에 불만족하므로 false 반환
                    if(stack.isEmpty()){
                        vps = false;
                        break;
                    }
                    stack.pop();
                }
            }
            // 스택에 값이 남아있을 경우 vps 조건 불만족이므로 false 반환
            if(!stack.isEmpty()){
                vps = false;
            }
            System.out.println(vps ? "YES" : "NO");
        }

    }
}
