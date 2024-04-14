package algorithm.TIL.Day14_plus;

/*
    메모리 14172kb, 시간 120ms, 시간복잡도 O(n)


 */

import java.io.*;
import java.util.*;

public class BaekJoon_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[8];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean ascending = true;
        boolean descending = true;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1] > arr[i]){
                descending = false;
            }else if(arr[i+1] < arr[i]){
                ascending = false;
            }
        }

        if(ascending){
            System.out.println("ascending");
        }else if(descending){
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }

    }
}
