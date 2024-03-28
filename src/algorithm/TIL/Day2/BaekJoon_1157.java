package algorithm.TIL.Day2;

import java.io.*;
import java.util.*;

public class BaekJoon_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().toUpperCase(), " ");

        String str = st.nextToken();

        HashMap<Character, Integer> map = new HashMap<>();

        // 문자열을 문자로 쪼개서 각 문자의 갯수와 함께 HashMap에 저장
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            map.put(c, map.getOrDefault(c, 0) + 1); // 값이 없을 경우 기본값 0 설정
        }

        int resultNum = 0;
        char result = ' ';

        // key값으로 순회할 Iterator 생성
        Iterator<Character> keys = map.keySet().iterator();

        while(keys.hasNext()){          // Iterator에서의 key값들로 반복문
            char ch = keys.next();      // 순회하는 Iterator의 key값 ch에 저장
            int value = map.get(ch);    // ch의 키를 갖는 value값

            if(value > resultNum){
                resultNum = value;      // 반복문을 돌면서 가장 중복된 숫자 찾기
                result = ch;            // 해당 key값을 result에 저장
            }else if(value == resultNum){
                result = '?';           // 중복된 숫자가 하나 더 있으면 result에 '?' 저장
            }
        }

        System.out.println(result);

    }
}

//        for(char k : map.keySet()){
//            int value = map.get(k);
//
//            if(value > resultNum){
//                resultNum = value;
//                result = k;
//            }else if(value == resultNum){
//                result = '?';
//            }
//        }