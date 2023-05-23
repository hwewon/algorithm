package algorithm;
// 백준 10952번 - 새싹

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;

        while((str = br.readLine()) != null){
            st = new StringTokenizer(str, " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a==0 && b==0){
                break;
            }

            System.out.println(a+b);
        }
    }
}
