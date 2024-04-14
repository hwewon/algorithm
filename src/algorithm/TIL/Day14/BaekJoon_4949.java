package algorithm.TIL.Day14;

/*
    메모리 20348kb, 시간 320ms, 시간복잡도 O(n)

    Stack 문제


 */

import java.io.*;
import java.util.*;

public class BaekJoon_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str = br.readLine();

            if(str.equals(".")){
                break;
            }

            Stack<Character> stack = new Stack<>();
            boolean check = true;

            // 각 한 문자씩 저장
            for(char c : str.toCharArray()){
                // '(' 나 '[' 나오면 스택에다가 추가
                if(c == '(' || c == '['){
                    stack.push(c);
                // ')' 일 경우 스택이 비어있지않고 스택의 맨 위의 요소가 '('일 경우
                // 스택에서 제거    
                }else if(c == ')'){
                    if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    // 아닐 경우 옳지 않으므로 false 반환하고 종료    
                    }else{
                        check = false;
                        break;
                    }
                // ']' 일 경우 스택이 비어있지않고 스택의 맨 위의 요소가 ']'일 경우
                // 스택에서 제거    
                }else if(c == ']'){
                    if(!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    }else{
                        check = false;
                        break;
                    }
                }
            }
            
            // check가 올바르고 스택이 비어있으면 괄호가 짝이 맞으므로 yes 출력
            if(check && stack.isEmpty()){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }


    }
}