package algorithm.TIL.Day6;

import java.io.*;
import java.util.*;

public class Day6_Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");

        String[] strArr = new String[8];

        for(int i=0; i<8; i++){
            String str = st.nextToken();

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
