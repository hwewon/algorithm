package algorithm.BaekJoon;
// 백준 2739번 - 새싹

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for(int i=0; i<1; i++){
            for(int j=1; j<10; j++){
                System.out.printf(a + " * " + j + " = " + a*j + "%n");
            }
        }
    }
}
