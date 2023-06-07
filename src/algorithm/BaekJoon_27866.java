package algorithm;
// 백준 27866번 - 새싹

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        int b = Integer.parseInt(br.readLine());

        String[] arr = a.split("");

        System.out.println(arr[b-1]);
    }
}
