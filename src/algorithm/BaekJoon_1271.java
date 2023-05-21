package algorithm;
// 백준 1271번 - 브론즈5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BaekJoon_1271 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger n = new BigInteger(st.nextToken());  // long, int 범위 벗어나므로 BigInteger 사용
        BigInteger m = new BigInteger(st.nextToken());

        System.out.println(n.divide(m));    // BigInteger 메서드 몫 구하기
        System.out.println(n.remainder(m)); // 나머지 구하기
    }

}
