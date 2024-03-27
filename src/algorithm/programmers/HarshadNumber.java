package algorithm.programmers;

import java.io.*;
import java.util.*;

public class HarshadNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        int a = x;
        int result = 0;

        boolean answer;

        while(a != 0){
            result += a%10;
            a = a/10;
        }

        if(x % result == 0){
            answer = true;
        }else{
            answer = false;
        }

        System.out.println(answer);

    }
}

