package algorithm.TIL.SecondTest;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine()); // 파일의 개수
            StringTokenizer st = new StringTokenizer(br.readLine());

            ArrayList<Long> files = new ArrayList<>(); // 파일 크기를 저장할 ArrayList

            // 파일의 크기를 ArrayList에 저장
            for (int j = 0; j < K; j++) {
                files.add(Long.parseLong(st.nextToken()));
            }

            long sum = 0; // 파일을 합치는데 드는 비용을 저장할 변수

            // 파일을 합치는 과정
            while (files.size() > 1) {
                Collections.sort(files); // 파일 크기를 오름차순으로 정렬
                long merged = files.get(0) + files.get(1); // 가장 작은 두 파일을 합침
                sum += merged; // 합친 비용 더하기
                files.remove(0); // 합친 파일들을 리스트에서 제거
                files.remove(0);
                files.add(merged); // 합친 파일 크기를 리스트에 추가
            }

            System.out.println(sum);
        }
    }
}
