package algorithm.TIL.Day6;

import java.io.*;
import java.util.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> index = new LinkedList<>();
        Queue<Integer> num = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 1; i <= n; i++) {
            index.offer(i);
            int a = Integer.parseInt(st.nextToken());
            num.offer(a);
        }

        while (!num.isEmpty()) {
            int currentNum = num.poll();
            int currentIndex = index.poll();

            System.out.print(currentIndex + " ");

            if (currentNum > 0) {
                for (int i = 0; i < currentNum; i++) {
                    index.offer(index.poll());
                    num.offer(num.poll());
                }
            } else {
                for (int i = 0; i < Math.abs(currentNum); i++) {
                    index.offer(index.poll());
                    num.offer(num.poll());
                }
            }
        }
    }
}
