package algorithm.programmers;

import java.io.*;
import java.util.*;

public class test1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<a; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int b = Integer.parseInt(br.readLine());

        for(int i=0; i<a; i++){
            if(arr[i] == b){
                count ++;
            }
        }

        System.out.println(count);
    }

}
