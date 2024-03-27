package algorithm.BaekJoon;
// 백준 3052번 - 브론즈2


import java.io.*;
import java.util.*;

public class BaekJoon_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        int count = 0;
        int j;

        for(int i=0; i<10; i++){
            int a = Integer.parseInt(br.readLine());

            arr[i] += a%42;
            for(j=0; j<10; j++){
                if(arr[i] == arr[j]){
                    break;
                }
            }
            if(i == j){
                count++;
            }
        }
        System.out.println(count);

    }
}
