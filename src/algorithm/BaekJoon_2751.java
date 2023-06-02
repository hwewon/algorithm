package algorithm;
// 백준 2751번 - 실버 5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BaekJoon_2751 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int a = Integer.parseInt(br.readLine());
//
//        int[] arr = new int[a];
//
//        for(int i=0; i<a; i++){
//            arr[i] += Integer.parseInt(br.readLine());
//        }
//
//        Arrays.sort(arr);
//
//        for(int i=0; i<a; i++){
//            System.out.println(arr[i]);
//        }         ==> Arrays.sort 시간복잡도로 인해 시간초과

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<a; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for(int c : list){
            sb.append(c).append('\n');
        }
        System.out.println(sb);
    }
}
