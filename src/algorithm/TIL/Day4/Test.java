package algorithm.TIL.Day4;

import java.io.*;
import java.util.*;

/* 펠린드롬의 수 특징
    모든 문자의 개수가 짝수인 경우 => 가능
    한 문자를 제외하고 모든 문자의 개수가 짝수인 경우 => 가능
    모든 문자의 개수가 짝수가 아닌 경우 => 불가능
 */

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] count = new int[26]; // 알파벳 개수를 세기 위한 배열

        // 문자열에서 각 알파벳의 수 저장
        for (char ch : str.toCharArray()) {
            count[ch - 'A']++;
        }

        StringBuilder result1 = new StringBuilder();
        String oddChar = "";                    // 홀수의 문자 저장

        // 각 알파벳의 개수를 통해 팰린드롬을 생성
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 == 1) { // 홀수 개의 알파벳이 있을 경우
                if (!oddChar.equals("")) { // 이미 홀수 개의 알파벳이 있는 경우
                    System.out.println("I'm Sorry Hansoo");
                    return;
                }
                oddChar = String.valueOf((char) (i + 'A'));     // 홀수의 알파벳 저장
            }
            for (int j = 0; j < count[i] / 2; j++) {
                result1.append((char) (i + 'A'));       // 알파벳의 개수의 절반을 앞부분에 추가 => 펠린드롬의 수 앞부분
            }
        }

        StringBuilder result2 = new StringBuilder(result1);     // 뒷부분 추가할 곳
        if (!oddChar.equals("")) {                // 홀수의 알파벳이 있는 경우 홀수의 알파벳을 중간에 배치
            result2.append(oddChar);
        }
        result2.append(result1.reverse());        // 나머지 부분을 반대로 만들어 이어붙이기

        System.out.println(result2);

    }
}


