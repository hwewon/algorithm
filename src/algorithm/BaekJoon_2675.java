package algorithm;
// 백준 2675번 - 브론즈 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for(int i=0; i<a; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int b = Integer.parseInt(br.readLine());
            String c = br.readLine();

            for(int j=0; j<b; j++){
                System.out.println(c.charAt(j));
            }
            System.out.println();
        }
    }
}
