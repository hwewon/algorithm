package algorithm.TIL.Day6;

import java.io.*;
import java.util.*;

public class BaekJoon_3107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");

        String[] strArr = new String[8];

        Stack<String> strStack = new Stack<>();

        while(st.hasMoreTokens()){
            strStack.push(st.nextToken());
        }
        while(strStack.size() < 8){
            strStack.push("0000");
        }

        for(int i=0; i<8; i++){
            String str = st.nextToken();

            // strArr의 길이가 8개 아래일 경우 0000을 추가
            if(strArr.length < 8){
                while(strArr.length<8){
                    strStack.push(str);
                    if(strStack.isEmpty()){
                        strStack.push("0000");
                    }

                    for(int j=0; j<8; j++){
                        strArr[j] = strStack.pop();
                    }
                }
            }

            if(str.equals("")){
                strArr[i] = "0000";
                break;
            }

            while(str.length()<4){
                str = "0" + str;
            }

            strArr[i] = str;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<7; i++){
            sb.append(strArr[i]).append(":");
        }

        System.out.println(sb + strArr[7]);
    }
}
