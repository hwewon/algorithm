package algorithm.TIL.Day2;

import java.io.*;
import java.util.*;

public class BaekJoon_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String a = st.nextToken();      // Integer타입 대신 String타입으로 받기
        String b = st.nextToken();

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        char tmp1;
        char tmp2;

        for(int i=0; i<a.length(); i++){       // 입력받은 숫자를 쪼개서 문자로 Stack에 쌓기
            char char1 = a.charAt(i);
            stack1.push(char1);
        }
        for(int i=0; i<a.length(); i++){
            char char2 = b.charAt(i);
            stack2.push(char2);
        }

        ArrayList<Character> arr1 = new ArrayList<>();
        ArrayList<Character> arr2 = new ArrayList<>();

        while(!stack1.isEmpty()){       // Stack의 값을 list에 재정렬
            tmp1 = stack1.pop();
            arr1.add(tmp1);
        }
        while(!stack2.isEmpty()){
            tmp2 = stack2.pop();
            arr2.add(tmp2);
        }

        StringBuilder sb1 = new StringBuilder();        // list를 다시 StringBuilder를 이용하여 이어붙이기
        for(char c : arr1){
            sb1.append(c);
        }
        StringBuilder sb2 = new StringBuilder();
        for(char c : arr2){
            sb2.append(c);
        }

        int result1 = Integer.parseInt(sb1.toString());     // 이어 붙인 문자들을 Integer타입으로 변환
        int result2 = Integer.parseInt(sb2.toString());

        System.out.println(Math.max(result1, result2));     // 변환된 두개의 값을 비교하여 최대값을 출력
    }
}
