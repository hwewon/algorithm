package algorithm;
// 백준 2439번 - 브론즈5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for(int i=0; i<a; i++){
            for(int j=0; j<a-(i+1); j++){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
