package algorithm.TIL.Day6;

// 메모리 15872kb, 시간 148ms

import java.io.*;
import java.util.*;

public class BaekJoon_1244 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] switches = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 스위치 값 저장
        for(int i=0; i<n; i++){
            switches[i] = Integer.parseInt(st.nextToken());
        }

        int a = Integer.parseInt(br.readLine());

        for(int i=0; i<a; i++){
            st = new StringTokenizer(br.readLine(), " ");

            int gender = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            // 남학생인 경우
            if(gender == 1){
                for(int j=0; j<n; j++){
                    if((j+1)%num == 0){             // 스위치의 배수
                        if(switches[j] == 0){
                            switches[j] = 1;
                        }else {
                            switches[j] = 0;
                        }
                    }
                }
            // 여학생인 경우
            }else if(gender == 2){
                // 처음 스위치 바꿔주기
                if(switches[num-1] == 0){
                    switches[num-1] = 1;
                }else {
                    switches[num-1] = 0;
                }

                // 대칭 스위치들 바꿔주기
                for(int j=1; num-j-1 >= 0 && num+j-1 < n; j++){     // 양 쪽의 값이 존재할 경우 돌아가도록 조건
                    if(switches[num-j-1] == switches[num+j-1]){
                        if(switches[num-j-1] == 0){
                            switches[num-j-1] = 1;
                            switches[num+j-1] = 1;
                        }else {
                            switches[num-j-1] = 0;
                            switches[num+j-1] = 0;
                        }
                    }else {     // 끝까지 반복하지않고 대칭이 다른 경우 반복문 종료
                        break;
                    }
                }
            }
        }

        // 20개씩 출력
        for(int i=0; i<switches.length; i++){
            System.out.print(switches[i] + " ");
            if((i+1) % 20 == 0){
                System.out.println();
            }
        }

    }
}
