package algorithm.TIL.Day1;

import java.io.*;
import java.util.*;

public class BaekJoon_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a  = Integer.parseInt(br.readLine());

        for(int i=0; i<a; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            int b = Integer.parseInt(st.nextToken());
            String c = st.nextToken();
            char[] ch = c.toCharArray();            // String타입을 char타입 배열로 넣기

            for(int j=0; j<ch.length; j++){
                for(int k=0; k<b; k++){
                    System.out.print(ch[j]);
                }
            }
            System.out.println();
        }
    }
}