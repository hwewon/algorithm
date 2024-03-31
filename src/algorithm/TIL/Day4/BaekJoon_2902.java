package algorithm.TIL.Day4;

import java.io.*;
import java.util.*;

public class BaekJoon_2902 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        char[] first = new char[st.countTokens()];

        // 입력받은 문자열의 첫번째 문자만 name에 담아서
        // first배열에 담기
        for(int i=0; i<first.length; i++){
            char name = st.nextToken().charAt(0);

            first[i] = name;
        }

        for(int i=0; i<first.length; i++){
            System.out.print(first[i]);
        }
    }
}
