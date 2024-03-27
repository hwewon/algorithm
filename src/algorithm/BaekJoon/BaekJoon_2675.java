package algorithm.BaekJoon;
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

            int b = Integer.parseInt(st.nextToken());
            String c = st.nextToken();

            for(int j=0; j<c.length(); j++){
                for(int k=0; k<b; k++){
                    System.out.print(c.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
