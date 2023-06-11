package algorithm;
// 백준 2884번 - 브론즈 3

import java.io.*;
import java.util.*;

public class BaekJoon_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();

        StringTokenizer st = new StringTokenizer(a," ");

        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if(c < 45){
            b--;
            c = 60 - (45-c);
            if(b < 0){
                b = 23;
            }
            System.out.println(b + " " + c);
        }
        else {
            System.out.println(b + " " + (c - 45));
        }
    }
}
