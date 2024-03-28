package algorithm.TIL.Day2;

import java.io.*;
import java.util.*;

public class BaekJoon_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().trim().split(" "); // 양쪽 여백 없애고 " "를 구분하여 넣기

        if(arr[0].equals("")){          // split을 쓸 경우 빈 공백이 배열에 들어가 공백이 입력될 경우 1이 반환
            System.out.println(0);
        }else{
            System.out.println(arr.length);
        }
    }
}
