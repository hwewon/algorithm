package algorithm.BaekJoon;
// 백준 10950번 - 새싹

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int result = 0;

        for(int i=0; i<a; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            result = b+c;
            System.out.println(result);
        }

    }
}
