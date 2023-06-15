package algorithm;
// 백준 2292번 - 브론즈2

import java.io.*;
import java.util.*;

public class BaekJoon_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int first = 1;
        int result = 2;

        if (a == 1){
            System.out.println(1);
        }else{
            while(result <= a){
                result = result + (6*first);
                first++;
            }
            System.out.println(first);
        }

    }
}
