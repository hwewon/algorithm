package algorithm.TIL.Day3;

import java.io.*;
import java.util.*;

public class DFS_exam {
    // Scanner 객체를 이용하여 입력을 받습니다.
    private static final Scanner scanner = new Scanner(System.in);
    // 방문 여부를 체크할 배열입니다. 중복 선택을 방지합니다.
    private static boolean[] visited;
    // 수열을 저장할 리스트입니다.
    private static ArrayList<Integer> answer = new ArrayList<>();

    public static void main(String[] args) {
        // n과 m을 입력받습니다.
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        // 방문 배열의 크기를 n으로 초기화합니다.
        visited = new boolean[n];

        backTracking(0, n, m);
        scanner.close();
    }

    // 백트래킹을 수행하는 재귀 함수입니다.
    // index: 현재 위치, n: 최대 숫자, m: 수열의 길이
    public static void backTracking(int index, int n, int m) {
        // m개의 수를 모두 탐색했다면, 수열을 출력하고 재귀를 종료합니다.
        if (index == m) {
            for (int num : answer) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            // 아직 방문하지 않은 경우
            if (!visited[i]) {
                visited[i] = true; // 방문 표시
                answer.add(i + 1); // 수열에 추가
                // 다음 수를 탐색하기 위해 재귀 호출
                backTracking(index + 1, n, m);
                // 현재 위치에서 더 이상 탐색할 수 없을 때, 상태를 원래대로 복구
                visited[i] = false;
                answer.remove(answer.size() - 1); // 마지막 요소 제거
            }
        }
    }
}

